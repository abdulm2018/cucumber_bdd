package ui;

import org.openqa.selenium.By;

public class ExpediaUI {
	//flight tab
	public static final By FLIGHTS_TAB =By.xpath("//button[@id='tab-flight-tab-hp']");
	public static final String ROUND_TRIP ="//label[@id='flight-type-roundtrip-label-hp-flight']";
	public static final By FLYING_FROM = By.xpath("//*[@id='flight-origin-hp-flight']");
	public static final By DESTINATION = By.xpath("//*[@id=\"flight-destination-hp-flight\"]");
	public static final By DEPARTING = By.xpath("//*[@id=\"flight-departing-single-hp-flight\"]");
	public static final By SEARCH = By.xpath("(//button[@type='submit']/span[text()='Search'])[1]");
	
	

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
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/***
	 * Flight Search Result page elements
	 */
	public static final By SEARCH_RESULT_ELEMENT=By.xpath("//div[@class='grid-container standard-padding ']");
	public static final By AIRLINE_NAME = By.xpath(".//span[@data-test-id='airline-name']");
	public static final By PRICE= By.xpath(".//span[@data-test-id='listing-price-dollars']");
	public static final By DEPARTURE_TIME= By.xpath(".//span[@data-test-id='departure-time']");
	public static final By ARRIVAL_TIME= By.xpath(".//span[@data-test-id='arrival-time']");
	public static final By SELECT_BUTTON= By.xpath(".//button[@data-test-id='select-button']");
	
	//div[@class='grid-container standard-padding ']//span[@data-test-id='airline-name']
	//div[@class='grid-container standard-padding ']//span[@data-test-id='listing-price-dollars']
	//div[@class='grid-container standard-padding ']//button[@data-test-id='select-button']
	//div[@class='grid-container standard-padding ']//button[@data-test-id='departure-time']
	//div[@class='grid-container standard-padding ']//button[@data-test-id='arrival-time']

}
