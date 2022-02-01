package amazonScenario1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class AmazonLogin extends AmazonSuper {


	public void Login() {
	System.out.println("Login credentials entering started soon");
	//to click signIn
	d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	//enter user name
	d.findElement(By.id("ap_email")).sendKeys("8600602755");
	//continue button
	d.findElement(By.id("continue")).click();
    //password
    d.findElement(By.name("password")).sendKeys("Shine9630");
	
	d.findElement(By.id("signInSubmit")).click();
 
		
	}

	
	public void FireTvClub() throws InterruptedException {
    WebElement all = d.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
   boolean s = all.isEnabled();
   System.out.println("element is enable="+s);
   all.click();
   
	WebElement FireTv = d.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
	Thread.sleep(2000);
	boolean p = FireTv.isDisplayed();
	System.out.println("Element is diplayed?="+p);
	FireTv.click();
	
	
	d.findElement(By.xpath("//a[text()='Fire TV Cube']")).click();
	Thread.sleep(2000);
	System.out.println("Scenario is successfully passed");
		
	}
public static void main(String []args) throws InterruptedException {
	System.setProperty(key1, value1);
	d= new EdgeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("https://www.amazon.in/");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	AmazonLogin a = new AmazonLogin();
	a.Login();
	a.FireTvClub();
	d.close();
}
}
