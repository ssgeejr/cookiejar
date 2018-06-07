package itsa.sprint.com.cookiejar;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class CookieDough {
	private final boolean isTest;

	public CookieDough() throws Exception{
		isTest = false;
		initialize();
	}

	public CookieDough(boolean isTest) throws Exception{
		this.isTest = isTest;
		initialize();
	}

	private void initialize() throws Exception{
		if(this.isTest) {
			//grab manual connection
		}else {
			//grab jndi resource
		}
	}
	
	public static void main(String[] args) {


	}

}
