package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	By search = By.id("navbar-query");
	By searshbutton = By.id("navbar-submit-button");
	By SearchDropDown = By.id("quicksearch");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SearchMovie(String name) {
		driver.findElement(search).sendKeys(name);
		driver.findElement(searshbutton).click();
	}
	
	public void TypeMovie(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void ClickShearch() {
		driver.findElement(searshbutton).click();
	}
	
	public void ChageSelector (String text) {
		Select s = new Select(driver.findElement(SearchDropDown));
		s.selectByValue(text);
	}
	
	public void EndTC()
	{
		driver.quit();
	}

}
