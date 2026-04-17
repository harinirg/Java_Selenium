package com.TestNG.BasicTestNg;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class GroupDemoTest {
	@Test(groups="groupA")
	public void testMethod1ForGroupA() {
		System.out.println("Running test method for groupA");
	}
	@Test(groups="groupA")
	public void testMethod2ForGroupA() {
		System.out.println("Running test method2 for groupA");
		//Assert.fail();

	}
	@Test(groups="groupB")
	public void testMethod1ForGroupB() {
		System.out.println("Running test method1 for groupB");

	}
	@Test(groups="groupB")
	public void testMethod2ForGroupB() {
		System.out.println("Running test method2 for groupB");

	}
	@Test(dependsOnGroups="groupA")
	public void dependentTestOnGroupA() {
		System.out.println("Running the dependent test");
	}
	
}
