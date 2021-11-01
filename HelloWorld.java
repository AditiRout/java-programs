package heya;

public class HelloWorld {
	Integer instanceVariable=90;//cannot be manipulated and need object to be called and can be initialised
	static Integer staticvariable=20;//can be manipulated
	private void nonstatic() {
		Integer localvariable=20;
		System.out.println(localvariable);
		
	}
	static void statictest() {
		System.out.println("non");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statictest();
		HelloWorld yo=new HelloWorld();
		yo.instanceVariable=300;
		yo.nonstatic();
		System.out.println(yo.instanceVariable);
		staticvariable=90;//without class also works
		System.out.println(staticvariable);
		HelloWorld.staticvariable=100;
		System.out.println(staticvariable);//need just the class
	}

}
