package heya;

import java.util.Scanner;
import java.lang.Math;



public class method {
	int instance ;
	public int sum(int a,int b) {
		instance=45;
		System.out.println(this.instance);
		return a+b;
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner stc=new Scanner(System.in);
		method value = new method();
		int a=stc.nextInt();
		int b=stc.nextInt();
		int z=value.sum(a, b);//method called here
		System.out.println("ans is "+z);
		System.out.println(Math.pow(a, b));
		
		
		// TODO Auto-generated method stub

	}

}
