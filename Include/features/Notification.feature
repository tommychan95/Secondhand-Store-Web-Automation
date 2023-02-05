@Notification @Smoke
Feature: Notification

  @NO001
  Scenario: User want to view notification after login
    Given User has successfully login into the website
    When User input username "tommy.chaniago42@gmail.com"
    And User input passwords "Tc@$Ec0ndH@nd955!"
    And User click Login Button 
    Then User click Notification Button 