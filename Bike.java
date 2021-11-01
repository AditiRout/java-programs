package module2;

public class Bike extends Vehicle{
	//can overwrite as well
	public void display() {
		System.out.println("inside the bike class..statement changed with help of inheritance");
	}

	public static void main(String[] args) {
		Bike honda=new Bike();
		honda.wheels=2;
		honda.display();
		// TODO Auto-generated method stub

	}

}
