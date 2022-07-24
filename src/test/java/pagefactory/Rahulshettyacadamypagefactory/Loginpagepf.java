package pagefactory.Rahulshettyacadamypagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class Loginpagepf {
	WebDriver driver;
	public Loginpagepf(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//*[@id='login-form']/div[4]/div/label[1]/span[2]")
	WebElement Admin_locator;
	@FindBy(xpath="//*[@id='login-form']/div[5]/select")
	WebElement StudentDropdown_locator;
	@FindBy(id="terms")
	WebElement terms_locator;
	@FindBy(id="signInBtn")
	WebElement Signin_locator;
	
	public void loginpagepfmethod(String user,String pass)
	
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		Admin_locator.click();
		Select s=new Select(StudentDropdown_locator);
		s.selectByVisibleText("Student");
		terms_locator.click();
		Signin_locator.click();
		
	}
	
	
	
	
		
	
		
	}
	

