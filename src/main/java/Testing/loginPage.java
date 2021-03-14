package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import pageObjects.ForgotPassword;

public class loginPage {
public WebDriver driver;
	
	By signin=By.xpath("//div[@class='user-links']/a");	
	By email=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='kc-login']");
	By forgotPassword = By.xpath("//*[contains(text(),'Forgot Password?')]");
	By addAscent = By.xpath("//*[contains(text(),'Add Ascent')]");
	By myLogbook = By.xpath("//a[contains(text(),'My Logbook')]");
	By logOut = By.xpath("//*[contains(text(),'Logout')]");
	
	public loginPage(WebDriver driver) {
	
		this.driver=driver;
		
	}



//public ForgotPassword forgotPassword()
//{
//	driver.findElement(forgotPassword).click();
//	return new ForgotPassword(driver);
//	
//}
	
		 
	public WebElement getEmail()
	{
		
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	public addAscent getAddAscent()
	{
		driver.findElement(addAscent).click();
		addAscent aa = new addAscent(driver);
		return aa;
	}
//	public WebElement getAddAscent()
//	{
//		return driver.findElement(addAscent);
//	}
//	public WebElement getMyLogbook()
//	{
//		return driver.findElement(myLogbook);
//	}
	
	public myLogbook getMyLogbook()
	{
		driver.findElement(myLogbook).click();
		myLogbook ml = new myLogbook(driver);
		return ml;
	}
	public WebElement getLogOut()
	{
		return driver.findElement(logOut);
	}
	public WebElement getLogBook()
	{
		return driver.findElement(myLogbook);
	}
}