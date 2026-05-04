package com.TestNG.BasicTestNg;

import org.testng.annotations.Test;

import org.testng.Assert;

public class TestNGAssertion {
  @Test
  public void testAssertion() {
	  String str1=new String("TestNG");
	  String str2=new String("TestNG");
	  String str3=null;
	  String str4="TestNG";
	  String str5="TestNG";
	  String str6=new String("Not_TestNG");
	  int val1=5;
	  int val2=6;
	  Assert.assertEquals(str1, str2);
	  System.out.println("Equals Assertion is successful");
	  Assert.assertNotEquals(str1,str6);
	  System.out.println("Not Equals Assertion is  successful");
	  Assert.assertTrue(val1<val2);
	  System.out.println("True Assert is successful");
	  Assert.assertFalse(val1>val2);
	  System.out.println("False Assert is successful");
	  Assert.assertNotNull(str1);
	  System.out.println("Not null Assert is successful");
	  Assert.assertNotNull(str3);
	  Assert.assertSame(str4, str5);
	  System.out.println("Same Assert is successful");
	  Assert.assertNotSame(str4, str5);
	  System.out.println("Not Same Assert is successful");
	  
  }
}
