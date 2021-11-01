package heya;

import java.util.Scanner;


public class stack {
	static int  top=-1;
	static int []s=new int[100];
	static int pop() {
		if(top<0) {
			System.out.println("Underflow");
			return 0;
		}
		else {
			int x=s[top--];
			return x;
		}
	}
	static void push(int a) {
		if(top>=100) {
			System.out.println("overflow");
			
		}
		top+=1;
		s[top]=a;
	}
	static void peek() {
		int z=s[top];
		System.out.println(z);
	}
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int z=sc.nextInt();
			push(z);
		}
		while(top!=-1) {
			int k=pop();
			System.out.println(k);
		}
		peek();
		
		// TODO Auto-generated method stub

	}

}
