package ödev2.core.loging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println(data + " Veritabanýna Loglandý" );
		
	}

}
