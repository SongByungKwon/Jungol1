package q9025;

public class Main {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=2;
		
		int q=(a>=1&&b>=1) ? 1:0;
		System.out.print(q+" ");
		
		q =(a>=1||b>=1) ? 1:0;
		System.out.print(q+" ");
		
		q =(b>=1||c>=1) ? 1:0;
		System.out.print(q+" ");
		
		q =(a<=1) ? 1:0;
		System.out.print(q);
		

	}

}
