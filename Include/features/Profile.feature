@Profile @Smoke
Feature: Profile

  @PF001
  Scenario: User want to change name
    Given User navigate to Profile page
    When User input name "Testing Account"
    And User click button submit
    Then Text success show up

	@PF002
  Scenario: User want to change city
    Given User navigate to Profile page
    When User input city "Jakarta"
    And User click button submit
    Then Text success show up

  @PF003
  Scenario: User want to change address
    Given User navigate to Profile page
    When User input address "Jalan Sudirman no 1"
    And User click button submit
    Then Text success show up
    
  @PF004
  Scenario: User want to change phone number
    Given User navigate to Profile page
    When User input phone number "082123213"
    And User click button submit
    Then Text success show up
    
  @PF005
  Scenario: User want to change name with number 
    Given User navigate to Profile page
    When User input name "123456"
    And User click button submit
    Then Text success not show up
    
  @PF006
  Scenario: User want to change phone number with invalid format
    Given User navigate to Profile page
    When User input phone number "Testing Account"
    And User click button submit
    Then Text success not show up