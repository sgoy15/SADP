package com.SADP.logger;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogger {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//Logger logger=new ConsoleLogger();
		Logger logger=ConsoleLogger.getInstance();
		System.out.println(logger);
		
	}

}
