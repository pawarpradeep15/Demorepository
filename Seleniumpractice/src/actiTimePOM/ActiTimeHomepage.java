package actiTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeHomepage {
private WebElement logo;
private WebElement Logoutbutton;
WebDriver driver;

//Initialization//
public ActiTimeHomepage (WebDriver driver) {
	this.driver= driver;
logo = driver.findElement(By.xpath("//img[@height='61']"));
Logoutbutton = driver.findElement(By.xpath("//a[@class='logout']"));
}
//Usage
public void ActitimeLogo() {
	boolean display = logo.isDisplayed();
	if(display==true) {
	System.out.println("scenario is passed");	
	}else { 
		System.out.println("scenario is failed");
	}
}
public void verifyLogout() {
	boolean enable = Logoutbutton.isEnabled();
	if(enable==true) {
		System.out.println("Logout possible");
	}else
	{ System.out.println("Logout impossible");
}
	Logoutbutton.click();
}
}
