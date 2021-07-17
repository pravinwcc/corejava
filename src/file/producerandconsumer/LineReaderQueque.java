package file.producerandconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LineReaderQueque {

	public static Queue<String> lineHandlerQueque = null;
	static {
		lineHandlerQueque = new ConcurrentLinkedQueue<String>();
	}

	public static synchronized void put(String line) {

		if (null != lineHandlerQueque && null != line)
			lineHandlerQueque.offer(line);
	}

	public static synchronized String get() {

		if (null != lineHandlerQueque.peek() && !lineHandlerQueque.peek().equals("FILE READING COMPLETED")) 
			return lineHandlerQueque.poll();
		else{
			if(null == lineHandlerQueque.peek()) return "DATA NOT FOUND";
			else return lineHandlerQueque.peek();
		}
		//return null;
		

	}
}
