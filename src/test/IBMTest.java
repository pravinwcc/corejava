package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class IBMTest {
	static String str = "left sock->pants\n"
			+ "pants->belt\n"
			+ "suit jacket->left shoe\n"
			+ "suit jacket->right shoe\n"
			+ "left shoe->overcoat\n"
			+ "right sock->pants\n"
			+ "right shoe->overcoat\n"
			+ "tshirt->suit jacket\n"
			+ "tshirt->dress shirt\n"
			+ "dress shirt->pants\n"
			+ "dress shirt->suit jacket\n"
			+ "tie->suit jacket\n"
			+ "pants->suit jacket\n"
			+ "belt->suit jacket\n"
			+ "suit jacket->overcoat\n"
			+ "dress shirt->tie\n"
			+ "suit jacket->sun glasses\n"
			+ "sun glasses->overcoat\n";
			
	public static void main(String[] arg) {
		Map<String,ArrayList> hm = new HashMap<String,ArrayList>();
		StringTokenizer st = new StringTokenizer(str, "\n");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(token, "->");
			String token1 = st2.nextToken();
			String token2 = st2.nextToken();
			
			ArrayList al = new ArrayList();
			al.add(token1);
			ArrayList items = hm.get(token2);
			
			if (items == null)
				hm.put(token2, al);
			else
				items.add(token1);
			
			if (hm.get(token1) == null)
				hm.put(token1, null);
			//System.out.println(token1+"......."+token2);
			//System.out.println(st2);
		}
		System.out.println(hm.size());
		
		Set<String> key = hm.keySet();
		Iterator<String> itr = key.iterator();
		
		ArrayList<String> al = new ArrayList<String>();
		String token;
		while (itr.hasNext()) {
			token = itr.next();
			
			ArrayList altemp = hm.get(token);
			if (altemp == null && !al.contains(token))
				al.add(token);
			else look(token, altemp, al, hm);
				
		}
		System.out.println(al.size());
		System.out.println(al);
	}
	
	static void look(String token, ArrayList list, ArrayList origlist, Map hm) {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()){
			String value = itr.next();
			
			ArrayList altemp = (ArrayList)hm.get(value);
			if (!origlist.contains(value) && altemp !=null)
				look(value, altemp, origlist, hm);//origlist.add(value);
			else if (!origlist.contains(value))
				origlist.add(token);
			
			/*else if (altemp == null && origlist.contains(value))
				continue;
			else look(altemp, origlist, hm);*/
		}
	}

}
