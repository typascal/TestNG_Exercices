package TestngTutorials;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestngScript {

	
	@Test(priority=1, description = "This is a login fonction")
	public void LoginApplication() {
		System.out.println("This is a first script");
		Assert.assertEquals(12, 23);
	}
	
	@Test(priority=2, description= "This is an Item selection")
	public void SelectItems() {
		System.out.println("Items selected");
	}
	
	@Test(priority=3, description="This is a checkout")
	public void Checkout() {
		System.out.println("Checkout completed");
	}
}
