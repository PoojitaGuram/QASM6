package practice;

public class Vowelspresentornot {

	public static void main(String[] args) {
		String s1="welcome";
		char[]c1=s1.toCharArray();
		int count=0;
		for(int i=0;i<c1.length;i++) {
			if(c1[i]=='a'||c1[i]=='e'||c1[i]=='i'||c1[i]=='o'||c1[i]=='u') {
				count++;
				break;
			}
		}
			if(count==1) {
				System.out.println("vowels are present");
			}
		}
	}

