package wrapperclass;

public class Boxing {

	public static void main(String[] args) {
		
	 
		int a=13;
		Integer a1=a;
		System.out.println(a1);//autoboxing 
		int b=14;
		Integer b1=Integer.valueOf(b);
		System.out.println(b1);//expilicitly boxing
		
	}

}
