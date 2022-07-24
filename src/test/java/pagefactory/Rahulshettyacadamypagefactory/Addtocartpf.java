package pagefactory.Rahulshettyacadamypagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpf {
WebDriver driver;

	
	public Addtocartpf(WebDriver driver)
	{
			this.driver=driver;
	}
	
	@FindBy(xpath="/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[1]/div/div[2]/button")
	WebElement Add_locator;
	@FindBy(className="btn-primary")
	WebElement Checkout_locator;
	
	public void Addtocartpfmethod()
	{
		Add_locator.click();
		Checkout_locator.click();
	}
	
			
			
}
