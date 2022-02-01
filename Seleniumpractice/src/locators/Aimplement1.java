package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aimplement1 implements AbigBoss {

static WebDriver w;	
	public void welcome() {
	System.out.println("Welcome to locator use");
	}

public void tagname() {
	System.setProperty(key1, value1);
	w = new ChromeDriver();
	w.get("file:///F:/testing/vcity.html");
	w.findElement(By.tagName("input")).sendKeys("Pradeep Pawar");

	
		
	}
      public void test() {
		System.setProperty(key1, value1);
		w = new ChromeDriver();
		w.get("file:///F:/testing/vcity.html");
		String ActualTitle = w.getTitle();
		System.out.println("Title is ="+ActualTitle);
	
		
	}
	public static void main(String[]args) {
	Aimplement1 a = new Aimplement1();
	a.welcome();
	a.tagname();
	a.test();
	}

}
