package module2;

public class Employee extends Manager{
//single inheritance example
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.salary=100000;
		System.out.println(emp.salary);
		Manager man=new Manager();
		man.salary=900000;
		System.out.println("manager ki salary: "+man.salary);

	}

}
