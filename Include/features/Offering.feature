@Offering @Smoke
Feature: Offering
  
  @OF001
  Scenario: OF001 - Buyer want to fill and send offering price  
    Given Buyer has successfully login into website
    When Buyer input username "irmapujiandrianis@gmail.com"
    And Buyer input password "Admin123"
    And Buyer click on LOGIN Button 
    And Buyer click on PRODUCT Image
    And Buyer click on INTERESTED Button
    And Buyer input Offering Price "2000000"  
    Then Buyer click SEND Button 