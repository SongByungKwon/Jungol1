package q598;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      
      
      char c;
      
      while(true) {
         c= sc.next().charAt(0);
         if(c>=48&&c<=57) {
            System.out.println((int)c);
         }
         else if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
            System.out.println(c);
         }
         else {
            sc.close();
            break;
         }
      }
      

   }

}