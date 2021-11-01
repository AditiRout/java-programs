package module2;

public class Credit implements Bank {
	int mon=400;
	public void run() {
		System.out.println("people work at bank");
	}
	
	public void get(int z) {
		z=mon;
		System.out.println("money gone: "+z);
	}

}
