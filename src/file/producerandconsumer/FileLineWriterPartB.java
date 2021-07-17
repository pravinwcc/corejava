package file.producerandconsumer;

import java.io.File;
import java.io.PrintWriter;

public class FileLineWriterPartB implements Runnable {

	@Override
	public void run() {
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(new File("E:\\test\\TestPartB.txt"));

			while (true) {
				// Check whether end of file has been reached
				String buffer = LineReaderQueque.get();
				System.out.println(buffer);
				if (buffer.equals("FILE READING COMPLETED")) {
					break;
				}
				writer.println(buffer);
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			writer.close();
		}

	}

}