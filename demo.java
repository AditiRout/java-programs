package heya;

public class demo {
	int id;
	String name;
	demo(int id,String name){//this keyword used as local variable and instance variables are same in words
		this.id=id;
		this.name=name;
	}
	void display() {
		add(this);//calls the add function for c1 and c2 respectively
		System.out.println("info is : "+id+" "+name);
	}
	void add(demo c) {
		System.out.println("just checking the use of demo class and this in a method");
	}

	public static void main(String[] args) {
		demo c1=new demo(234,"ansit");
		demo c2=new demo(235,"neha");
		c1.display();
		c2.display();
		c1.add(c1);
		
		
		// TODO Auto-generated method stub

	}

}
