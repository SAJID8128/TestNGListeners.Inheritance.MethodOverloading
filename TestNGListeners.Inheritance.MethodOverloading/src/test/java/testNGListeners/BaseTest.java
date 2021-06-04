package testNGListeners;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	@BeforeTest(groups = {"smoke"})
	@Parameters("Login")
	public void loginTest(String login) {		
		System.out.println("This is a " + login);
		System.out.println("Now opening the browser.");
	}

	@AfterTest(groups = {"smoke", "regression"})
	@Parameters("Logout")
	public void logoutTest(String logout) {		
		System.out.println("This is a " + logout);
		System.out.println("Now closing the browser.");
	}

}
