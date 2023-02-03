@Notification @Smoke
Feature: Title of your feature

  @NO001
  Scenario: User want to view notification after login
    Given User has successfully login into the website
    When User input username "irmapujiandrianis@gmail.com"
    And User input passwords "Admin123"
    And User click Login Button 
    Then User click Notification Button 