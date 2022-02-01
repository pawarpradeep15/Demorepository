package facebook_main;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_class.BaseClass;
import util_main.TestUtile;

public class Login_new extends BaseClass{

	@FindBy(id="email")
	private WebElement id;
	@FindBy(id="pass")
	private WebElement pass;	
	@FindBy(name="login")
	private WebElement sub;
	@FindBy(xpath="//img[@class='_97vu img']")
	private WebElement logo;
	@FindBy(xpath="//div[@class='_9ay7']")
	private WebElement failedmsg;
	



	public Login_new(WebDriver d) {
		PageFactory.initElements(d, this);

	}
	
	public String veryfyurl() {
		String url = d.getCurrentUrl();
		return url;
	}
	public String veryfytitle() {
		String title = d.getTitle();
		return title;
	}
	public String verylogin() throws EncryptedDocumentException, IOException {
		TestUtile aa = new TestUtile();
		String idname=aa.ExcelRead(1, 2);
		String idpass=aa.ExcelRead(2, 2);
		 id.sendKeys(idname);
		 pass.sendKeys(idpass);
		 sub.click();
		 String msg = failedmsg.getText();
		return msg;
		//https://www.facebook.com/
	}
	
	
}


