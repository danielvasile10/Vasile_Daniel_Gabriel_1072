package testeRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import teste.AbonatiTest;

public class AbonatiTestRunner {
	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(AbonatiTest.class);
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
