package q195;

import java.util.Scanner;

class Main2 {
	String name;
	String tel;
	String addr;
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main2 zxc =new Main2();
		
		
		zxc.name=sc.next();
		zxc.tel=sc.next();
		zxc.addr=sc.next();
		sc.close();
		
		System.out.println("name : "+zxc.name);
		System.out.println("tel : "+zxc.tel);
		System.out.println("addr : "+zxc.addr);
		
		

	}

}
