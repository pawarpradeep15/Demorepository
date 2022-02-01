package iFrame;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementIframe implements Iboss {

	static WebDriver d;
	public void check() throws InterruptedException {
	System.setProperty(key1, value1);
	d= new ChromeDriver(); 
	d.manage().window().maximize();
	d.navigate().to(Url);
    JavascriptExecutor j= ((JavascriptExecutor)d);
	 j.executeScript("scroll(0,2300)");
		  Thread.sleep(3000);
//Before inspecting element we need to change focus of selenium to child frame , by using frame id
		d.switchTo().frame("a077aa5e");	
		d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		Thread.sleep(2000);
		String parentid= d.getWindowHandle();
		System.out.println("main id= "+parentid);
		Set<String> pcids = d.getWindowHandles();
		System.out.println("main+ child="+pcids);
		for(String g :pcids) {
			if(!parentid.equals(g));
		d.switchTo().window(g);                                                                                                                                                                   
	   Thread.sleep(5000);
		}
		 j.executeScript("scroll(0,1400)");
     d.findElement(By.xpath("//a[@class='button-liveproject']")).click();
   
	d.switchTo().window(parentid);
    d.findElement(By.xpath("//input[@id='philadelphia-field-email']")).sendKeys("pradeep");
	 Thread.sleep(2000);
		 
		j.executeScript("scroll(0,-2300)");
		
		Thread.sleep(3000);
		d.quit();
	
	}
	public void check2() {
System.out.println("isme window handle, iframe, scroll down and scroll up bhi hai");
	}
public static void main(String[]args) throws InterruptedException {
	ImplementIframe i = new ImplementIframe();
	i.check();
	i.check2();
}
}
