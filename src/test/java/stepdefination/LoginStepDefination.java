package stepdefination;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w3school.qa.reusablemethods.Reusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;
import testbase.TestBase;

import com.w3school.qa.reusablemethods.*;
public class LoginStepDefination extends TestBase{
	
	LoginPage lp=new LoginPage(driver);
	
	static {
		try {
			initilization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	 @Given("^Navigate to \"([^\"]*)\"$")
	    public void navigate_to_something(String strArg1) throws Throwable {
	       driver.get(strArg1);
	    }

	    @When("^Insert \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	    public void insert_something_and_something_and_click_on_login_button(String strArg1, String strArg2) throws Throwable {
	       lp.enterusername(strArg1);
	       lp.enterpassword(strArg2);
	       lp.login();
	    }

	    @Then("^User should land on home page$")
	    public void user_should_land_on_home_page() throws Throwable {
	        String expectedurl="https://my-learning.w3schools.com/";
	  Reusable.explicitWait(By.xpath("//a[text()='My learning']"));
	        assertEquals(expectedurl,driver.getCurrentUrl());
	    }
	    

	   /* @Then("^A email with user does not exist$")
	    public void a_email_with_user_does_not_exist() throws Throwable {
	        
	    }
	    
	    @Then("^User get message please enter email and password$")
	    public void user_get_message_please_enter_email_and_password() throws Throwable {
	       
	    }

	    @Then("^User get message Make sure you type your email and password correctly Both your password and email are casesensitive$")
	    public void user_get_message_make_sure_you_type_your_email_and_password_correctly_both_your_password_and_email_are_casesensitive() throws Throwable {
	   
	    }
	    @Then("^A user with this email does not exist$")
	    public void a_user_with_this_email_does_not_exist() throws Throwable {
	        
	    }*/


	    



}
