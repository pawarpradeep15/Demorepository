package actiTimePOMTest;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import actiTimePOM.ActiTimeHomepage;
import actiTimePOM.ActiTimeLoginpage;
import actiTimePOM.ActiTimeTimetrack;
import actiTimePOM.ActitimeReports;

public class ActiTimeTest1 {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\testing\\ChromeDriver94_SeleniumFile\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to("http://localhost/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ActiTimeLoginpage b = new ActiTimeLoginpage(driver);
	b.setActitimeUsername();
	b.setActittimePassword();
	b.verifyActitimelogin();
	Thread.sleep(5000);
   String parent= driver.getWindowHandle();
   System.out.println(parent);
   Set<String> pcids= driver.getWindowHandles();
   System.out.println(pcids);
  
	
	ActiTimeTimetrack n = new ActiTimeTimetrack(driver);
	n.ActitimetimeTask();
	Thread.sleep(4000);
	n.Timetask();
	driver.switchTo().window(parent);
	ActitimeReports c = new ActitimeReports(driver);
	c.clickreport();
	c.createreport();
	c.seeExample();
	driver.switchTo().window(parent);
	ActiTimeHomepage a = new ActiTimeHomepage(driver);
	a.ActitimeLogo();
	a.verifyLogout();
	Thread.sleep(5000);
	driver.close();
	
}

}
