package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointClass extends BossClass {
public void setposition() throws InterruptedException {
	System.setProperty(key1, value1);
	WebDriver w = new ChromeDriver();
	w.manage().window().maximize();
	w.get("https://www.facebook.com/");
	Point p = new Point(500,400);
	w.manage().window().setPosition(p);
	w.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Suyog77");
	w.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("Shine1990");
	w.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	Thread.sleep(10000);
	w.close();
}
public static void main(String[]args) throws InterruptedException {
	PointClass P = new PointClass();
	P.setposition();
}
}
