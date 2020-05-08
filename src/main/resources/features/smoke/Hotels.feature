Feature: Hotel Search 

Background: 
	Given user is on the expedia default landing page 
	And user clicks on "Hotels" tab 
	Then Hotels search page should be displayed 
	
Scenario Outline: Search Hotel  one way flight 

	And user enters destination or hotel name in <Going to>  
	
	When user enters source in the <Check-in> , check-out in the date <Check-out> and selects a Guests <Guests> date 
	And clicks on "Search" button 
	Then user should be able to get the Hotels page 
	#Then Search result should display the flights <FlyingFrom> ,<GoingTo> on the selected <departing> date
	
	Examples:  
	|Going to	| Check-in        | Check-out   |      Guests      |       
	|"New York"	|   "15/05/2020"  |"16/05/2020" | "1 room, 1 guest"|                                	
                                                     