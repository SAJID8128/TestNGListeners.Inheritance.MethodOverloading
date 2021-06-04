package testNGListeners;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubBaseTest extends BaseTest {
	
	@Test(priority = 1, groups = {"smoke","regression"})
	@Parameters("Mercury")
	public void mercuryTest(String mercury) {
		System.out.println("Test results on the planet Mercury.");
		System.out.println("This is the parameter for " + mercury);
		Assert.assertEquals(22, 33);
	}
	
	@Test(priority = 2, dependsOnMethods = {"mercuryTest"}, groups = {"smoke"})
	@Parameters("Venus")
	public void venusTest(String venus) {
		System.out.println("Test results on the planet Venus.");
		System.out.println("This is the parmeter for " + venus);
	}
	 
	@Test(priority = 3, groups = {"smoke","functional","regression"})
	@Parameters("Earth")
	public void earthTest(String earth) {
		System.out.println("Test results on the planet Earth.");
		System.out.println("This is the parmeter for " + earth);
	}
	
	@Test(priority = 4, groups = {"smoke","regression"})
	@Parameters("Mars")
	public void marsTest(String mars) {
		System.out.println("Test results on the planet Mars.");
		System.out.println("This is the prameter for " + mars);
	}
	
	@Test(priority = 5, groups = {"smoke","regression"})
	@Parameters("Jupiter")
	public void jupiterTest(String jupiter) {
		System.out.println("Test results on the planet Jupiter.");
		System.out.println("This is the prameter " + jupiter);
	}
	
	@Test(priority = 6, groups = {"smoke","regression"})
	@Parameters("Saturn")
	public void saturnTest(String saturn) {
		System.out.println("Test results of the planet Saturn.");
		System.out.println("This is the parameter for " + saturn);
	}
	
	@Test(priority = 7, groups = {"smoke","regression"})
	@Parameters("Uranus")
	public void uranusTest(String uranus) {
		System.out.println("Test results on the planet Uranus.");
		System.out.println("This is the parameter for " + uranus);
	}
	
	@Test(priority = 8, groups = {"smoke","regression"})
	@Parameters("Neptune")
	public void neptuneTest(String neptune) {
		System.out.println("Test results on the planet Neptune.");
		System.out.println("This is the parameter for " + neptune);
	}

}
