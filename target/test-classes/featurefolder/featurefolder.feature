Feature: verifying facebook details
Scenario Outline: veryfying login details with invalid credentials
Given user is on facebook page
When user Enters "<username>" and "<password>"
And user should click the Login button
Then user should verify the message
Examples:
|username|password|
|enoch|1234|
