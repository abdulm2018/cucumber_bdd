package ui;

import org.openqa.selenium.By;

public class ExpediaUI {
	//flight tab
	public static final By FLIGHTS_TAB =By.xpath("//button[@id='tab-flight-tab-hp']");
	
	
	//generic xpath for tabs
	/**
	 * This method returns tab elements on expedia home page, to get the tab elements pass tab name e.g Flights , Hotels , Bundle and Save , Cars , Cruises , Vacation Rentals as argument
	 * @param tabName
	 * @return By 
	 */
	public static final By tabElement(String tabName) {
		return By.xpath("//span[contains(.,'"+tabName+"') and @class='tab-label']");
	}
	
	public static final By flightType(String flightType) {
		return By.xpath("//span[contains(.,'"+flightType +"')]");
	}
	

}
