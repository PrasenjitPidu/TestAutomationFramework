package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		//Reading the file from Properties File
		FileReader file = new FileReader("C:\\Users\\007pr\\PDas\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		
		//Set Property
		Properties prop=new Properties();
		
		prop.load(file);
		System.out.println(prop.getProperty("browser"));

	}

}
