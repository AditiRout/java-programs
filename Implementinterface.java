package module2;

public class Implementinterface {

	public static void main(String[] args) {
		Money m=new Debit(450);
		m.get(56);
		Bank n=new Credit();//when a single class and 2 interfaces
		n.run();
		n.get(67);//comes to effect if ..67 changes to 400
		m.fun();//how to call private in default
		Money.lol();
		
		// TODO Auto-generated method stub

	}

}
