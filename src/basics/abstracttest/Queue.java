package basics.abstracttest;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {

	List<T> queue = new LinkedList<>();

	public void push(T element) {
		// Implement this
		queue.add(element);

	}

	public T pop() {//O(1)
		T element=null;
		if (queue != null && queue.size() > 0){
			element=(T)queue.get(0);
			queue.remove(0);
		}
		return element;
	}

}