package actiTimepageFactoryTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import actiTimePageFactory.ActiTimeTaskpf;
//import actiTimePageFactory.ActiTimeTaskpf;
import actiTimePageFactory.ActitimePFLogin;

public class ActiTimeTestPF {
	
public static void main(String args [] ) throws InterruptedException{
	System.setProperty("webdriver.edge.driver", "F:\\testing\\edgedriver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to("http://localhost/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Login testing task 1:	
	ActitimePFLogin a = new ActitimePFLogin(driver);
	
	a.setActitimeLoginPageUsernamePF();
	a.setActitimeLoginPageUsernamePF();
	a.verifyactitimeLoginPageLoginButtonPF();
	Thread.sleep(3000);
// Task 2- timetrack click and task name enabled or not
	ActiTimeTaskpf b = new ActiTimeTaskpf(driver);
	b.setActitimeTimetrackClick();
	b.setActitimeTimetracktask();
}
}