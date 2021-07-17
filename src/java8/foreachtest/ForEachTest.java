package java8.foreachtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ForEachTest {

	public static void main(String[] args) {
		
		//creating sample Collection
		//List<Integer> myList = new ArrayList<Integer>();
		
		List<Integer> listOfPrimes = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		listOfPrimes.stream().forEach((i) -> { System.out.println(i); });
        
		listOfPrimes.parallelStream().forEach((i) -> { System.out.println(i); });


				
		Set<Integer> myList = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) 
		myList.add(i);
		
		//traversing using Iterator
	/*	Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}*/
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				//System.out.println("forEach anonymous class Value::"+t);
			}

		});
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		//System.out.println("Consumer impl Value::"+t);
	}


}