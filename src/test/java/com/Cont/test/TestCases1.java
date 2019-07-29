package com.Cont.test;

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
	Assert.assertEquals("Akash", "Akash", "Failed to verify users first name");
}
}
