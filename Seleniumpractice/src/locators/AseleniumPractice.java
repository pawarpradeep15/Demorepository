package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AseleniumPractice extends BossClass{
public void selenium() throws InterruptedException {
	System.setProperty(key1, value1);
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("http://seleniumpractise.blogspot.com/");
	d.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
	WebElement r= d.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
	r.sendKeys("Delhi");
	r.submit();
	Thread.sleep(3000);
//	d.switchTo().defaultContent();
	d.close();
	//d.navigate().back();
	
}
public static void main(String[]args) throws InterruptedException {
AseleniumPractice p = new AseleniumPractice();
p.selenium();
}
}
