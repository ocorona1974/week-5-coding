package week5ass;

public class AsteriskLogger implements Logger{
	
	public void Log(String str) {
		System.out.println("***" + str + "***");
	}
	public void Error(String str) {
		String error = "Error: " + str ;
		System.out.println("****************");
	Log(error);
		System.out.println("****************");
	}
	}


