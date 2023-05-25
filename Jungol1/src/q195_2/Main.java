package q195_2;

import java.util.Scanner;

class cap {

	private String name;
	private String tel;
	private String addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 100) {
			this.name = null;
			return;
		} else {
			this.name = name;
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel.length() > 100) {
			this.tel = null;
			return;
		} else {
			this.tel = tel;
		}
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		if (addr.length() > 100) {
			this.addr = null;
			return;
		} else {
			this.addr = addr;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		sc.close();

		cap myCap = new cap();

		myCap.setName(str1);

		System.out.println("name : " + myCap.getName());

		myCap.setTel(str2);

		System.out.println("tel : " + myCap.getTel());

		myCap.setAddr(str3);

		System.out.println("addr : " + myCap.getAddr());
	}

}
