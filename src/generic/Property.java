package generic;

import java.io.FileInputStream;
import java.util.Properties;
import exceptions.PropertyValueException;

public class Property {
	public static String getPropertyValue(String path, String key) {
		String propVal="";
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(path));
			propVal=p.getProperty(key);			
		}
		catch(Exception e) {
			throw new PropertyValueException("Unable to fetch the value from properties file.");
		}
		return propVal;
	}

}
