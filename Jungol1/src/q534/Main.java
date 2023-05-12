//package q534;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char e= sc.next().charAt(0);
//		sc.close();
//		
//		if(e=='A') {
//			System.out.println("Excellent");
//		}
//		else if(e=='B') {
//			System.out.println("Good");
//		}
//		else if(e=='C') {
//			System.out.println("Usually");
//		}
//		else if(e=='D') {
//			System.out.println("Effort");
//		}
//		else if(e=='F') {
//			System.out.println("Failure");
//		}
//		else  {
//			System.out.println("error");
//		}
		package q534;

		import java.util.Scanner;

		public class Main {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				char e= sc.next().charAt(0);
				sc.close();
		switch(e) {
		case 65 :
			System.out.println("Excellent");
			break;
		case 66 :
			System.out.println("Good");
			break;
		case 67 :
			System.out.println("Usually");
			break;
		case 68 :
			System.out.println("Effort");
			break;
		case 70 :
			System.out.println("Failure");
			break;
			default :
				System.out.println("error");
		}
	}
}
