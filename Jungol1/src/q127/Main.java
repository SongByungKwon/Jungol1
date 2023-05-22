package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		int cnt = 0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			i=sc.nextInt();
			if(i>=0&&i<=100) {
				sum += i;
				cnt++;
			}
			else {
				sc.close();
				break;
			}
			
		}
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",+sum/(double)cnt);
		
		

	}

}
