package Hybrid.Selenium.Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		    GenericKeywords g1 = new GenericKeywords();
		   
		    g1.openBrowser();
		    Thread.sleep(5000);
		    g1.inputTextbox();
//			FirefoxDriver driver = new FirefoxDriver();
//			driver.get("http://www.google.com");
//			driver.get("http://www.paypal.com");
//			driver.get("http://www.cnn.com");
//			//WebElement test = driver.findElementById("gb_70");
			//test.click();
			         }
			

	

}
