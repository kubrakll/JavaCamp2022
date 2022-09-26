package polymorphismDemo;



public class Main {

	public static void main(String[] args) {

		// �ok Bi�imlilik
		/*
		 * EmailLogger logger = new EmailLogger(); logger.Log("Log mesaj�");
		 * 
		 * BaseLogger[] loggers = new BaseLogger[] { new DatabaseLogger(), new
		 * FileLogger(), new EmailLogger() }; for (BaseLogger baseLogger : loggers) {
		 * logger.Log("Log mesaj�"); }
		 */
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();

	}

}
