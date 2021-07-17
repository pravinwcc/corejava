package java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Path path = Paths.get("c:/temp", "data.txt");
	    //The stream hence file will also be closed here
	    try(Stream<String> lines = Files.lines(path)){
	        Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
	        if(hasPassword.isPresent()){
	            System.out.println(hasPassword.get());
	        }
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}