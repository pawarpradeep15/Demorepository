package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[]args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","F:\\testing\\ChromeDriver94_SeleniumFile\\chromedriver.exe");
WebDriver x= new ChromeDriver();
x.manage().window().maximize();
x.navigate().to("file:///F:/testing/pradeep.html");
WebElement un=x.findElement(By.tagName("input"));
un.sendKeys("Pradeep Pawar");
Thread.sleep(10000);

x.quit();

}

	
	
}

