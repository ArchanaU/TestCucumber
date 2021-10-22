package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		System.out.println("properties");
		FileInputStream fis=new FileInputStream("D:\\Users\\amantripragada\\Documents\\Automation\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		
	prop.load(fis);

	
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\amantripragada\\Documents\\Automation\\Automation\\drivers\\chromedriver.exe");
   	 driver=new ChromeDriver();
   	System.out.println("driver");
  	driver.get(prop.getProperty("url"));
  	System.out.println("url " +prop.getProperty("url"));
   	 return driver;
		
	}
	
}
