package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class HomePage2 extends TestBase {
	public static WebDriver driver;

	public HomePage2(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='current-password']")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button/span")
	WebElement login;

	@FindBy(xpath = "//a[text()='My learning']")
	WebElement mylearning;

	@FindBy(xpath = "//a[text()='Paid courses']")
	WebElement paidcourses;

	@FindBy(xpath = "//a[text()='Certificates']")
	WebElement certificates;
	
	@FindBy(xpath = "//a[text()='Videos']")
	WebElement videos;
	
	@FindBy(xpath = "//a[text()='Spaces']")
	WebElement spaces;
	
	@FindBy(xpath = "//a[text()='Settings']")
	WebElement settings;
	
	@FindBy(xpath = "//a[text()='Billing']")
	WebElement billing;
	

	public void enterusername(String email) {
		this.email.sendKeys(email);

	}

	public void enterpassword(String password) {
		this.password.sendKeys(password);
	}

	public void login() {
		login.click();
	}
	
	public void clickonvideo() {
		
		this.videos.click();
	}
	
	
	

}
