package Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage {

	WebDriver driver;
	public BookingPage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="(//span[@itemprop='name'])[6]") WebElement Bed_click;
	
	public void bedlogin() throws InterruptedException
	{
		
		Bed_click.click();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Helperclass.captureScreenshots(driver);

	}
}
