package wrapperclass;

public class PrimitivetoString {

	public static void main(String[] args) {

   int a=10;
   String s1=String.valueOf(a);
   System.out.println(s1);
   String s2="hello";
   String s3=s1.concat(s2);
   System.out.println(s3);
		
	}

}
