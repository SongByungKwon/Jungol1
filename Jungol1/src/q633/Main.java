package q633;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (true) {
         System.out.printf("1. Korea\n");
         System.out.printf("2. USA\n");
         System.out.printf("3. Japan\n");
         System.out.printf("4. China\n");
         System.out.printf("number? ");
         int num = sc.nextInt();
         System.out.println("\n");
         switch (num) {
         case 1:
            System.out.println("Seoul\n\n");
            break;
         case 2:
            System.out.println("Washington\n\n");
            break;
         case 3:
            System.out.println("Tokyo\n\n");
            break;
         case 4:
            System.out.println("Beijing\n\n");
            break;
         default:
            System.out.print("none");
            System.exit(0);
            sc.close();

         }
      }
      

   }

}