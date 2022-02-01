package pratice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowsercheckImplement implements  Browsercheck2{

 static  WebDriver d;
	public void chromecheck() {
		System.setProperty("webdriver.chrome.driver","F:\\testing\\ChromeDriver94_SeleniumFile\\chromedriver.exe");
		d =  new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	d.close();
		}
public void firefoxcheck() {
	System.setProperty("webdriver.gecko.driver","F:\\testing\\geckodriver\\geckodriver.exe");
	d = new FirefoxDriver();
	d.manage().window().maximize();
	d.get("file:///F:/testing/vcity.html");
	d.close();	}

	public void youtube() {

		}
	public static void main(String[]args) {
	BrowsercheckImplement y = new BrowsercheckImplement();
	y.chromecheck();
	y.firefoxcheck();
	y.youtube();
	}
}