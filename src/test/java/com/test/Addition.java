package com.test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Addition {
  @Test
  public void testAdd() {
	int num1 = 5;
	int num2 = 4;
	int actSum = num1+ num2;
	int expSum = 9;
	
	assertEquals(actSum, expSum);
	System.out.println("Sum is: " +actSum);
  }
  
}
