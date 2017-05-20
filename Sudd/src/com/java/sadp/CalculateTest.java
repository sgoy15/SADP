package com.java.sadp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.sadp.Calculate.operation;

public class CalculateTest {

//	@Test
//	public void testCalculate() {
//		fail("Not yet implemented");
//	}

	  @Test
      public void multiplicationOfZeroIntegersShouldReturnZero() {
              Calculate tester = new Calculate(); // MyClass is tested

              // assert statements
              assertEquals("10 x 0 must be 0", 0, tester.calculate(10, 0,operation.Multiply));
              
            
      }

	  @Test(expected=ArithmeticException.class)
      public void division() {
              Calculate test = new Calculate(); // MyClass is tested

             test.calculate(10, 0,operation.Divide);
            
      }
	  
	  @Test
      public void addition() {
              Calculate test = new Calculate(); // MyClass is tested

              // assert statements
              assertEquals("10+0 must be 10", 10, test.calculate(10, 0,operation.Add));
            
      }
	  
	  @Test
      public void subtraction() {
              Calculate test = new Calculate(); // MyClass is tested

              // assert statements
              assertEquals("0-10 must be -10", -10, test.calculate(0, 10,operation.Subtract));
            
      }
    
	
}
