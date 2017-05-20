package com.SADP.logger;

public class ConsoleLogger implements Logger {
	private static ConsoleLogger instance;
	
	@Override
	public void logger(String message)
	{
		System.out.println(message);
	}
	

	public static ConsoleLogger getInstance(){
		
		if(instance==null)
		{
			return ConsoleLogger.instance;
		}
		
		return instance;
	}
 
}
