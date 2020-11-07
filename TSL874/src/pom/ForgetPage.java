package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPage {
	WebDriver idriver; // Declaration
	public ForgetPage(WebDriver driver) {
		idriver = driver; // Passing from driver to idriver
	}

	By e_userName = By.id("securityAuthentication_userName");
	By e_reset = By.id("btnSearchValues");
	By e_cancel = By.id("btnCancel");

	public void setUserName(String un) {
		idriver.findElement(e_userName).sendKeys(un);
	}

	public void clickCancel() {
		idriver.findElement(e_cancel).click();
	}

	public void clickReset() {
		idriver.findElement(e_reset).click();
	}
}