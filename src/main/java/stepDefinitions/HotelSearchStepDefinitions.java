package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelSearchStepDefinitions {
	
	@And("user enters destination or hotel name in \"([^\"]*)\"")
	public void enterDestinationOrHotelName() {
		
	}
	
	@Then("Hotels search page should be displayed")
	public void hotels_search_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user enters source in the \"([^\"]*)\" , check-out in the date \"([^\"]*)\" and selects a Guests \"([^\"]*)\" date")
	public void user_enters_source_in_the_check_out_in_the_date_and_selects_a_Guests_date(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user should be able to get the Hotels page")
	public void user_should_be_able_to_get_the_Hotels_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	} 

}
