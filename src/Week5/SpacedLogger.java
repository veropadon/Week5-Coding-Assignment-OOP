package Week5;

public class SpacedLogger implements Logger {

	public void log(String log) {
		
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < log.length(); i++) {
				sb.append(log.charAt(i)).append(" ");
			}
			System.out.println(sb.toString());
		}

		
		public void error(String error) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < error.length(); i++) {
				sb.append(error.charAt(i)).append(" ");
			}
			System.out.println("ERROR : " + sb.toString());
		}
	}
