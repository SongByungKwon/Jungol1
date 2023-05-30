package q576;

import java.util.Scanner;

 class Four {
	
	int Num1, Num2;
	char C;
	
	
	public void setfour(int Num1, char C,int Num2) {
		this.Num1 =Num1;
		this.C =C;
		this.Num2 = Num2;
	}
	
	public void getfourp(int Num1, char C,int Num2) {
		System.out.printf("%d %s %d = %d",Num1,C,Num2,Num1+Num2);
	}
	
	public void getfourm(int Num1, char C,int Num2) {
		System.out.printf("%d %s %d = %d",Num1,C,Num2,Num1-Num2);
	}
	
	public void getfourg(int Num1, char C,int Num2) {
		System.out.printf("%d %s %d = %d",Num1,C,Num2,Num1*Num2);
	}
	
	public void getfourn(int Num1, char C,int Num2) {
		System.out.printf("%d %s %d = %d",Num1,C,Num2,Num1/Num2);
	}
	
	
	public void getfourr(int Num1, char C,int Num2) {
		System.out.printf("%d %s %d = %d",Num1,C,Num2,0);
	}
	

}


public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num1 = sc.nextInt();
		char c = sc.next().charAt(0);
		int num2 =sc.nextInt();
		sc.close();
		
		Four four = new Four();
		
		four.setfour(num1, c, num2);
		
		if(c == '+') {
			four.getfourp(num1, c, num2);
			
		}
		else if(c =='-') {
			four.getfourm(num1, c, num2);
		}
		else if(c == '*') {
			four.getfourg(num1, c, num2);
		}
		else if(c == '/') {
			four.getfourn(num1, c, num2);
		}
		else {
			four.getfourr(num1, c, num2);
		}
		
		
		
		
		
		

	}

}
