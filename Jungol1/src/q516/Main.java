package q516;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double d = sc.nextDouble();
      double o = sc.nextDouble();
      char c = sc.next().charAt(0);
      sc.close();
      
      System.out.printf("%.2f\n", d);
      System.out.printf("%.2f\n", o);
      System.out.printf("%c\n", c);

   }

}