package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		char c[]=new char[100];
		int cnt=1;
		sc.close();
		
		for(int i=0; i<str.length();i++) {
			c[i]= str.charAt(i);
			if(c[i]==' ') {
				cnt++;
			}
			
		}
		
		System.out.print(cnt);
	}

}
