package q614;

import java.util.Scanner;

class Mainzlzl {
	String Sch = "Jejuelementary";
	String Num = "6";

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Mainzlzl school = new Mainzlzl();

		System.out.printf("%s grade in %s School\n", school.Num, school.Sch);
		school.Sch = sc.next();
		school.Num = sc.next();

		System.out.printf("%s grade in %s School", school.Num, school.Sch);
		sc.close();

	}

}