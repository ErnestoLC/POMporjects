package PackageTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageElements.AdvancedSearch;
import PageElements.HomePage;
import PageElements.Login;
import PageElements.ShowTimes;

public class IMBTestCases {
	WebDriver driver ;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","/Users/Windows 10 LTSB ®/repo/test_automation/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://imdb.com");
	}
	
	@Test
	public void TestCase_01_Login() {
		Login login = new Login(driver);
		
		login.loginString("neto_bnw@hotmail.com", "h1234567");
	}
	
	@Test
	public void TestCase_02_VerifySearch() {
		HomePage hp = new HomePage(driver);
		
		hp.SearchMovie("Toy Story");
	}
	
	@Test 
	public void TestCase_03_ChangeZone() {
		ShowTimes showtime = new ShowTimes(driver);
		
		showtime.ChangeZone("81315");
	}
	
	@Test
	public void TestCase_04_SelectSearch()
	{
		HomePage hp = new HomePage(driver);
		
		hp.ChageSelector("kw");
		hp.ChageSelector("co");
		hp.ChageSelector("nm");
		hp.ChageSelector("ep");
		hp.ChageSelector("tt");
		hp.ChageSelector("all");
		hp.ChageSelector("/search/");
	}
	
	@Test
	public void TestCase_05_AdvanceSearch() {
		AdvancedSearch advancesearch = new AdvancedSearch(driver);
		advancesearch.AdvancedSearchData();
	}
	
	@AfterMethod
	public void EndTCs()
	{
		driver.quit();
	}

}
