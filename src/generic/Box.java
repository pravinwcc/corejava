package generic;

public class Box<E> {
	   private E t;

	   public void add(E t) {
	      this.t = t;
	   }

	   public E get() {
	      return t;
	   }
	   
	   public <U extends Number> void inspect(U u){
	        System.out.println("T: " + t.getClass().getName());
	        System.out.println("U: " + u.getClass().getName());
	    }

	   public static void main(String[] args) {
	      Box<Object> integerBox = new Box<Object>();
	      //Box<String> stringBox = new Box<String>();
	    
	      integerBox.add(new Integer(10));
	     // stringBox.add(new String("Hello World"));

	      System.out.printf("Integer Value :%d\n\n", integerBox.get());
	      //System.out.printf("String Value :%s\n", stringBox.get());
	      
	      integerBox.inspect(1.0);
	   }
	}