package module2;

public class Shapeutility {

	public static void main(String[] args) {
		Shape circle=new Circle();//if such thing exists then both methods from circle and shape can be called
		float z=circle.area();
		circle.print(z);
		circle.display();
		// TODO Auto-generated method stub

	}

}
