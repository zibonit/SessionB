Feature: SwagLab Longin

Scenario Outline: Valid successful login

Given User on Swaglab homepage
When User enters username as "<user>"
And User enters password as"<pass>"
And user clicks o Login Buttom
Then User verifies the landing page 

Examples:
|user						|pass				 |
|standerd_user	|secret_sauce|