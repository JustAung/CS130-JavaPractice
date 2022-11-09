package Practice_Constructor;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1 = new Employee("Harry",20);

System.out.println(emp1.getName()+" ID: "+Employee.getNextID());

Employee emp2 = new Employee("Harold", 20);
System.out.println(emp2.getName()+" ID: "+Employee.getNextID());

emp1.changePayRate(30);
System.out.println(emp1.getPayRate());

	}

}
