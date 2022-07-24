package pagefactory.Rahulshettyacadamypagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpf {
	WebDriver driver;
	
	 
	public Checkoutpf(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(className="btn-success")
	WebElement nextCheckout_locator;
	
	public void Checkoutpfmethod()
	{
		nextCheckout_locator.click();
	}

}
