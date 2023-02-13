@LogOUT @Smoke
Feature: User Login

  @LGO001
  Scenario: User want to login using correct credential
    Given User already login
    When user click logo user in navbar
    And user click button logout
    Then button Masuk will show up 