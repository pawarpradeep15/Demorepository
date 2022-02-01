package locators;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClass extends BossClass {
public void Point() throws InterruptedException {
System.setProperty(key1, value1);
WebDriver n = new ChromeDriver();
n.navigate().to("https://www.facebook.com/");
Dimension P = new Dimension(900,800);
n.manage().window().setSize(P);
n.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Suyog77");
n.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("Shine1990");
n.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
Thread.sleep(10000);
n.close();
}
public static void main(String[]args) throws InterruptedException {
	DimensionClass x= new DimensionClass();
	x.Point();
}
}

