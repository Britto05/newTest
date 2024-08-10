package javaHandson;

public class Employee {

	int empID;
	String empName;
	//No Argument Constructor
	
	Employee(){
		
		empID = 1;
		empName = "John";
		System.out.println("Employee object is created");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
	
		
	}

}
