package com.Cont.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.base.utils.BaseTest;

public class TestCase2 extends BaseTest {
	@Test
	public void companyVerification() {
		test.log(Status.INFO, "Inside second test case");
		test.log(Status.INFO, "Starting test case");
		test.log(Status.INFO, "Before asserting");
		Assert.assertEquals("ContinuumPunes", "ContinuumPunes", "Failed to verify organization Name");
	}
}
