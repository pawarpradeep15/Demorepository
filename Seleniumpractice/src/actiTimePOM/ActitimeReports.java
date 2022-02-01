package actiTimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeReports {
private WebElement reportclick;
private WebElement create;
private WebElement seeEx;
WebDriver driver;
public ActitimeReports(WebDriver driver) {
	this.driver= driver;
   reportclick= driver.findElement(By.xpath("//div[text()='Tasks']"));
   create = driver.findElement(By.xpath("//span[text()='Create Report']"));
   seeEx= driver.findElement(By.xpath("//a[text()='See examples']"));
}
public void clickreport() {
	reportclick.click();
}
public void createreport() {
create.click();
}
public void seeExample() {
	seeEx.click();
}
}
