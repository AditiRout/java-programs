package module2;
interface Money {
	
	void get(int z);
	//default r allowed
	default void fun() {
		won();
		System.out.println("inside a default method");
		
	}
	private static void won() {
		System.out.println("this is a static method");
	}
	static void lol() {
		System.out.println("this is a static function");
	}

}
