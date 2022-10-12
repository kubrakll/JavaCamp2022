package ödev2.core.loging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println(data + " Mail Loglandý");
		
	}

}
