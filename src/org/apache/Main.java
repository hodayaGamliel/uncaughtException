package org.apache;

import test.takipi.UncaughtExceptionTester;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Waiting 10 seconds...");
			Thread.sleep(10000);
			UncaughtExceptionTester.boom();
		}
		catch (Exception e)
		{
			System.out.println("Caught Exception.");
			e.printStackTrace();
			
			try
			{
				System.out.println("Waiting 10 seconds...");
				Thread.sleep(10000);
			}
			catch (InterruptedException e1)
			{
			}
		}
		
		System.out.println("---- Tester finished ----");
	}
}
