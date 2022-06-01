package week5ass;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger () ;

		asteriskLogger.Log("Hello");
		asteriskLogger.Error("Hello");
		
		spacedLogger.Log("Hello");
		spacedLogger.Error("Fast");
		
		System.out.println();
	}

}
