package Basic_Programs;

public class StringTest2 {

	public static void main(String[] args) {
		char[] ch= {'j','a','v','a'};
		String s3="";
		String s4="MANDar";
		String s5="mandaR";
		String s6="  mandar  ";
		String s7=" m a nd a r";
		String s1=new String("durga");
		String s2=new String("durga");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));//true


		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2=new StringBuffer("durga");
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2));//false
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.concat("software"));
		System.out.println(s1);
		s1=s1.concat("software");
		System.out.println(s1);
		
		System.out.println("equals() method example");
		System.out.println(s1.equals("durgasoftware"));
		System.out.println(s1.equals("Durgasoftware"));
		System.out.println(s1.equalsIgnoreCase("Durgasoftware"));
		
		System.out.println("isEmpty() example");
		System.out.println(s3.isEmpty());
		System.out.println(s1.isEmpty());
		
		System.out.println("length() example");
		System.out.println(s1.length());
		System.out.println(s3.length());
		System.out.println(ch.length);
		
		System.out.println("repace() example");
		System.out.println(s1.replace('a', 'b'));
		
		System.out.println("substring() example");
		System.out.println(s1.substring(3));//Method overloaded
		System.out.println(s1.substring(3, 4));
		
		System.out.println("indexof() example");
		System.out.println(s1.indexOf('d'));//if character availabe multiple times it returns index of first character
		System.out.println(s1.indexOf('l'));//if character not available it returns -1
		System.out.println(s4.lastIndexOf('a'));
		
		System.out.println("lowercase() example");
		System.out.println(s4.toLowerCase());
		
		System.out.println("uppercase() example");
		System.out.println(s5.toUpperCase());
		
		System.out.println("trim() example");
		System.out.println(s6.trim());
		System.out.println(s6.length());
		System.out.println(s6.trim().length());
		System.out.println(s7.trim());
		System.out.println(s7.trim().length());

	}

}
