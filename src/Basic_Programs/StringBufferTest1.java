package Basic_Programs;

public class StringBufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		//new capacity = (current capacity+1)*2=34
		
		StringBuffer sb1 = new StringBuffer(1000);
		System.out.println(sb1.capacity());
		
		StringBuffer sb2=new StringBuffer("durga");
		System.out.println(sb2.capacity());//capacity=s.length()+16=21
		
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.charAt(3));
		//System.out.println(sb2.charAt(30)); StringIndexOutOfBoundsException
	
		sb2.setCharAt(2, 'Y');
		System.out.println(sb2);
		
		sb2.append("software");//overloaded method
		System.out.println(sb2);
		sb2.append(!true);//boolean value
		System.out.println(sb2);
		
		System.out.println(sb2.insert(5, "xyz"));//overloaded method- to insert in between
		
		System.out.println(sb2.delete(1, 2));
		System.out.println(sb2.deleteCharAt(2));
		
		System.out.println(sb2.reverse());
		System.out.println(sb2);
		
		
		StringBuffer sb3= new StringBuffer("AiswaryaAbhi");
		sb3.setLength(8);
		System.out.println(sb3);
		
		
	}
}
