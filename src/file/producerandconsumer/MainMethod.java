package file.producerandconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainMethod {

	public static void main(String[] args) {
		
		// Thread Pools to read and write in different files
		ExecutorService pExecuter = Executors.newSingleThreadExecutor();
		ExecutorService partFileExecuter = Executors.newFixedThreadPool(3);
		
		FileLineReader reader = new FileLineReader();
		pExecuter.execute(reader);

		
		FileLineWriterPartA partAWriter = new FileLineWriterPartA();
		partFileExecuter.execute(partAWriter);
		
		FileLineWriterPartB partBWriter = new FileLineWriterPartB();
		partFileExecuter.execute(partBWriter);
		
		
		FileLineWriterPartC partCWriter = new FileLineWriterPartC();
		partFileExecuter.execute(partCWriter);

		//Executer Service Shutdown code
		pExecuter.shutdown();
		partFileExecuter.shutdown();
		

	}

}