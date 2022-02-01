package windowHandle;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class WindowChild extends Window {

	WebDriver d;
	void Handle1() throws InterruptedException {
	System.setProperty(key, value);
	d= new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("https://optinmonster.com/types-of-popups-for-your-site/");
	Thread.sleep(3000);
	String parentid  = d.getWindowHandle();	
	System.out.println("Main window id=" +parentid);
	Set<String> pcids= d.getWindowHandles();
	System.out.println("Main + child = "+pcids);
	for(String s:pcids) {
		if(!parentid.equalsIgnoreCase(s)) {
		d.switchTo().window(s);
		System.out.println(d.getTitle());
		
		d.close();

		}}
	//if you want to move main window then you need to change your selenium webdriver focus from child to parent window
	//for that purpose we use switch to method...
	d.switchTo().window(parentid);
	JavascriptExecutor j= ((JavascriptExecutor)d);
	j.executeScript("scroll(0,500)");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='oakland-field-name']")).sendKeys("pradeep pawar");
	d.findElement(By.xpath("//input[@id='oakland-field-email']")).sendKeys("pawarpradeep15");
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.close();

	}

	
	void Handle2() {;
	System.out.println("mission succesful");

		
	}
public static void main (String[]args) throws InterruptedException {
WindowChild w= new WindowChild();
w.Handle1();
w.Handle2();

}
}
