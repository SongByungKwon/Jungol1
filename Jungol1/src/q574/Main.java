package q574;

import java.util.Scanner;


class Max {
	
	int num1,num2,num3;
	
	void setNum(int num1,int num2, int num3) {
		this.num1 =num1;
		this.num2 =num2;
		this.num3 =num3;
		
		if(num1>num2&&num1>num3) {
			System.out.println(num1);
		}
		else if(num2>num1&&num2>num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
		}
	}
	
	



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Max max= new Max();
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		
		max.setNum(num1,num2,num3);
		sc.close();
		
		
		
		

	}

}
