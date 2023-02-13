@Register @Smoke
Feature: User Login

  @RGS001
  Scenario: User want to create account
    Given User navigate to Register page
    When User write full name "Testing Account"
    And User write email "alt.r2-bog4qphx@yopmail.com"
    And User write password "Asdfghjkl"
    And User click button Register
    Then Text Verified email show up

  @RGS002
  Scenario: User want to create account with registered email
    Given User navigate to Register page
    When User write full name "Testing Account"
    And User write email "alt.r2-bog4qphx@yopmail.com"
    And User write password "Asdfghjkl"
    And User click button Register
    Then Text warning email already used show up
