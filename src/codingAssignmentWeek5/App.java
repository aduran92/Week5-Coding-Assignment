package codingAssignmentWeek5;

//9
//Create a class named App that has a main method

public class App {

	public static void main(String[] args) {
		
		//10 & 11
		//Instantiate an instance of each of your logger classes that implement the Logger Interface
		//Test both methods, passing in String of your choice
		
		Logger asteriskLogger = new AsteriskLogger();
		
		asteriskLogger.log("Good morning");
		asteriskLogger.error("Hello");
		
		Logger spacedLogger = new SpacedLogger();
		
		spacedLogger.log("Goodbye");
		spacedLogger.error("Hello");
	}

}
