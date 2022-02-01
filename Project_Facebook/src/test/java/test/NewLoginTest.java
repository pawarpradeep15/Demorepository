package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_class.BaseClass;
import facebook_main.Login_new;
@Listeners(listners.Listners1.class)
public class NewLoginTest {

	
	@BeforeTest
	public void initiate() {
		BaseClass bs=new BaseClass();
		bs.StartBrowser();
		bs.LaunchChrom();
	}
	
	@Test
	public void test1() {
		Login_new ls=new Login_new(BaseClass.d);
		String url = ls.veryfyurl();
		Assert.assertEquals(url,"https://www.facebook.com/login/" );
	}
	@Test
	public void test2() {
		Login_new ls=new Login_new(BaseClass.d);
		String title = ls.veryfytitle();
		System.out.println(title);
		String exptitle="Log in to Facebook";
		Assert.assertEquals(title,exptitle);
		
	}
	@Test
	public void test3() throws EncryptedDocumentException, IOException {
		Login_new ls=new Login_new(BaseClass.d);
		String aj = ls.verylogin();
		String msg= "The password that you've entered is incorrect. Forgotten password";
		Assert.assertEquals(aj, msg);
	}
	
	@AfterTest
	public void end() {
		BaseClass bs=new BaseClass();
		bs.EndBrowser();
	}
	
	
}
