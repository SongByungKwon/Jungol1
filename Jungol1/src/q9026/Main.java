package q9026;

public class Main {

	public static void main(String[] args) {
		int A=0;
		int B=1;
		int C=2;
		
		int D = (A!=B||A!=C||B!=C) ? 1:0; 
		System.out.print(D+" ");
		
			D = !(A==B||A==C||B==C) ? 1:0; 
			System.out.print(D+" ");
			
			D = (A==B&&A==C&&B==C) ? 1:0; 
			System.out.print(D+" ");
			
			D = !(A==B&&A==C&&B==C) ? 1:0; 
			System.out.print(D+" ");
			
	}

}
