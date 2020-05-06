package stepDefinitions;

import actions.ExpediaAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExpediaStepDefenitions extends ExpediaAction{
	@Given("user is on the expedia default landing page")
	public void user_is_on_the_home_page() {
	    navigateToExpediaHomePage();
	}

	@When("user clicks on Flights , flights tab should be selected")
	public void user_clicks_on_Flights_flights_tab_should_be_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    clickFlightsTab();
	}

	@When("user should be able to see the flight booking options")
	public void user_should_be_able_to_see_the_flight_booking_options() {
	    
	}

}
