package basics.labeledforloop;

import java.util.ArrayList;
import java.util.List;

public class LabeledForExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list= new ArrayList<>(); 
		List<String> list1= new ArrayList<>();
		List<String> list2= new ArrayList<>();
		List<String> list3= new ArrayList<>();
		list.add("A");list.add("B");list.add("C");list.add("D");list.add("E");list.add("F");
		list1.add("A");list1.add("B");list1.add("C");list2.add("D");list2.add("E");list2.add("F");
		for (String str:list) {
			inner:{
			
		
				for (String str1:list1) {
				if (str.equals(str1)) {
					list3.add(str);
					break inner;
				}
				
				}
				for(String str2:list2) {
					if (str.equals(str2)) {
						list3.add(str);
						break inner;
					}
				
				}
				}
			}
		System.out.println(list3);
	}
}