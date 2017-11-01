package com.automationpractcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTest {
	public void At_2(){
		  System.setProperty("webdriver.gecko.driver","D:\\JARS\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("http://www.google.co.in");
		  driver.findElement(By.name("q")).sendKeys("murali");
	}

}
