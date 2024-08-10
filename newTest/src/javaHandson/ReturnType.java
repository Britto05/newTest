package javaHandson;

public class ReturnType {

	Integer collectedAmount = 1000;
	String collectedFrom = "Udhaya";
	
	public Integer sonCollected() {
		
		System.out.println("Dad i'm Collect the amount Rs."+ collectedAmount+ " collected from "+collectedFrom +" and i will sent to you");
		return collectedAmount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType amount = new ReturnType();
	Integer cAmount =amount.sonCollected();
	System.out.println("got the amount from my son Rs."+cAmount);
		
		
	}

}
