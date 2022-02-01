package util_main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import base_class.BaseClass;

public class TestUtile extends BaseClass{

	public void ScreenShot(String a) throws IOException {
		String name=a;
        String loc="Z:\\Class _QA_Testing\\Eclips 2021 06\\EclipsWorkspace2021_06\\Project_Facebook\\FailedTestScreenshots\\"+name+".png";
		File img = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File path = new File(loc);
		FileHandler.copy(img, path);
	}
	
	public void Scroll(WebElement driver,int x,int y) {
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("scroll("+x+","+y+")");
	}
	
	public String ExcelRead(int x,int y) throws EncryptedDocumentException, IOException {
		String path="Z:\\Class _QA_Testing\\Eclips 2021 06\\EclipsWorkspace2021_06\\Project_Facebook\\src\\main\\java\\testdata\\testData.xlsx";
		
		FileInputStream input = new FileInputStream(path);
		String val=WorkbookFactory.create(input).getSheet("").getRow(x).getCell(y).getStringCellValue();
		return val;
	}

}
