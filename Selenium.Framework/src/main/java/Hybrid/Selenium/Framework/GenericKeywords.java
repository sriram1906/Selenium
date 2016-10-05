package Hybrid.Selenium.Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class GenericKeywords {
	public Properties prop;
	
	
	public GenericKeywords() throws IOException{
		Properties prop = new Properties();
		//InputStream inputStream = getClass().getClassLoader().getResourceAsStream("src/test/resources/Properties");
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test/resources//Properties");
		prop.load(fs);
		
	}

	public void openBrowser() {
		
		FirefoxDriver driver = new FirefoxDriver();
		System.out.println(prop.getProperty("geturl"));
		
		
	}

}
