package newpack;

//import module2.Vehicle;or
import module2.*;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle b1=new Vehicle();//for this error to go we need to make Vehicle class public
		b1.move();

	}

}
