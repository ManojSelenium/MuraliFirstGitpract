package com.automationpractcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.utility.SetUp;

public class FirstTest implements SetUp{
  @Test
  public void AT_1() {
	  System.setProperty("webdriver.gecko.driver","D:\\JARS\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get(AUTOMATIONURL);
	  System.out.println("murali git changes");
  }
}
