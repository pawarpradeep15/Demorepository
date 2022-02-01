package base_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static String arg1="webdriver.chrome.driver";
	protected static String value="Z:\\Selenium Files\\Web-Driver\\Chrome\\chromedriver.exe";

	public static WebDriver d;

	public void StartBrowser() {
		// TODO Auto-generated method stub
		System.out.println("The Browser has been Started .....");

	}
	public void LaunchChrom() {
		// TODO Auto-generated method stub
		System.setProperty(arg1, value);
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();

		d.navigate().to("https://www.facebook.com/login/");

	}
	public void EndBrowser() {
		// TODO Auto-generated method stub
		d.close();
		System.out.println("The Browser has been Started .....");
	}
}

