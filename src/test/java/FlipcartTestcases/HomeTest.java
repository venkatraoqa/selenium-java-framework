package FlipcartTestcases;




import org.testng.Assert;
import org.testng.annotations.Test;

import FlipcartBase.BaseTest;
import FlipcartPages.Homepage;


public class HomeTest extends BaseTest {
	@Test
	public void verifyhomepageelements() throws InterruptedException {
		Homepage home = new Homepage(driver);
		home.closeloginbtn();
		
//		 Assert.assertTrue(home.logodisplayed(), "Logo is not displayed");
		boolean status = home.logodisplayed();
		System.out.println("Logo displayed status: " + status);

		Assert.assertTrue(status, "Logo is not displayed");
		
		boolean status1 = home.sear5chenabled();
		System.out.println("Search enabled status: " + status1);
		
//		Searchpage search = new Searchpage(driver);
//		search.searchproduct("iPhone 14");
		
	
		
	}
	
	 

}
