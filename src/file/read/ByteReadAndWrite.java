package file.read;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ByteReadAndWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        ExecutorService fileReaderThreadPool = Executors.newCachedThreadPool();
        ArrayList<String> readfile=	readAndFragment(fileReaderThreadPool,Constants.inputFileName,Constants.chunckSize)	;
		mergeParts(readfile,Constants.outputFileName);
		

	}

 public static ArrayList<String> readAndFragment (ExecutorService fileReaderThreadPool, String inputFileName, int chunckSize ) throws IOException
 {
  //log ("File Is Reading "+ SourceFileName );
  File sourceFileName = new File (inputFileName );
  int fileSize = (int) sourceFileName.length();
  ArrayList<String> nameList = new ArrayList<String> ();
  
  System.out.println("Total File Size: "+fileSize);
  
  int numberOfChuncks = 0;
  byte[] temporary = null;
  
  try {
   InputStream inStream = null;
   int totalBytesRead = 0;
   
   try {
    inStream = new BufferedInputStream ( new FileInputStream( sourceFileName ));
    String partName=null;
    while ( totalBytesRead < fileSize )
    {
      partName ="data"+numberOfChuncks+".bin";
     int bytesRemaining = fileSize-totalBytesRead;
     if ( bytesRemaining < chunckSize ) // Remaining Data Part is Smaller Than CHUNK_SIZE
               // CHUNK_SIZE is assigned to remain volume
     {
    	 chunckSize = bytesRemaining;
      System.out.println("chunckSize: "+chunckSize);
     }
     temporary = new byte[chunckSize]; //Temporary Byte Array
     int bytesRead = inStream.read(temporary, 0, chunckSize);
     
     if ( bytesRead > 0) // If bytes read is not empty
     {
      totalBytesRead += bytesRead;
      numberOfChuncks++;
     }
     
     //write(temporary, Constants.filePath+partName);
     fileReaderThreadPool.execute(new FileReader(temporary,Constants.filePath+partName));
     nameList.add(Constants.filePath+partName);
     System.out.println("Total Bytes Read: "+totalBytesRead);
    }
    
   }
   finally {
    inStream.close();
    fileReaderThreadPool.shutdown();
   }
  }
  catch (FileNotFoundException ex)
  {
   ex.printStackTrace();
  }
  catch (IOException ex)
  {
   ex.printStackTrace();
  }
  return nameList;
 }
 
 static void write(byte[] DataByteArray, String DestinationFileName){
    try {
      OutputStream output = null;
      try {
        output = new BufferedOutputStream(new FileOutputStream(DestinationFileName));
        output.write( DataByteArray );
        System.out.println("Writing Process Was Performed");
      }
      finally {
        output.close();
      }
    }
    catch(FileNotFoundException ex){
     ex.printStackTrace();
    }
    catch(IOException ex){
     ex.printStackTrace();
    }
    catch(Exception ex){
        ex.printStackTrace();
       }
 }
 
 public static void mergeParts ( ArrayList<String> nameList, String outputFilePath )
 {
  File[] file = new File[nameList.size()];
  byte allFilesContent[] = null;
  
  int totalSize = 0;
  int numberOfFile = nameList.size();
  int fileLenght = 0;
  int currentLength=0;
  
  for ( int i=0; i<numberOfFile; i++)
  {
   file[i] = new File (nameList.get(i));
   totalSize+=file[i].length();
  }
  
  try {
   allFilesContent= new byte[totalSize]; // Length of All Files, Total Size
   InputStream inStream = null;
   
   for ( int j=0; j<numberOfFile; j++)
   {
    inStream = new BufferedInputStream ( new FileInputStream( file[j] ));
    fileLenght = (int) file[j].length();
    System.out.println(allFilesContent);
    inStream.read(allFilesContent, currentLength, fileLenght);
    currentLength+=fileLenght;
    inStream.close();
   }
   
  }
  catch (FileNotFoundException e)
  {
   System.out.println("File not found " + e);
  }
  catch (IOException ioe)
  {
   System.out.println("Exception while reading the file " + ioe);
  }
  catch (Exception ex)
  {
  ex.printStackTrace();
  }
  finally 
  {
   write (allFilesContent,outputFilePath);
  }
  
  System.out.println("Merge was executed successfully.!");
  
 }
}