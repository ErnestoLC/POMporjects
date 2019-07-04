package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearch {
	
	WebDriver driver;
	
	By SearchDropDown = By.id("quicksearch");
	By SelectorMovies1 = By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[1]/form/div[1]/div/select");
	By TypeMovie1 = By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[1]/form/div[2]/div/input");
	By SelectorMovies2 = By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[2]/form/div[1]/div/select");
	By TypeMovie2 = By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[2]/form/div[2]/div/input");
	
	public AdvancedSearch(WebDriver driver) {
		this.driver = driver;
		
	}
	public void AdvancedSearchData() {
		Select selector = new Select(driver.findElement(SearchDropDown));
		selector.selectByValue("/search/");
		
		Select selector1 = new Select (driver.findElement(SelectorMovies1));
		selector1.selectByValue("goofs");
		selector1.selectByValue("crazy_credits");
		selector1.selectByValue("location");
		selector1.selectByValue("soundtracks");
		selector1.selectByValue("versions");
		selector1.selectByValue("trivia");
		selector1.selectByValue("quotes");
		selector1.selectByValue("plot");
		
		driver.findElement(TypeMovie1).sendKeys("Hombres de honor");
		
		Select selector2 = new Select (driver.findElement(SelectorMovies2));
		selector2.selectByValue("trivia");
		selector2.selectByValue("quotes");
		selector2.selectByValue("bio");
		
		driver.findElement(TypeMovie2).sendKeys("Doctor");
		
	}

}
