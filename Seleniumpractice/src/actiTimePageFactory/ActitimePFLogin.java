package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimePFLogin {
	// Declaration + Partial Initialization
	
	    @FindBy(id = "username")
		private WebElement un ;
	    
	    @FindBy(xpath = "//input[@name='pwd']")
		private WebElement pwd ;
	    
	    @FindBy(id = "loginButton")
		private WebElement loginbutton ;
		WebDriver driver;
		
		// Initialization 
		public ActitimePFLogin (WebDriver driver) {
			PageFactory.initElements(driver, this);			
		}
		
		// usage
		public void setActitimeLoginPageUsernamePF() {
			un.sendKeys("admin");
		}
		public void setActitimeLoginPagePasswordPF() {
			pwd.sendKeys("manager");
		}
		public void verifyactitimeLoginPageLoginButtonPF() {
			loginbutton.click();
		}
}