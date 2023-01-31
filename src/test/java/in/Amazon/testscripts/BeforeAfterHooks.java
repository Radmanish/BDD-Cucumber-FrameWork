package in.Amazon.testscripts;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfterHooks extends Tools{
	
	@Before
	public void setUp (Scenario scenario) {
		
		Driver.init();
		 driver.manage().window().maximize();
			driver.get("https://amazon.in");
		
	}
	@After
	public void setUp () {
		
		driver.quit();
	}
	

}
