/**
 * @author lexer - lemarshall1
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author lexer
 *
 */
public class TestRunner {
	public static void main(String[] args) {
		Result result =
				JUnitCore.runClasses (AllTests.class);

					for (Failure failure : result.getFailures()) {
					System.out.println(failure.toString());
					}

					System.out.println(result.wasSuccessful());

				}
}
