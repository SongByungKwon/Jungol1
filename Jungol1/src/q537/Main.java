package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();   
		sc.close();
		int i=0;         
		int hap = 0;     
		if(num<=100) {
		while(i<num) {             //while문
			i++;
			hap=hap +i;
		}
		System.out.println(hap);

	}

}
		}


//for(i =0; i<=num;i++) {            //for문
//	hap=hap +i;
//}
//System.out.println(hap);
//
//}
//
//}
//		}


//do {                      // do-while문
//	i++;
//	hap=hap+i;
//}while(i<num);
//System.out.println(hap);
//
//	}
//	
//}
//		}