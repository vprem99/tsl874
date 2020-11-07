package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ForgetPage {
	public ForgetPage(WebDriver driver) {
		//Initialize this Class Elements/Objects with driver
		PageFactory.initElements(driver, this); 
	}

	WebElement securityAuthentication_userName;
	WebElement btnSearchValues;
	WebElement btnCancel;
	
	public void setUserName(String un) {
		securityAuthentication_userName.sendKeys(un);
	}

	public void clickCancel() {
		btnSearchValues.click();
	}

	public void clickReset() {
		btnCancel.click();
	}
}