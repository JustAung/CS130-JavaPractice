package Practice_Constructor;
//Class and Attributes
public class Person {
private String name;
private int age;
//Class Constructor
public Person(String initialName) {
	this.name= initialName;
	this.age=0;
}
//Methods
public void printPerson() {
	System.out.println(this.name+",age"+this.age+"years");
}
public String getName() {
	return this.name;
}
}
