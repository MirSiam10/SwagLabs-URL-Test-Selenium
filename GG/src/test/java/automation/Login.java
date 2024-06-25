package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriverManager.firefoxdriver().setup();
			WebDriver Driver = new FirefoxDriver();
			
			Driver.get("https://www.saucedemo.com/v1");
			
			
			//driver.manage().window().maximize();
			//driver.manage().window().minimize();
		    			
			String actualUrl  ="https://www.saucedemo.com/v1/";
			String expectedUrl=Driver.getCurrentUrl();
		
			if(actualUrl.equals(expectedUrl)) {
				System.out.println("URL Matched");
				}
				else {
					System.out.println("URL not matched");
				}
		
			
			Assert.assertEquals(actualUrl, expectedUrl,"conditions true");
	}

}


