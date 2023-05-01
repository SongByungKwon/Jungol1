package q515;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		if(num1>=num2) {
		System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
		}
//		else  {
//			System.out.printf("%d * %d = %d\n",num2,num1,num2*num1);
//			System.out.printf("%d / %d = %d\n",num2,num1,num2/num1);
//		}
		else  {
			
//			int m=num2 -num1;
//			num2 =num2 -m;
//			num1 = num1 +m;
			
			int imp  =num1;
			num1 =num2;
			num2 = imp;
			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
		}
		
	}
}


