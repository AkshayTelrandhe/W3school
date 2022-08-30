package stepdefination;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import testbase.TestBase;

public class Hook extends TestBase{

	@After()
	public void afterclass(Scenario sc) {
		if(sc.isFailed()) {
			
		final	byte [] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot,"image/png",sc.getName());
			
		}
		
		
		driver.quit();
	}
	
	
	
	
	
	
}
