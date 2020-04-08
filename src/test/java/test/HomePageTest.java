package test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.BasePage;
import main.HomePage;
import main.SearchPage;

public class HomePageTest extends BasePage {

	HomePage homePage; 
	SearchPage resultPage;
	
	
	public HomePageTest() {
		super();
		homePage = new HomePage();
		resultPage = new SearchPage();		
	}
	
	
	
	@Test
	public void firstResultTest1() throws InterruptedException {
		
		Thread.sleep(10000);
		homePage.oneTripTo();
		Thread.sleep(2000);		
		homePage.fromLocation("Coimbatore (CJB)");
		Thread.sleep(2000);
		homePage.toLocation("Chennai (MAA)");
		Thread.sleep(2000);
		homePage.departureDate();
		Thread.sleep(2000);
		homePage.search11();
		Thread.sleep(3000);
		
		String Final = resultPage.firstFlight();
		System.out.println(Final);
		
	}
	
	
	
	
}
