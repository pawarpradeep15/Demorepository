package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 implements BossScreenShot{

	static WebDriver d ;
	public void screen() throws IOException {
	System.setProperty(key1, value);
	d= new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://seleniumpractise.blogspot.com/");
 File s = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
  String path = "F:\\testing\\screenshots\\defect1.png";	
  File f = new File(path);
  FileHandler.copy(s, f);
  d.close();
	}

    public void screen2() throws IOException {
	System.setProperty(key1, value);
	d= new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to("https://www.youtube.com/watch?v=puk0mUEmLvc&list=RDpuk0mUEmLvc&start_radio=1");
	File s = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	String path = "F:\\testing\\screenshots\\defect2.png";
	File f = new File(path);
	FileHandler.copy(s, f);
	d.close();	
		
	}

	public void screen3() throws IOException {
	System.setProperty(key1, value);
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to("https://www.amazon.in/");
	File s = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	String path = "F:\\testing\\screenshots\\defect3.png";
	File f = new File(path);
	FileHandler.copy(s, f);
	d.close();
	}
public static void main(String[]args) throws IOException {
	Screenshot1 s = new Screenshot1();
	s.screen();
	s.screen2();
	s.screen3();
}

}
