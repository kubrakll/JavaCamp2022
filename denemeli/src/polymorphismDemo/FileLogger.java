package polymorphismDemo;

public class FileLogger extends BaseLogger{
	public void Log(String message) {
		System.out.println("Loged to file "+ message);

	}
}
