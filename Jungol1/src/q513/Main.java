package q513;

public class Main {

	public static void main(String[] args) {
		double yd= 2.1;
		double in= 10.5;
		double cm= 0;
		double ydcm= 91.44;
		double incm= 2.54;
		cm=yd*ydcm;
		System.out.printf("%4.1fyd = %5.1fcm\n",yd,cm);
		cm=in*incm;
		System.out.printf("%4.1fin = %5.1fcm\n",in,cm);
	}

}
