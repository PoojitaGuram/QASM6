package practice;


public class P1 {
public static void main(String[] args) {
	String s1="poo ja";
	String s2="";
	char[]c1 = s1.toCharArray();
	for(int i=0;i<c1.length;i++) {
	s2=c1[i]+s2;
	}
	System.out.println(s2);
String[] s4 = s2.split(" ");
for(int i=0;i<s4.length;i++) {
	System.out.print(s4[i]);
	
		
	}

}
}



