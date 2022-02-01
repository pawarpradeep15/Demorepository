package locators;




import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle extends BossClass{
public void Handle() {
	System.setProperty(key2, value2);
	WebDriver w = new FirefoxDriver();
	w.manage().window().maximize();
	w.get("https://www.naukri.com/");
	String parentID=  w.getWindowHandle();
	System.out.println("main window id="+parentID);
	Set<String>pcids = w.getWindowHandles();
	System.out.println("main + child window ids="+pcids);
}
public static void main(String[]args) {
	WindowHandle h = new WindowHandle();
	h.Handle();
}
}
