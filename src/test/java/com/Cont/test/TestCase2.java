package com.Cont.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.base.utils.BaseTest;

public class TestCase2 extends BaseTest {
	@Test
	public void companyVerification() {
System.out.println(System.getProperty("user.dir") +"/test-output/testReport.html");
		test.log(Status.INFO, "Inside second test case");
		test.log(Status.INFO, "Starting test case");
		Assert.assertEquals("ContinuumPune", "ContinuuMumbai112", "Failed to verify organization Name");
	}
}
