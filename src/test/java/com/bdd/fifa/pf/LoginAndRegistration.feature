Feature: Login and Registration
  This feature covers the access to the web page both Registration and Log In
  
  Scenario:
     Given The user opens a browser window
  
  Scenario Outline: Register in application trying to cover a success message and as many error messages
    Given The user navigates to the Fifa app root URL
    Then Validate that the Welcome Page loads correctly
    And The user clicks on the top right menu Register button
    Given The user enters the required registration data "<name>", "<surname>", "<email>", "<password>", "<confirmation>" and clicks the Register button
  #  Then ... implement challenge 3

    Examples: 
	    | name   | surname | email              | password    | confirmation |
	    | Edward | Martins | emartins@gmail.com | T3sting123! | Testing123!  |
	    | Johan  | Cuello  | johanbademail      | Testing123! | Testing123!  |
	    | Andres | Meza    | andresmeza@n8.com  | Testing123  | Testing123   |


  Scenario Outline: Admin access Scenario
    Given The user navigates to the Fifa app root URL
    Then Validate that the Welcome Page loads correctly
    And The user clicks on the top right menu Login button
    Given The user enters the required login data "<email>" and "<password>" in the Login form and clicks the Login button
    Then The user validates that the "<name>" from the top right menu Nav Bar drop down link is her or his first name

    Examples: 
	    | email           | password 		 | name  |
	    | admin@admin.com | Admin123!    | Admin |
	    
Scenario:
     Given The user closes a browser window
	    
