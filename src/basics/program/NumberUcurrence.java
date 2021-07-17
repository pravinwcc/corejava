package basics.program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class NumberUcurrence {

	public static void main(String[] args) {
		String a="aab aa aa bb bb cc cc dd dd ff ff aa";
		
		String [] b=a.split(" ");
		int max=1;
		
		Map<String, Integer> mp= new HashMap<String,Integer>();
		
		for(int i=0;b.length>i;i++) {
			
			String key=b[i];
			
			if(mp.get(key)==null){
				mp.put(key,1);
			}
			else {
				Integer ii=mp.get(key);
				mp.put(key, ++ii);
			}
		}
		
		Iterator it=mp.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> ent=(Entry<String, Integer>) it.next();
			System.out.println("Key-->"+ent.getKey()+"  Values-->"+ent.getValue());
		}

	}

}
