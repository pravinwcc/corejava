package basics.runtimeclasstest;

import java.io.IOException;

public class RuntimeClassTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.freeMemory());
		System.out.println(rt.maxMemory());
		System.out.println(rt.totalMemory());
		System.out.println(rt.availableProcessors());
		rt.runFinalization();
		rt.exec("notepad");
		rt.exec("notepad");
		// Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");    //shutdown system
		 Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -r -t 0"); //restart

	}

}
