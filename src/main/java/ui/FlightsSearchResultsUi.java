package ui;

import org.openqa.selenium.By;

public class FlightsSearchResultsUi {
	/***
	 * Flight Search Result page elements
	 */
	public static final By SEARCH_RESULT_ELEMENT=By.xpath("//div[@class='grid-container standard-padding ']");
	public static final By AIRLINE_NAME = By.xpath(".//span[@data-test-id='airline-name']");
	public static final By PRICE= By.xpath(".//span[@data-test-id='listing-price-dollars']");
	public static final By DEPARTURE_TIME= By.xpath(".//span[@data-test-id='departure-time']");
	public static final By ARRIVAL_TIME= By.xpath(".//span[@data-test-id='arrival-time']");
	public static final By SELECT_BUTTON= By.xpath(".//button[@data-test-id='select-button']");

}
