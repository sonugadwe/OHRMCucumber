Feature: OrangeHRM Login Page

  Scenario Outline: Validate login page Test 
  
    Given To launch the browser and navigate to url
    When  User Enter details "<username>" and "<password>"
	Then  click on login button	
    Examples: 
      | username| password |
      | Admin   | admin123 |
