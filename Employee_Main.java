package Practice_Constructor;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1 = new Employee("Harry",20);

System.out.println(emp1.getName()+" ID: "+emp1.getEmployeeID());

Employee emp2 = new Employee("Harold", 20);
System.out.println(emp2.getName()+" ID: "+emp2.getEmployeeID());

emp1.changePayRate(30);
System.out.println(emp1.getPayRate());

	}

}
