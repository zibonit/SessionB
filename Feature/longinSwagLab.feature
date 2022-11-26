Feature: facebook Longin

  Scenario Outline: Valid successful login
    Given User on Swaglab homepage
    When User enters username as "<user>"
    And User enters password as "<pass>"
    And user clicks o Login buttom
    And Click Search
    And enter name "<name>"
    Then User verifies the landing page

    Examples: 
      | user          | pass        | name 		|
      | zibon.ali 		|   ?  				|Asraa Khan|