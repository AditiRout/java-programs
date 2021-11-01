package heya;

public class Chain {
	int smarks;
	public String sname;
	Chain(){
		this("Megha");
	}
	Chain(String name){
		this(name,70);
		
	}
	Chain(String name,int marks){
		this.smarks=marks;
		this.sname=name;
	}
	public static void dislay() {
		System.out.println("printing out: ");
		//smarks=78;this doesnt work here..as it is static method
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain student=new Chain();
		System.out.println(student.sname);
		System.out.println(student.smarks);
		Chain.dislay();//can call this way as well
		Chain stu=new Chain("alsi",89);
		System.out.println(stu.sname);

	}

}
