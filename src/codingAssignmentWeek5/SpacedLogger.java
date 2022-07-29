package codingAssignmentWeek5;

//3b
//Create a class named SpacedLogger that implements the Logger

public class SpacedLogger implements Logger {
	
	//6
	//There should be spaces between each character of the String

	@Override
	public void log(String log) {
		System.out.println(log.replace("", " "));
		
	}
	
	//7
	//The error method should the same as the log but with ERROR: in front of the String

	@Override
	public void error(String error) {
		error.replace("", " ");
		System.err.println("ERROR: " + error.replace("", " "));
		
	}

}
