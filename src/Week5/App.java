package Week5;

public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		
	      asteriskLogger.log("Welcome");
	    
		asteriskLogger.log("Bank");
	     
	     Logger second = new SpacedLogger();
	     
	     second.log("Welcome");
	     second.error("Bank");
	     
	      

	}

}
