package javaHandson;

public class Drive {

	String Car;
	
	Drive(){
		System.out.println("John has Driver a car");
	}
	
	Drive(String toDrive){
		Car=toDrive;
		System.out.println("Drive a "+toDrive);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drive drive = new Drive();
		Drive driver = new Drive("New Car");
	}

}
