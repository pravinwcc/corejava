package basics.serializationtest;

import java.io.*;

public class SerializeDemo
{
   public static void main(String [] args) throws ClassNotFoundException
   {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      System.out.println(e);
      
      try
      {
         FileOutputStream fileOut = new FileOutputStream("employee.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in employee.ser");
         
         FileInputStream fileIn = new FileInputStream("employee.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         in.close();
         fileIn.close();
         System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e.SSN);
	      System.out.println("Number: " + e.number);
         System.out.println(e);
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
