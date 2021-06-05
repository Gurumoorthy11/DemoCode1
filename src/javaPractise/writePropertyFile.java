package javaPractise;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class writePropertyFile extends Exception {

	public void writeProp() {
		
	}
	public static void main(String[] args) {

		String FileName="C:/Users/ELCOT/workspace/javaPractise/*resource/config.properties";
		try {
			PropertiesConfiguration config = new PropertiesConfiguration(FileName);
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
