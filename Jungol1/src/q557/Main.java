package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char c[]=new char[10];
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<c.length;i++) {
			c[i] = sc.next().charAt(0);
		}
		System.out.printf("%c %c %c",c[0],c[3],c[6]);
		sc.close();

	}

}

///////////////////////////////////////////////////////////////
//import java.util.Scanner;
//
//public class Main {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      char num[] = new char[10];
//
//      for (int m = 0; m < 10; m++) {
//         num[m] = sc.next().charAt(0);
//         switch (m) {
//         case 0:
//         case 3:
//         case 6:
//            System.out.print(num[m] + " ");
//            break;
//         }
//      }
//      sc.close();
//   }
//}
/////////////////////////////////////////////////////
//import java.util.Scanner;
//
//public class Main {
//
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//
//      char[] cList = new char[10];
//      
//      for (int i = 0; i < cList.length; i++) {
//         cList[i] = sc.next().charAt(0);
//
//         if (i == 0 || i == 3 || i == 6) {
//            System.out.print(cList[i] + " ");
//         }
//      }
//      sc.close();
//
//   }
//
//}
