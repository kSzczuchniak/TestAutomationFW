package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class homePage {
		
		public WebDriver driver;
		
		By signin=By.xpath("//div[@class='user-links']/a");
//		By title=By.cssSelector(".text-center>h2");
//		By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
//		
		
		public homePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
		}

		public loginPage getSignin()
		{	 
			 driver.findElement(signin).click();
			 loginPage lp=new loginPage(driver);
			 return lp;
		}
}