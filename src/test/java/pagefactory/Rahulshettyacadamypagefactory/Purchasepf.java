package pagefactory.Rahulshettyacadamypagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Purchasepf {
	WebDriver driver;

		
	public Purchasepf(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="country")
	WebElement Textbox_locator;
	@FindBy(xpath="/html/body/app-root/app-shop/div/app-checkout/div/div[2]/label")
	WebElement secondcheckbox_locator;
	@FindBy(className="btn-lg")
	WebElement Purchase_locator;
	
	public void Purchasepfmethod(String text) throws InterruptedException
	{
		Textbox_locator.sendKeys(text);
		
		secondcheckbox_locator.click();
		Purchase_locator.click();
	}

}
