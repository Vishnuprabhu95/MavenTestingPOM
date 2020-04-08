package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
	
		//WebElement
		public WebElement FirstFlight()
		{
			return driver.findElement(By.xpath("//span[@class='ico13 padR10 padL5']"));
		}		
			
		//Action
		public String firstFlight() {
			String flight = FirstFlight().getText();
			return flight;
		}
}
