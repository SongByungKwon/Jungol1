package q571_3;
import java.util.Scanner;

class StringPrint {
   String str;
   int num;

   StringPrint() {
      str = "~!@#$^&*()_+|";
      num = 0;
   }
   
//   void input(int num) {
//      this.num = num;
//   }
   void setNum(int num) {
      this.num = num;
   }

   void printStr() {
      for (int i = 0; i < num; i++) {
         System.out.println(str);
      }
   }
}

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int inp = sc.nextInt();
      sc.close();

      StringPrint print = new StringPrint();

//      print.input(inp);
      print.setNum(inp);
      print.printStr();
   }
}