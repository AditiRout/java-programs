package module2;

public class Automobilemanage  {
//polymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars bmv=new Cars();//Cars()comes to action
		bmv.move();
		bmv.wheels=4;
		Vehicle v1=new Vehicle();
		v1.move();
		Vehicle v2=bmv;//as vehicle written..so Vehicle()comes to action
		Vehicle v3=new Cars();//falls under class
		v2.move();//as under cars 
		v3.move();
		Bike b=new Bike();
		b.wheels=2;
		b.display();
		bmv.printit();
		
		

	}

}
