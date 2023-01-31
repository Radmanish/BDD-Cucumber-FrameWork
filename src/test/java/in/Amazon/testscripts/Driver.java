package in.Amazon.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver extends Tools {
	
	public static void init() {
		   System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		   driver = new ChromeDriver();
		  
	}

}
