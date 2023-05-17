package Week5;


public class AsteriskLogger implements Logger {

	
	public void log(String word) {
		System.out.println("*** " + word + " ***");
	}

	
	public void error(String error) {
		int errorLength = error.length() + 13;
		String asterisks = "*".repeat(errorLength);
		System.out.println(asterisks);
		System.out.println("***Error: " + error + "***");
		System.out.println(asterisks);
		 
	}

	
}

	
	

