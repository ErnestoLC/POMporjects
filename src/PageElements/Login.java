package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	By Signinbutton = By.id("imdb-signin-link");
	By IMDBlogin = By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]");
	By EmailAccount = By.id("ap_email");
	By PasswordAccount = By.id("ap_password");
	By LoginButton = By.id("signInSubmit");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginString(String user, String pass) {
		driver.findElement(Signinbutton).click();
		driver.findElement(IMDBlogin).click();
		driver.findElement(EmailAccount).sendKeys(user);
		driver.findElement(PasswordAccount).sendKeys(pass);
		driver.findElement(LoginButton).click();
	}

}
