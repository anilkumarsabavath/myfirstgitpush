package apimaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Basetest {
	 public Properties prop;
	public Basetest() {
		 prop = new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream("C:\\Users\\Admin\\eclipse-workspac\\apimaven\\src\\main\\java\\config\\prop\\Data\\sta.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		catch (IOException e) {

			e.printStackTrace();
		}
	}

}
