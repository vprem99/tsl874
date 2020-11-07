package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver idriver; // Declaration

	public LoginPage(WebDriver driver) {
		System.out.println(driver + " from Runner");
		idriver = driver; // Passing from driver to idriver
	}

	By e_userName = By.name("txtUsername");
	By e_password = By.name("txtPassword");
	By e_loginButton = By.name("Submit");
	By e_forget = By.linkText("Forgot your password?");

	public void setUserName(String un) {
		// System.out.println(idriver);
		idriver.findElement(e_userName).sendKeys(un);
	}
	public void setPassword(String pwd) {
		idriver.findElement(e_password).sendKeys(pwd);
	}
	public void clickLogin() {
		idriver.findElement(e_loginButton).click();
	}
	public void doLogin(String un, String pwd) {
		// idriver.findElement(e_userName).sendKeys(un);
		setUserName(un);
		setPassword(pwd);
		clickLogin();
	}
	public void clickForget() {
		idriver.findElement(e_forget).click();
	}
}