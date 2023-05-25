package q126;

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		int cut1=0;
//		int cut2=0;
//		while(true) {
//			int num=sc.nextInt();
//			if(num>0) {
//				if(num%2==0) {
//					cut2++;
//				}
//				else {
//					cut1++;
//				}
//				
//			}
//			else if(num==0) {
//				break;
//			}
//			
//		}
//		sc.close();
//		System.out.println("odd : "+cut1);
//		System.out.println("even : "+cut2);
//
//	}
//
//}

import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a= sc.nextInt();
   int cont1=0;
   int cont2=0;
   do {
     a = sc.nextInt();
      if (a %2 != 0) {
         // odd = a(i);
       cont1 ++;
       }
      else {
                 //even=a(i);
       cont2 ++;       
       }
   }while(a==0);
       System.out.println("odd :"+ cont1+"\n"+"even : "+cont2);
}}