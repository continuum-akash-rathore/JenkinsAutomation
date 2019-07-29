package com.Cont.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.base.utils.BaseTest;

public class TestCases1 extends BaseTest {

@Test
public void userNameVerification() {
	test.log(Status.INFO, "Inside first test case");
	test.log(Status.INFO, "Starting test case");
	test.log(Status.INFO, "Before asserting");
	System.out.println(System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	Assert.assertEquals("Akash1", "Akash1", "Failed to verify users first name");
}
}
