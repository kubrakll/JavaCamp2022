package ödev2.core.loging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println(data +" Dosyaya Loglandý" );
		
	}

}
