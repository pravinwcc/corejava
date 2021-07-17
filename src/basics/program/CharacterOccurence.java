package basics.program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CharacterOccurence {

	public static void main(String[] args) {
		String a="9654535336";
		
		char [] b=a.toCharArray();
		
		TreeMap<Character,Integer> tree= new TreeMap<Character, Integer>();
		
		for(int i=0;b.length>i;i++) {
			
			char key=b[i];
			if(tree.get(key)==null){
				tree.put(key,1);
			}
			else {
				Integer ii=tree.get(key);
				tree.put(key, ++ii);
			}
		}
		Set<Entry<Character, Integer>> ss=tree.entrySet();
		for(Map.Entry<Character, Integer> ent:ss){
			System.out.println("Key-->"+ent.getKey()+"  Values-->"+ent.getValue());
		}
	}

}
