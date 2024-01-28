package com.test;

import org.testng.annotations.Test;

import com.dev.LibMath;

import static org.testng.Assert.assertEquals;

public class Addition {
  @Test
  public void testAdd() {
	  LibMath calc = new LibMath();
	  int actSum = calc.Sum(10, 20);
	  int expSum = 30;
	  
	  assertEquals(actSum, expSum);
	  System.out.println("Sum is: " +actSum);
  }
  
}
