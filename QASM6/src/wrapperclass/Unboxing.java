package wrapperclass;

public class Unboxing {

	public static void main(String[] args) {
	 Integer i1=20;
	 int i2=i1;
	 System.out.println(i2);//autounboxing
	 Integer i3=30;
	 int i4=i3.intValue();
	 System.out.println(i4);//unboxing

	}

}
