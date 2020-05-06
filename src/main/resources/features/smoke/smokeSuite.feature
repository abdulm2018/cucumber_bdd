Feature: Smoke suite expedia
@t1
Scenario: Verify that user is able to navigate through all the tabs
Given user is on the expedia default landing page
When user clicks on Flights , flights tab should be selected
And user should be able to see the flight booking options