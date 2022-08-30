package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase {
	public static WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='current-password']")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button/span")
	WebElement login;

	public void enterusername(String email) {
		this.email.sendKeys(email);

	}

	public void enterpassword(String password) {
		this.password.sendKeys(password);
	}

	public void login() {
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
