package test;

import org.testng.annotations.Test;

import main.BasePage;
import main.ExcelPage;
import main.HomePage;
import main.SearchPage;

public class SecondHomePageTest extends BasePage {

	HomePage homePage; 
	SearchPage resultPage;
	ExcelPage excelPage;
	
	public SecondHomePageTest() {
		homePage = new HomePage();
		resultPage = new SearchPage();
		excelPage = new ExcelPage();
	}
	
	@Test
	public void firstResultTest2() throws InterruptedException {
		
		System.out.println("Location Data from Excel : "+excelPage.ExcelData());
		
		
		
		Thread.sleep(10000);
		homePage.oneTripTo();
		Thread.sleep(2000);		
		homePage.fromLocation("Chennai (MAA)");
		Thread.sleep(2000);
		homePage.toLocation("Coimbatore (CJB)");
		Thread.sleep(2000);
		homePage.departureDate();
		Thread.sleep(2000);
		homePage.search22();
		Thread.sleep(3000);
		
		String Final = resultPage.firstFlight();
		System.out.println(Final);
		
	}
	
}
