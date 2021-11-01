package heya;

import java.util.Scanner;

public class markstopercentage {
	private static final Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int sum=a+b+c+d;
		float percent=(sum*0.25f);
		System.out.println(percent);
		// TODO Auto-generated method stub

	}

}
