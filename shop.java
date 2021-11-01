package heya;
import java.util.Scanner;
public class shop {
	int price;
	shop(int a){
		 price=a;
		 System.out.println("Total price: "+price);
		
		
	}
	shop(int a,int b,int c){
		price=a+b+c;
		System.out.println("Total Price: "+price);
	}
	shop(int a,int b){
		price=a+b;
		System.out.println("Total Price: "+price);
	}
	private static Scanner sc =new Scanner(System.in);
	
	

	public static void main(String[] args) {
		int n=sc.nextInt();
		System.out.println("enter cost of each item purchased:");
		switch(n) {
		case 1:
			int a=sc.nextInt();
			@SuppressWarnings("unused") shop bag=new shop(a);
			break;
		case 2:
			int s=sc.nextInt();
			int b=sc.nextInt();
			@SuppressWarnings("unused") shop bag1=new shop(s,b);
			break;
		case 3:
			int z=sc.nextInt();
			int d=sc.nextInt();
			int h=sc.nextInt();
			@SuppressWarnings("unused") shop bag2=new shop(z,d,h);
			
		}
		// TODO Auto-generated method stub

	}

}
