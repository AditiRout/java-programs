package heya;

public class Constructor {
	int p;
	Constructor(){
		p=80;
		//default constructor created
		
	}
	Constructor(int z){
		p=z;//parameterized constructor created
	}

	public static void main(String[] args) {
		Constructor pen=new Constructor(50);
		Constructor blue=new Constructor(23);
		//Constructor pen=new Constructor();
		//Constructor blue=new Constructor();
		System.out.println(pen.p+" "+blue.p);
		
		// TODO Auto-generated method stub

	}

}
