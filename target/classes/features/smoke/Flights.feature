Feature: Flight Search
Scenario Outline: Search a one way flight 
Given user is on the expedia default landing page
And user clicks on "Flights" tab
Then flights search page should be displayed
And user clicks on "One way" button
When user enters source in the <FlyingFrom> , destination in the <GoingTo> and selects a <departing> date
And clicks on "Search" button
Then user should be able to get the cheapest flight
#Then Search result should display the flights <FlyingFrom> ,<GoingTo> on the selected <departing> date
                                                                                                                                                                                                                                                        
Examples:            
|FlyingFrom|GoingTo  |departing  |       
|"New York"  |"Seattle"  | "05/04/2020"|                                    	
                                                                                                                                                     