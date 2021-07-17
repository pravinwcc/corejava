package basics.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class Test {
	static public void main(String[] args) {

		/*
		 * Map hashMap= new HashMap();
		 * 
		 * Map weakHashMap = new WeakHashMap();
		 * 
		 * String keyHashMap = new String("keyHashMap"); String keyWeakHashMap =
		 * new String("keyWeakHashMap");
		 * 
		 * hashMap.put(keyHashMap, "Ankita"); weakHashMap.put(keyWeakHashMap,
		 * "Atul"); System.gc();
		 * System.out.println("Before: hash map value:"+hashMap
		 * .get("keyHashMap")
		 * +" and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
		 * keyHashMap = null; keyWeakHashMap = null; System.gc();
		 * System.out.println
		 * ("After: hash map value:"+hashMap.get("keyHashMap")+
		 * " and weak hash map value:"+weakHashMap.get("keyWeakHashMap"));
		 */

		Set st = new HashSet();
		st.add("a");

		System.out.println(st.add("a"));
		

	}
}

