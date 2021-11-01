package module2;

public class Debit implements Money {
	int paisa;
	Debit(int z){
		paisa=z;
		
	}
	
	public void get(int k) {
		
		System.out.println("money is debitted: "+k);//can replace k with paisa and remove k from bracket in function
	}

}
