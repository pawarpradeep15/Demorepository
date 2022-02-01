package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sub1 implements Main {

	public void Implicitwait() throws InterruptedException {
System.setProperty(key1, value);
WebDriver d = new ChromeDriver();
d.manage().window().maximize();
d.manage().deleteAllCookies();
d.navigate().to("https://paytm.com/recharge");
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Waiting time
d.findElement(By.xpath("//span[text()= 'Prepaid/Postpaid']")).click();
      WebElement postpaid = d.findElement(By.xpath("//input[@id='radio1']"));
boolean result= postpaid.isSelected();
if(result==true) {
	System.out.println("test scenario is passed");
}
	else {
		System.out.println("Test scenario is failed");
	}
Thread.sleep(2000);
d.quit();
	}
	
	public void Explicite() {
	
	}
public static void main(String args []) throws InterruptedException {
	Sub1 s = new Sub1();
	s.Implicitwait();
	s.Explicite();
}
}
