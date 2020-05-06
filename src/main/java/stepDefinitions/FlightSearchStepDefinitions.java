package stepDefinitions;

import actions.FlightSearchAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchStepDefinitions extends FlightSearchAction{
	/*@Given("user is on the expedia default landing page")
	public void user_is_on_the_expedia_default_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/

	@Given("user clicks on \"([^\"]*)\" tab")
	public void user_clicks_on_tab(String string) {
	    clickFlightTab(string);
	}

	@Given("user clicks on \"([^\"]*)\" button")
	public void user_clicks_on_one_way_button(String flightType) {
	   clickOneWay(flightType);	
	   }

	@Then("flights search page should be displayed")
	public void flights_search_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		validateFlightSearchPage();
	    	}

	@When("user enters source in the \"([^\"]*)\" , destination in the \"([^\"]*)\" and selects a \"([^\"]*)\" date")
	public void user_enters_source_in_the_New_York_destination_in_the_Seattle_and_selects_a_date(String flyingFrom, String destination, String departingDate) {
	    // Write code here that turns the phrase above into concrete actions
	   enterFlyingFrom(flyingFrom);
	   enterDestination(destination);
	   enterDepartingDate(departingDate);
	}
	

	@When("clicks on \"([^\"]*)\" button")
	public void clicks_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    clickSearch();
	}
	@Then("user should be able to get the cheapest flight")
	public void user_should_be_able_to_get_the_cheapest_flight() {
	    System.out.println("Cheapest flight details\n"+getCheapestFlightDetails());
	}

	@Then("Search result should display the flights \"([^\"]*)\" ,\"([^\"]*)\" on the selected \"([^\"]*)\" date")
	public void search_result_should_display_the_flights_New_York_Seattle_on_the_selected_date(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
