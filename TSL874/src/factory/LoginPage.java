package factory;

import java.awt.print.Pageable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		// Initializing the Current(this) class with driver
		PageFactory.initElements(driver, this);
	}
	// in case of name/id you can directly declare WebElement as name/id in DOM
	WebElement txtUsername;                        
	WebElement txtPassword; 
	WebElement Submit; 
	@FindBy(linkText="Forgot your password?") WebElement e_forget;

	public void setUserName(String un) {
		// System.out.println(idriver);
		txtUsername.sendKeys(un);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clickLogin() {
		Submit.click();
	}
	public void doLogin(String un, String pwd) {
		// idriver.findElement(e_userName).sendKeys(un);
		setUserName(un);
		setPassword(pwd);
		clickLogin();
	}
	public void clickForget() {
		e_forget.click();
	}
}