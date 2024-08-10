package javaHandson;

public class Animals {

	String Animal_Name;
	String Animal_Type;
	//Parameterized constructors
	Animals(String name,String Type){
		
		Animal_Name=name;
		Animal_Type=Type;
		
	}
	
	public void findType() {
		
		System.out.println("The Animal Name is "+Animal_Name+" Animal Type is "+Animal_Type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals animals1 = new Animals("Dog", "House Security");
		animals1.findType();
		Animals animals2 = new Animals("Cow", "Give the Milk");
		animals2.findType();
		
		
	}

}
