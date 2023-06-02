package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
//		char c[]=new char[100];
//		int cnt=1;
		sc.close();
		
//		for(int i=0; i<str.length();i++) {
//			c[i]= str.charAt(i);
//			if(c[i]==' ') {
//				cnt++;
//			}
//			
//		}
//		
//		System.out.print(cnt);
		
//---------------------------------------------
	//2nd:StringTokenizer
		StringTokenizer st =new StringTokenizer(str);
		int n  = st.countTokens();
		System.out.println(n);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
