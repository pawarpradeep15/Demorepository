package popHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implement1 implements BigB {

	
	public void check1() {
	System.out.println("Welcome to popup Handling");	
	}
	public void check2() throws InterruptedException {
	System.setProperty(key, value1);
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to(Url);
	d.findElement(By.xpath("//button[@id='alertButton']")).click();
    Thread.sleep(2000);
    d.switchTo().alert().accept();
    Thread.sleep(2000);
    d.findElement(By.xpath("//button[@id='timerAlertButton']")).click();;
    Thread.sleep(2000);
	
    Thread.sleep(5200);//here we provide max time bcoz alert will after 5 seconds..
    d.switchTo().alert().accept();//All are abstract methods of Webdriver interface....
    Thread.sleep(1000);
    WebElement third  = d.findElement(By.xpath("//button[@id='confirmButton']"));
    third.click(); //to avoid rewritting xpath code, we can store it into variable and it's data type must be WebElement..
    Thread.sleep(2000);
    d.switchTo().alert().dismiss();

   third.click();
 String msg  =   d.switchTo().alert().getText();
 System.out.println("Pop msg is ="+msg);
 d.switchTo().alert().accept();
 Thread.sleep(2000);
 WebElement fourth= d.findElement(By.xpath("//button[@id='promtButton']"));
 fourth.click();
 Thread.sleep(2000);
 
 d.switchTo().alert().sendKeys("ppp");
 Thread.sleep(3000);
 d.switchTo().alert().accept();
 Thread.sleep(2000);
 d.close();
	}
    
public static void main (String[]args) throws InterruptedException {
	Implement1 i = new Implement1 ();
	i.check1();
	i.check2();
}
}
