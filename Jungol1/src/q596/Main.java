package q596;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char[] arr = new char[100];
      String s = sc.next();
      int ln = s.length();
      int num = sc.nextInt();
      sc.close();

      for (int i = 0; i < ln; i++) {
         arr[i] = s.charAt(i);
      }
      if (num > ln) {
         num = ln;
      }
      for (int i = ln - 1; i >= ln - num; i--) {
         System.out.print(arr[i]);
      }
   }
}