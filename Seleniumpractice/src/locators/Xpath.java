package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath extends BossClass {
	public void OperateXpath() throws InterruptedException {
	System.setProperty(key1, value1);
	WebDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("https://www.facebook.com/");
	d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Suyog77");
	d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("Shine1990");
	d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	Thread.sleep(5000);
	d.close();
	
	}
public static void main(String[]args) throws InterruptedException {
Xpath x = new Xpath();
x.OperateXpath();


}
}


