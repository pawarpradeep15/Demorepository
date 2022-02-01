package popHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowhandle {
String key1= "webdriver.edge.driver";
String value1= "F:\\testing\\edgedriver\\msedgedriver.exe";
void check1() throws InterruptedException {
	System.setProperty(key1, value1);
	WebDriver d= new EdgeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("https://www.naukri.com/");
	Thread.sleep(15000);///Alert is shown after few seconds so i have provided 10 seconds time.
WebElement idea = d.findElement(By.xpath("//span[@id='block']"));
//WebElement idea = d.findElement(By.xpath("//p[@class='caption']"));
System.out.println(idea.getText());

	//for getting parent id and pcids.
	String parentid = d.getWindowHandle();
	System.out.println("main id="+parentid);
	Set<String> pcids = d.getWindowHandles();
	System.out.println("main+child id ="+pcids);
	//For close the popup window we need to write loop.
	for(String w: pcids) {
		if(!parentid.equals(w));
		d.switchTo().window(w);
		String title = d.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
d.close();
	}
		
	}



public static void main(String args []) throws InterruptedException {
	Windowhandle p = new Windowhandle();
	p.check1();
}
}
