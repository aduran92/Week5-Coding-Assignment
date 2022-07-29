package codingAssignmentWeek5;

//3a
//Create a class named AsteriskLogger that implements the Logger

public class AsteriskLogger implements Logger {
	
	//4
	//Log method should print out the String with three asterisks on either side

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}
	
	//5
	//Error method should print the String with the word ERROR inside a box of asterisks

	@Override
	public void error(String error) {
		System.err.println("******************");
		System.err.println("***ERROR: " + error + "***");
		System.err.println("******************");
		
	}
	
	
	

}
