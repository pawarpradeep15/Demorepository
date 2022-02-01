package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe extends BossClass {
static WebDriver d;
	public void Action1() throws InterruptedException {
System.setProperty(key1, value1);
d= new ChromeDriver();
d.manage().window().maximize();
d.manage().deleteAllCookies();
d.navigate().to("http://demo.guru99.com/test/guru99home/");
JavascriptExecutor	j = ((JavascriptExecutor)d);
Thread.sleep(3000);
j.executeScript("scroll(0,2250)");
Thread.sleep(2000);
d.switchTo().frame("a077aa5e");
d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
String parentID = d.getWindowHandle();
System.out.println("Main Window ID's "+parentID);
Set<String> pcids = d.getWindowHandles();
System.out.println("Main + Child Window ID's "+pcids);
for(String w : pcids) {
	if(!parentID.equals(w)) {
		d.switchTo().window(w);
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='awf_field-93653884']")).sendKeys("Pradeep Pawar");
		Thread.sleep(3000);
		d.close();
	}
}
d.switchTo().window(parentID);
Thread.sleep(3000);
j.executeScript("scroll(0,-2250)");
Thread.sleep(3000);
d.quit();
}
	public static void main(String[]args) throws InterruptedException {
	Iframe i = new Iframe();
	i.Action1();
	}
}
