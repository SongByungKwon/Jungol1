package q560;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int max [] = new int[10];
      for(int i=0; i<max.length;i++) {
         max[i] =sc.nextInt();
      }
      
      int min = max[0];
      
      for(int i=0; i<max.length;i++) {
         if(min>max[i]) {
            min=max[i];
         }
      }
      System.out.print(min);
      sc.close();
   }

}