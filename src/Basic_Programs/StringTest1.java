package Basic_Programs;

public class StringTest1 {

	public static void main(String[] args) {

		String s = new String ("durga");
		s.concat("software");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer ("durga");
		sb.append("software");
		System.out.println(sb);
	}

}
