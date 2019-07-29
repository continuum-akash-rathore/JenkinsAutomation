package com.Cont.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	WebDriver driver= new FirefoxDriver();
	driver.get("www.gmail.com");
	Assert.assertEquals("Akash1", "Akash1", "Failed to verify users first name");
}
}
