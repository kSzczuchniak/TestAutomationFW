package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myLogbook {

	public WebDriver driver;
	By chooseDisciypline = By.xpath("//a[contains(text(),'BOULDERS')]");
	By addedBoulder = By.xpath("//*[contains(text(),'Stężenie pośmiertne')]");
	//By editBoulder = By.xpath("//i[@class='webicon vl-edit']");
	By editBoulder = By.xpath("//button[@class='logbook-ascent-controls cursor-pointer']");
	By removeLog = By.xpath("//button[@class='button c-btn save-controls']");
	By confirmDelete = By.xpath("//div[@class='button c-btn__dark']");
	
public myLogbook(WebDriver driver) {
		this.driver=driver;
	}

public WebElement chooseDisciyplineToBouldering()
{
	return driver.findElement(chooseDisciypline);
}

public String getAddedBoulder()
{
	return driver.findElement(addedBoulder).getText();
}

public WebElement getEditBoulder()
{
	return driver.findElement(editBoulder);
}
public WebElement getRemoveLog()
{
	return driver.findElement(removeLog);
}
public WebElement getConfirmDelete()
{
	return driver.findElement(confirmDelete);
}


}