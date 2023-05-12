package q558;

//import java.util.Scanner;
//
//public class Main2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[]ar = new int[100];
//		int inp=0, idx=0;
//		do {
//			inp = sc.nextInt();
//			ar[idx++] =inp;
//		}while(inp !=0);
//		sc.close();
//		for(int i=idx-;i>=0;i--) {
//			System.out.print(ar[i]+ " ");
//		}
//	}
//
//}
//------------------------------------------
//import java.util.Scanner;
//
//public class Main2 {
//
//   public static void main(String args[]) {
//      Scanner sc = new Scanner(System.in);
//      int[] arr = new int[100];
//
//      for (int i = 0; i < arr.length; i++) {
//         arr[i] = sc.nextInt();
//         if (arr[i] == 0)
//            break;
//      }
//
//      for (int i = arr.length - 1; i >= 0; i--) {
//         if (arr[i] != 0)
//            System.out.print(arr[i] + " ");
//      }
//      sc.close();
//   }
//}
//-------------------------------
//import java.util.Scanner;
//
//public class Main2 {
//
//   public static void main(String[] args) {
//      // TODO Auto-generated method stub
//      Scanner sc =new Scanner(System.in);
//      
//      int []num = new int[100];
//      
//
//      for(int i=0;i<num.length;i++) {
//         num[i]=sc.nextInt();
//         
//         if(num[i]==0) {
//            for(int j=i-1;j>=0;j--) {
//               
//               System.out.print(num[j]+" ");
//            }
//            sc.close();
//            break;
//
//         
//         }
//
//         
//         
//      }
//      
//      
//     
//
//   }
//
//}
//----------------------------------------------
import java.util.Scanner;

public class Main2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);

      int[] a = new int[100];

      for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();

         if (a[i] == 0) {
            for(int j = i-1; j >=0; j--) {
               System.out.print(a[j]);
               
            }
            sc.close();
            break;
         }
            
      }
   }
}
