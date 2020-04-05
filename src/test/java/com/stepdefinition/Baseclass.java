package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Newsamplae\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		screenshot();
		return driver ;
		
	}

	public void loadurl(String url) {
		driver.get(url);
		screenshot();
	}

	public void fill(WebElement element, String name) {

		element.sendKeys(name);
		screenshot();
	}

	public void click( WebElement element) {
		element.click();
		
	}

	public void selectTextByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
		screenshot();
	}

	public void selectTextByAttribute(WebElement element, String name) {

		new Select(element).selectByValue(name);
		screenshot();
	}

	public void selectByText(WebElement element, String name) {
		new Select(element).selectByVisibleText(name);
		screenshot();
	}
	public void filljavascript(WebElement element,String name ) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].SetAttribute('value','"+name+"')",element ); 
		screenshot();
	}
public String generateRandomDate() {
	return new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmss").format(new Date());
	
} 
public String getTitle() {
	return driver.getTitle();
	
}
public String getAttribute(WebElement element)   {
	return element.getAttribute("value");

	
	}
public void screenshot() {
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des= new File("C:\\Users\\DELL\\eclipse-workspace\\Abc\\screenshot"+generateRandamData()+".png"); 

	try {
		FileUtils.copyFile(s,des);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
private String generateRandamData() {
	
	return null;
}

public void quitBrowser() {
	driver.quit();
} 




}
