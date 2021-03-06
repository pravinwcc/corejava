package basics.classloader;


/**
 * Java program to demonstrate How ClassLoader works in Java, in particular
 * about visibility principle of ClassLoader.
 *
 * @author Javin Paul
 */

public class ClassLoaderTest {

	public static void main(String args[]) {
		try {
			// printing ClassLoader of this class
			System.out.println("ClassLoaderTest.getClass().getClassLoader() : "
					+ ClassLoaderTest.class.getClassLoader());

			// trying to explicitly load this class again using Extension class
			// loader
			//Will work fine
			Class.forName("basics.classloader.ClassLoaderTest", true, ClassLoaderTest.class.getClassLoader());
			
			// Will throw java.lang.ClassNotFoundException
			Class.forName("basics.classloader.ClassLoaderTest", true, ClassLoaderTest.class.getClassLoader().getParent());
		
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
