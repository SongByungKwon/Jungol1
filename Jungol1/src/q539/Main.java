package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int sum =0;
		int sump=0;
		while(true) {
			int inp = sc.nextInt();
			sum +=inp;
			sump++;
			if(inp>=100) {
				break;
			}
		}
		sc.close();
		
		System.out.println(sum);
		System.out.printf("%.1f",sum/(double)sump);
		
		
}
}