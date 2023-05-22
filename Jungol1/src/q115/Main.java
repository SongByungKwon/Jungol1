package q115;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      
      int ik = sc.nextInt();
      int im = sc.nextInt();
      
      int jk = sc.nextInt();
      int jm = sc.nextInt();
      
      sc.close();
      
      boolean b=(ik>jk&&im>jm) ? true:false;
      System.out.println(b);
   }

}