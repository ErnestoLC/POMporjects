package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShowTimes {
	
	WebDriver driver;
	
	By ShowtimesButton = By.linkText("Get Showtimes »");
	By ChangeZone = By.linkText("Change");
	By PostCode = By.name("zipcode");
	By GoButton = By.xpath("//*[@id=\"set-location-form\"]/span/span[4]/input");
	By City = By.linkText("Cinemex Los Mochis");

	public ShowTimes(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ChangeZone (String postcode) {
		driver.findElement(ShowtimesButton).click();
		driver.findElement(ChangeZone).click();
		driver.findElement(PostCode).sendKeys(postcode);
		driver.findElement(GoButton).click();
		driver.findElement(City).isEnabled();
	}

}
