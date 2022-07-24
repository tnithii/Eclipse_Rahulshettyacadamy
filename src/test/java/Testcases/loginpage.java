package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.Browsernames;
import pagefactory.Rahulshettyacadamypagefactory.Addtocartpf;
import pagefactory.Rahulshettyacadamypagefactory.Checkoutpf;
import pagefactory.Rahulshettyacadamypagefactory.Loginpagepf;
import pagefactory.Rahulshettyacadamypagefactory.Purchasepf;

public class loginpage {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		File f = new File("C:\\Users\\Home\\Selenium_Starts\\Rahulshettyacadamypagefactory\\Config3.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);

		driver = Browsernames.Browser_initialization(p.getProperty("Browsername"));

		driver.get(p.getProperty("Url"));
		driver.manage().window().maximize();
		Loginpagepf log=PageFactory.initElements(driver,Loginpagepf.class);
		log.loginpagepfmethod(p.getProperty("Username_value"), p.getProperty("Password_value"));
		Addtocartpf add=PageFactory.initElements(driver,Addtocartpf.class);
		Thread.sleep(2000);
		add.Addtocartpfmethod();
		Checkoutpf check=PageFactory.initElements(driver,Checkoutpf.class);
		check.Checkoutpfmethod();
		Purchasepf purchase=PageFactory.initElements(driver,Purchasepf.class);
		purchase.Purchasepfmethod(p.getProperty("text_value"));
		
		String ele1 = driver.findElement(By.xpath(p.getProperty("Successmessage_locator"))).getText();
		
		if (ele1.contains("Success! Thank you! Your order will be delivered in next few weeks :-)."))

		{
			System.out.println("valid");
		}
		
	} 

}
