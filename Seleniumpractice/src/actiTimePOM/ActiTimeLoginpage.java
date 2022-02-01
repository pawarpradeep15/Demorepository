package actiTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeLoginpage {
	
//Declaration	
private WebElement UN;
private WebElement PW;
private WebElement loginBt;
WebDriver driver;

//Initialization

 public ActiTimeLoginpage(WebDriver driver) {
	this.driver = driver;
	UN = driver.findElement(By.xpath("//input[@id='username']"));
	PW= driver.findElement(By.xpath("//input[@name='pwd']"));
	loginBt =driver.findElement(By.id("loginButton"));
}
 //Usage
 public void setActitimeUsername() {
	 UN.sendKeys("admin");
 }
 public void setActittimePassword() {
	 PW.sendKeys("manager");
 }
 public void verifyActitimelogin() {
	 loginBt.click();
 }

}