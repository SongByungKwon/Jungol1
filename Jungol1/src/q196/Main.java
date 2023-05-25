package q196;

import java.util.Scanner;

class P {
	String name[] = new String[3];
	String tel[] = new String[3];
	String addr[] = new String[3];
	char A[] = new char[3];

	int cnt = 0;

	public void Input(String name, String tel, String addr) {
		this.name[cnt] = name;
		this.tel[cnt] = tel;
		this.addr[cnt] = addr;
		this.cnt = cnt;

		this.A[cnt] = this.name[cnt].charAt(0);
		this.cnt++;
	}

	public void print() {
		if (A[0] <= A[1] && A[0] <= A[2]) {
			System.out.println("name : "+name[0]);
			System.out.println("tel : "+tel[0]);
			System.out.println("addr : "+addr[0]);
			
		} else if (A[1] <= A[0] && A[1] <= A[2]) {
			System.out.println("name : "+name[1]);
			System.out.println("tel : "+tel[1]);
			System.out.println("addr : "+addr[1]);
			
		}
		else if (A[2] <= A[0] && A[2] <= A[1]) {
			System.out.println("name : "+name[2]);
			System.out.println("tel : "+tel[2]);
			System.out.println("addr : "+addr[2]);
		}
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name[] =new String[3];
		String tel[] =new String[3];
		String addr[] =new String[3];
	
		P pc= new P();
		
		for(int i=0;i<name.length;i++) {
			name[i]= sc.next();
			tel[i]= sc.next();
			addr[i]= sc.next();
			pc.Input(name[i], tel[i], addr[i]);
		}
		pc.print();
		sc.close();
	}

}
