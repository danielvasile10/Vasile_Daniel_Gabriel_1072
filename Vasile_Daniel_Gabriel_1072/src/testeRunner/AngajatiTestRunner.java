package testeRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import teste.AngajatiTest;

public class AngajatiTestRunner {
	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(AngajatiTest.class);
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
