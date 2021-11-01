package heya;

public class heya {
	public void nonstatictest() {
		System.out.println("NON static");
	}
	public static void statictest() {
		System.out.println("STATIC");
	}
	

	public static void main(String[] args) {
		System.out.println("Hello");
		statictest();//to know static
		heya hello=new heya();
		hello.nonstatictest();
		int n=89;
		byte b=10;
		short s=20;
		long l=401;
		float f=50.52f;
		char c='A';
		double d=60d;
		String str="yellow claw";
		boolean blm=true;
		System.out.println(b+" "+s+" "+d+" "+l+" "+f+" "+c+" "+n+" "+blm+" "+str);
		
		
		
		

	}

}
