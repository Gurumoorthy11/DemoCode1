package javaPractise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class propertyRead {

	
	public String getPropValue(){
		String result = null;
		try{
			Properties prop= new Properties();
			String fileName="config.properties"; 
			InputStream input= getClass().getClassLoader().getResourceAsStream(fileName);
			
			prop.load(input);
			if(input!=null){
				
			}
			String username= prop.getProperty("user");
			String id= prop.getProperty("id");
			 result= username+" "+id;
			 
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		return result;
		
	}
	public static void main(String[] args) throws IOException {

		//FileReader reader = new FileReader("config.properties");
		
		//Properties p= new Properties();
		propertyRead obj =new propertyRead();
		obj.getPropValue();
		//System.out.println(p.getProperty("user"));
		
		
	}

}
