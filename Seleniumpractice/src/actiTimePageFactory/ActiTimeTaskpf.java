package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeTaskpf {

//Declaration + Partial Initialization

@FindBy(xpath ="//a[@class='item active']")
private WebElement Timetrack ;

@FindBy(xpath = "//input[@autocomplete='off']")
private WebElement Taskname;;
WebDriver driver;


// Initialization 
public ActiTimeTaskpf (WebDriver driver) {
	PageFactory.initElements(driver, this);			
}

// usage
public void setActitimeTimetrackClick() {
	Timetrack.click();
}
public void setActitimeTimetracktask() throws InterruptedException {
	boolean h = Taskname.isEnabled();
	if(h==true) {
		System.out.println("Task is enabled");
	}else
	{  System.out.println("task is not enabled");
	Taskname.sendKeys("Task1");
	Thread.sleep(3000);
	}
	}
}
