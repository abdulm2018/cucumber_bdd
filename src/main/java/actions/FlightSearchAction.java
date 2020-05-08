package actions;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frameworkUtils.CoreUtils;
import ui.ExpediaUI;
import ui.FlightsSearchResultsUi;
import ui.FlightsUi;

public class FlightSearchAction extends CoreUtils {

	

	public void clickOneWay(String flightType) {
		click(ExpediaUI.flightType(flightType));
	}

	public void validateFlightSearchPage() {
		assertTrue(isDisplayed(ExpediaUI.flightType("Roundtrip")));
	}

	public void enterFlyingFrom(String flyingFrom) {
		typeText(FlightsUi.FLYING_FROM, flyingFrom);
		pressEnterKey(FlightsUi.FLYING_FROM);
	}

	public void enterDestination(String destination) {
		typeText(FlightsUi.DESTINATION, destination);
		pressEnterKey(FlightsUi.DESTINATION);
	}

	public void enterDepartingDate(String departingDate) {
		typeText(FlightsUi.DEPARTING, departingDate);
		pressEscKey(FlightsUi.DEPARTING);
	}

	public void clickSearch() {
		click(FlightsUi.SEARCH);
	}

	private List<WebElement> getSearchResults() {
		return findElements(FlightsSearchResultsUi.SEARCH_RESULT_ELEMENT);
	}

	public List<List<String>> getAllFlightDetails() {
		//List<String> flightDetails = new ArrayList<String>();
		List<List<String>> allFlightDetails = new ArrayList<List<String>>();
		List<WebElement> searchResultElements = getSearchResults();
		for (WebElement searchResultElement : searchResultElements) {
			List<String> flightDetails = new ArrayList<String>();
			flightDetails.add(searchResultElement.findElement(FlightsSearchResultsUi.AIRLINE_NAME).getText());
			flightDetails.add(searchResultElement.findElement(FlightsSearchResultsUi.DEPARTURE_TIME).getText());
			flightDetails.add(searchResultElement.findElement(FlightsSearchResultsUi.ARRIVAL_TIME).getText());
			flightDetails.add(searchResultElement.findElement(FlightsSearchResultsUi.PRICE).getText());
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
			if(searchResultElement.findElement(FlightsSearchResultsUi.PRICE).getText().trim().equals(cheapestFlight.trim())) {
				click(searchResultElement.findElement(FlightsSearchResultsUi.SELECT_BUTTON));
			}
			
		}
	}

}
