package file.producerandconsumer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader implements Runnable {

	@Override
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("E:\\test\\test.txt")));
			String buffer = null;
			while ((buffer = br.readLine()) != null) {
				LineReaderQueque.put(buffer);
				//System.out.println(buffer);
			}
			LineReaderQueque.put("FILE READING COMPLETED"); // When end of file has been reached

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}