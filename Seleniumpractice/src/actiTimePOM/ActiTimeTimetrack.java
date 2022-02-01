package actiTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeTimetrack {
private WebElement Timetrack;
private WebElement TimeTask;
WebDriver driver;
public ActiTimeTimetrack(WebDriver driver) {
	this.driver= driver;
Timetrack= driver.findElement(By.xpath("//a[@class='item active']"));
TimeTask = driver.findElement(By.xpath("//input[@class='taskSearchField']"));
//Usage
}
	public void ActitimetimeTask() {
Timetrack.click();	
	}
  public void Timetask() {
	
	
	
	boolean s = TimeTask.isEnabled();
	  
	if(s==true) {
	System.out.println("element is enabled");
	
	TimeTask.sendKeys("task1 is complete");
	
  }  
	else { System.out.println("element not enabled");
	}
	 
}
}

