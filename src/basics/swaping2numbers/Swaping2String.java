package basics.swaping2numbers;

public class Swaping2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="pravin";
		String str2="kumar";
		System.out.println(str1);
		System.out.println(str2);
		
		str1=str2+str1;
		
		str2=str1.substring(str2.length(),str1.length());
		str1=str1.substring(0,str2.length()-1);
		
		System.out.println(str1);
		System.out.println(str2);

	}

}
