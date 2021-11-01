package module2;

public class Cars extends Vehicle {
	public void move() {
		System.out.println("in car class");
	}
	String yes="car keys";
	Cars(){
		System.out.println("I am a car");
	}
	void printit() {
		System.out.println(yes);
		System.out.println(super.yes);//goes to its parent
	}
	public static void main(String[] args) {
		Cars c1=new Cars();
		c1.move();
	}

}
