package test.takipi;

public class UncaughtExceptionTester
{
	
	public static void boom() throws Exception
	{
		int x = 5, y = 0;
		
		System.out.println("Throwing Uncaught Exception.");
		int z = x / y;
	}

}
