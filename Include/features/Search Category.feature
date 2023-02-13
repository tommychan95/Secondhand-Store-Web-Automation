@Search_Category @Smoke
Feature: User search by category

  @SB001
  Scenario: User want to search hobby by category 
    Given User access secondhand website
    When User while username with "ndesyntha@gmail.com"
    And User while password with "Desyntha@123"
    And User press button Login
    Then User press button Hobby

  @SB002
  Scenario: User want to search kesehatan by category
  	Given User access web secondhand
  	When User fill username "ndesyntha@gmail.com"
  	And User fill pass "Desyntha@123"
  	And User click Login
  	Then User click button Kesehatan 