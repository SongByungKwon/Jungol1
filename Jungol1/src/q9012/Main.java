package q9012;

public class Main {

	public static void main(String[] args) {
		int a=5;
		int b=2;
		double c=3.140000;
		double d= a*b*c;
		System.out.printf("원주 = %d * %d * %.6f = %.6f\n",a,b,c,d);
		b=5;
		d=a*b*c;
		System.out.printf("넓이 = %d * %d * %.6f = %.6f",a,b,c,d);
	}

}
