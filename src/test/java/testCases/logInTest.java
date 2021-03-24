package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.addAscent;
import pageObject.homePage;
import pageObject.loginPage;
import pageObject.myLogbook;
import resources.base;

public class logInTest extends base{
	

	public static WebDriver driver;
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	String Boulder1 = "Stężenie pośmiertne";
	String Crag1 = "Graność";
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Initialize browser");
		 driver.get(prop.getProperty("url"));
		 log.info("8a.nu was opened");
	}
	@Test(dataProvider="getData")
	
	public void addBoulder(String Username, String Password, String text) throws IOException, InterruptedException
	{

		driver.manage().window().maximize();
		
		homePage h=new homePage(driver);
		
		loginPage l=h.getSignin();
		l.getEmail().sendKeys(Username);
		l.getPassword().sendKeys(Password);
		 log.info(text);
		l.getLogin().click();
		
		addAscent aa= l.getAddAscent();
		aa.getInsertCragName().sendKeys(Crag1);
		aa.getChooseCrag().click();
		aa.getInsertBoulderName().sendKeys(Boulder1);
		aa.getChooseBoulder().click();
		aa.getChooseStyle().click();
		aa.getAttepmtNumber().click();
		aa.getDateAscent().click();
		aa.getGrade().click();
		aa.getTypeHolds().click();
		aa.getAddBoulder().click();
		Thread.sleep(2000);
		l.getLogBook().click();
		
		myLogbook ml = l.getMyLogbook();
		ml.chooseDisciyplineToBouldering().click();

		Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
			if(ml.getAddedBoulder().contains(Boulder1)) {
				System.out.println("Correctly added boulder");
				log.info("Correctly added boulder");
			}
			else {
				System.out.println("Something was wrong");
				log.info("Mistakenly added boulder");
			}
		ml.getEditBoulder().click();
		ml.getRemoveLog().click();
		ml.getConfirmDelete().click();
		log.info("Successfully deleted added boulder");
		
		Thread.sleep(2000);
		 js.executeScript("window.scrollBy(1000,0)");
		l.getLogOut().click();
		log.info("Successfully log out valid user");
		}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
		log.info("Successfully closed browser");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{

		Object[][] data=new Object[2][3];

		data[0][0]="test.er3@wp.pl";
		data[0][1]="erthquqke2";
		data[0][2]="LogIn valid User";

		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		data[1][2]= "Not logged in invalid account";
		
		return data;
	}
	}
