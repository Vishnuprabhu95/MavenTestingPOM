package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	//Elements
	
		public WebElement oneTrip()
		{
			return driver.findElement(By.id("oneway"));
		}
	
		public WebElement From()
		{
			return driver.findElement(By.id("gosuggest_inputSrc"));
		}
		
		public WebElement To()
		{
			return driver.findElement(By.id("gosuggest_inputDest"));
		}
		
		public WebElement Departure()
		{
			return driver.findElement(By.xpath("//input[@placeholder='Departure']"));
		}
		
		public WebElement D_Date()
		{
			return driver.findElement(By.xpath("//div[@id='fare_20200430']"));
		}
		
		public WebElement Return()
		{
			return driver.findElement(By.xpath("//div[@class='dF whiteBg col-md-2 col-sm-5 alignItemsCenter']/input"));
		}
		
		public WebElement R_Date()
		{
			return driver.findElement(By.xpath("//div[@id='fare_20200430']"));
		}
		
		public WebElement search1()
		{
			return driver.findElement(By.xpath("//button[@type='submit']"));
		}
	
		
		//Actions
		
		public void oneTripTo() {
			oneTrip().click();
		}
		
		public void fromLocation(String from) {
			From().sendKeys(from);
			robot();
		}
		public void toLocation(String to) {
			To().sendKeys(to);
			robot();
		}
		public void departureDate() {
			Departure().click();
			D_Date().click();
		}
		public void returnDate() {
			Return().click();
			R_Date().click();
		}
		public void search11() {	

			//search1().click();
			driver.get("https://www.goibibo.com/flights/air-CJB-MAA-20200430--1-0-0-E-D/");
			System.out.println("CBE - CHN");
		}	
		public void search22() {	

			//search1().click();
			driver.get("https://www.goibibo.com/flights/air-MAA-CJB-20200430--1-0-0-E-D/");
			System.out.println("CHN - CBE");
		}	
		
}
