package q616;

import java.util.Scanner;

class Mainexe {
   int x1,x2,x3,y1,y2,y3;

}

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Mainexe sam = new Mainexe();
      
      sam.x1 =sc.nextInt();
      sam.y1 =sc.nextInt();
      
      sam.x2 =sc.nextInt();
      sam.y2 =sc.nextInt();
      
      sam.x3 =sc.nextInt();
      sam.y3 =sc.nextInt();
      sc.close();
      
      System.out.printf("(%.1f, %.1f)",(sam.x1+sam.x2+sam.x3)/ (double)3, (sam.y1+sam.y2+sam.y3)/ (double)3);
      
   }

}