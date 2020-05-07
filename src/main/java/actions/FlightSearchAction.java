package actions;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frameworkUtils.CoreUtils;
import ui.ExpediaUI;

public class FlightSearchAction extends CoreUtils {

	public void clickFlightTab(String tabName) {

		click(ExpediaUI.tabElement(tabName));

	}

	public void clickOneWay(String flightType) {
		click(ExpediaUI.flightType(flightType));
	}

	public void validateFlightSearchPage() {
		assertTrue(isDisplayed(ExpediaUI.flightType("Roundtrip")));
	}

	public void enterFlyingFrom(String flyingFrom) {
		typeText(ExpediaUI.FLYING_FROM, flyingFrom);
		pressEnterKey(ExpediaUI.FLYING_FROM);
	}

	public void enterDestination(String destination) {
		typeText(ExpediaUI.DESTINATION, destination);
		pressEnterKey(ExpediaUI.DESTINATION);
	}

	public void enterDepartingDate(String departingDate) {
		typeText(ExpediaUI.DEPARTING, departingDate);
		pressEscKey(ExpediaUI.DEPARTING);
	}

	public void clickSearch() {
		click(ExpediaUI.SEARCH);
	}

	private List<WebElement> getSearchResults() {
		return findElements(ExpediaUI.SEARCH_RESULT_ELEMENT);
	}

	public List<List<String>> getAllFlightDetails() {
		//List<String> flightDetails = new ArrayList<String>();
		List<List<String>> allFlightDetails = new ArrayList<List<String>>();
		List<WebElement> searchResultElements = getSearchResults();
		for (WebElement searchResultElement : searchResultElements) {
			List<String> flightDetails = new ArrayList<String>();
			flightDetails.add(searchResultElement.findElement(ExpediaUI.AIRLINE_NAME).getText());
			flightDetails.add(searchResultElement.findElement(ExpediaUI.DEPARTURE_TIME).getText());
			flightDetails.add(searchResultElement.findElement(ExpediaUI.ARRIVAL_TIME).getText());
			flightDetails.add(searchResultElement.findElement(ExpediaUI.PRICE).getText());
			allFlightDetails.add(flightDetails);
		}
		return allFlightDetails;
	}

	public List<String> getCheapestFlightDetails() {
		List<List<String>> allFlightDetails = getAllFlightDetails();
		List<String> cheapestFlightDetails = allFlightDetails.get(0);
		for (List<String> flightDetails : allFlightDetails) {
			if (Integer.parseInt(cheapestFlightDetails.get(3).replaceAll("[$Rs,]", "").trim()) > Integer.parseInt(flightDetails.get(3).replaceAll("[$Rs,]", "").trim())) {
				cheapestFlightDetails = flightDetails;
				//System.out.println("---->"+cheapestFlightDetails);
			}
		}
		return cheapestFlightDetails;
	}

	public void selectCheapestFlight() {
		List<WebElement> allSearchResults = getSearchResults();
		String cheapestFlight = getCheapestFlightDetails().get(3);
		System.out.println("Cheapest flight price "+cheapestFlight);
		for (WebElement searchResultElement : allSearchResults) {
			if(searchResultElement.findElement(ExpediaUI.PRICE).getText().trim().equals(cheapestFlight.trim())) {
				click(searchResultElement.findElement(ExpediaUI.SELECT_BUTTON));
			}
			
		}
	}

}
