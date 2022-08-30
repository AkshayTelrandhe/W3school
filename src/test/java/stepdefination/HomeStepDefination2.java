package stepdefination;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w3school.qa.reusablemethods.Reusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.HomePage2;
import pageobject.LoginPage;
import testbase.TestBase;

import com.w3school.qa.reusablemethods.*;
public class HomeStepDefination2 extends TestBase{
	
	//LoginPage lp=new LoginPage(driver);
	HomePage2 hp=new HomePage2(driver);
	
	static {
		try {
			initilization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 @Given("^navigate to \"([^\"]*)\"$")
	    public void navigate_to_something(String strArg1) throws Throwable {
	    driver.get(strArg1);
	    }

	    @When("^insert \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	    public void insert_something_and_something_and_click_on_login_button(String strArg1, String strArg2) throws Throwable {
	        hp.enterusername(strArg1);
	        hp.enterpassword(strArg2);
	        hp.login();
	    }

	    @When("^then it should click on videos menu$")
	    public void then_it_should_click_on_videos_menu() throws Throwable {
	      hp.clickonvideo();
	    }

	    @Then("^user should land on home page$")
	    public void user_should_land_on_home_page() throws Throwable {
	    	String expectedurl1="https://my-learning.w3schools.com/";
	   Reusable.explicitWait(By.xpath("//a[text()='My learning']"));
	   assertEquals(expectedurl1,driver.getCurrentUrl());
	    }

	    @Then("^user should land on videos menu page$")
	    public void user_should_land_on_videos_menu_page() throws Throwable {
	    	
	    }

	
	
	    



}
