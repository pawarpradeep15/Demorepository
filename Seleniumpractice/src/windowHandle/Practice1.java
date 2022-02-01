package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice1  {


	void Handle1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\testing\\Chromedriver\\chromedriver.exe" );
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	d.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
	String parentID = d.getWindowHandle();
	System.out.println("Main Window ID's "+parentID);
	Set<String> pcids = d.getWindowHandles();
	System.out.println("Main + Child Window ID's "+pcids);
	for(String q :pcids) {
		if(!parentID.equals(q)) {
//if you want to perform an action on child window then we need to change selenium focus by switch to method..
			
			d.switchTo().window(q);
			WebElement r = d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			r.sendKeys("Pune");
			r.submit();
			//d.findElement(By.xpath("//input[@data-ved='0ahUKEwjGlYWki9TzAhWJF7kGHTaiDY0Q39UDCAQ']")).click();
			Thread.sleep(4000);
			d.close();
			d.switchTo().window(parentID);
			WebElement i = d.findElement(By.xpath("//a[@class='post-count-link']"));
			i.click();
			Thread.sleep(3000);
			d.navigate().back();
		System.out.println("Second scenario is started");
		  d.findElement(By.xpath("(//a[contains(text(),' Click this link to start new Tab ')])[3]")).click();
		  Set<String> pcids1 = d.getWindowHandles();
		  System.out.println("main+child="+pcids1);
		  for(String a :pcids1) {
				if(!parentID.equals(a)) {
			d.switchTo().window(a);
		 WebElement cl = d.findElement(By.xpath("//input[@id='yschsp']"));
		 cl.sendKeys("pune");
		 cl.submit();
		 System.out.println("second scenario is completed");
		  d.close();
         d.switchTo().window(parentID)	;
         
   System.out.println("Scroll down scenario started");  
   
    JavascriptExecutor j= ((JavascriptExecutor)d);
    j.executeScript("scroll(0,400)");
    
    
    System.out.println("Entering into iframe");
  
   d.switchTo().frame("comment-editor");
    d.findElement(By.xpath("//textarea[@name='commentBody']")).sendKeys("This is trial by Pradeep pawar");
    d.switchTo().defaultContent(); 
    d.quit();
    System.out.println("All scenarios are successfully completed");
				}
	
		}
	
		}
		
	}

	}

public static void main(String args []) throws InterruptedException {
	Practice1 p = new Practice1();
	p.Handle1();
	
}
}
