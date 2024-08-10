package javaHandson;

public class MethodCallinMainFunction {

    Long AccountNo=1234567890l;
    String AccountName="John";
    String Branch="Manaprai";
    Integer AccountBalance=1000;
    
    public void getDetails() {
    	System.out.println("Your AccountNo is " +AccountNo);
    	System.out.println("Your Account Holder Name is "+ AccountName);
    	System.out.println("Your Account Baranch in "+Branch);
    	System.out.println("Your Account Balance is RS."+AccountBalance);
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCallinMainFunction function = new MethodCallinMainFunction();
		function.getDetails();
	}

}
