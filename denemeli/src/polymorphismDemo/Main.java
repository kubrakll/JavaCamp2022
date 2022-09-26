package polymorphismDemo;



public class Main {

	public static void main(String[] args) {

		// Çok Biçimlilik
		/*
		 * EmailLogger logger = new EmailLogger(); logger.Log("Log mesajý");
		 * 
		 * BaseLogger[] loggers = new BaseLogger[] { new DatabaseLogger(), new
		 * FileLogger(), new EmailLogger() }; for (BaseLogger baseLogger : loggers) {
		 * logger.Log("Log mesajý"); }
		 */
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();

	}

}
