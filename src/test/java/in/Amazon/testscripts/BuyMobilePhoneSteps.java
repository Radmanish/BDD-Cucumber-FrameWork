package in.Amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPageClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps extends Tools{
	
	
	
	@Given("A user on the landing page of Amazon")
	public void a_user_on_the_landing_page_of_amazon() {
	Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}

	@When("he clicks on on mobiles")
	public void he_clicks_on_on_mobiles() {
        LandingPageClass landingPage = new LandingPageClass(driver);
		landingPage.clickMobiles();
	}

	@When("he hovers the pointer over Mobiles & Accessories")
	public void he_hovers_the_pointer_over_mobiles_accessories() {
	
		AllMobileBrands allMobileBrands =new AllMobileBrands(driver);
		allMobileBrands.hoverOverMobileAndAccessories();
	}

	@When("he clicks on Apple in the sub-menue")
	public void he_clicks_on_apple_in_the_sub_menue() {
		AllMobileBrands allMobileBrands =new AllMobileBrands(driver);
		allMobileBrands.clickApple();
	}

	@When("he clicks on the first avaliable phone")
	public void he_clicks_on_the_first_avaliable_phone() {
		ApplePhones apple = new ApplePhones(driver);

	     apple.clickFirstPhones();
	}

	@When("he switches focus on the new tab")
	public void he_switches_focus_on_the_new_tab() {
		
		  ArrayList<String>tabs = new ArrayList<>(driver.getWindowHandles());
	    	 
	    	 String windowHandleOfTab = tabs.get(1);
	     driver.switchTo().window(windowHandleOfTab);
	}

	@When("he clicks on Buy Now button")
	public void he_clicks_on_buy_now_button() {
		
	    BuyPhone phone = new BuyPhone(driver);
	     
	     phone.clickBuyBTN();
	}

	@Then("he must be able to buy the mobile phone auccessfully")
	public void he_must_be_able_to_buy_the_mobile_phone_auccessfully() {
		
		 String expectedTitle = "Amazon Sign In";
	     String actualTitle = driver.getTitle();
	     Assert.assertEquals(actualTitle, expectedTitle); 
	  
	}

}
