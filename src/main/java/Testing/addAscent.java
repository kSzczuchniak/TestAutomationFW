package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addAscent {
	
	public WebDriver driver;
	By insertCragName = By.xpath("//input[@class='vs__search']");//graność
	By chooseCrag = By.xpath("//tr[@class='hoverable'][1]");
	By insertBoulderName = By.xpath("//input[@class='vs__search']");//Stężenie pośmiertne
	By chooseBoulder = By.xpath("//p[@class='name-link']");
	By chooseStyle = By.xpath("//*[contains(text(),'Redpoint')]");
	By attepmtNumber = By.xpath("//i[@class='webicon nu8a-icon vl-more-than-2']");
	By dateAscent = By.xpath("//input[@class='mx-input']");
	By grade = By.xpath("//*[contains(text(),'SOFT')]");
	By typeHolds = By.xpath("//i[@class='webicon nu8a-icon vl-sloper']");
	By addBoulder = By.xpath("//*[contains(text(),'ADD TO YOUR LOGBOOK')]");


	
	
	public addAscent(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getInsertCragName()
	{
		return driver.findElement(insertCragName);
	}
	
	public WebElement getChooseCrag()
	{
		return driver.findElement(chooseCrag);
	}
	
	public WebElement getInsertBoulderName()
	{
		return driver.findElement(insertBoulderName);
	}
	
	public WebElement getChooseBoulder()
	{
		return driver.findElement(chooseBoulder);
	}
	
	public WebElement getChooseStyle()
	{
		return driver.findElement(chooseStyle);
	}
	
	public WebElement getAttepmtNumber()
	{
		return driver.findElement(dateAscent);
	}
	
	public WebElement getDateAscent()
	{
		return driver.findElement(grade);
	}
	public WebElement getGrade()
	{
		return driver.findElement(grade);
	}
	public WebElement getTypeHolds()
	{
		return driver.findElement(typeHolds);
	}
	public WebElement getAddBoulder()
	{
		return driver.findElement(addBoulder);
	}
}
