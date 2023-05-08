package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int i= 0;
		
		while(true) {
			i= sc.nextInt();
			if(i%3 ==0) {
				System.out.println(i/3);
			}
			else if(i<0) {
				break;
			}
	}
		sc.close();

}
}

