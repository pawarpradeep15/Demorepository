package amazonScenario1;

import org.openqa.selenium.WebDriver;

public abstract class AmazonSuper {
static String key1= "webdriver.edge.driver";
static String value1= "F:/testing/edgedriver/msedgedriver.exe";
static WebDriver d;
abstract public void Login();
abstract public void FireTvClub() throws InterruptedException;

}
