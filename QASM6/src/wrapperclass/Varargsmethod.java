package wrapperclass;

public class Varargsmethod {

	public static void main(String[] args) {
		add(10,30,67,9);
		add(44,7);

	}
	public static void add(int...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
