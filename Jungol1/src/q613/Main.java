package q613;

import java.util.Scanner;

class Mainexam {

	String Name;
	String School;
	int Grade;
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mainexam income = new Mainexam();
		
		
		income.Name =sc.next();
		income.School =sc.next();
		income.Grade =sc.nextInt();
		
		
		System.out.println("Name"+" : "+ income.Name);
		System.out.println("School"+" : "+ income.School);
		System.out.println("Grade"+" : "+ income.Grade);
		sc.close();

	}

}
