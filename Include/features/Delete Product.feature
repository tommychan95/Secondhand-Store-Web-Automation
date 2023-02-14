@Delete_Product @Smoke
Feature: User Delete Product

  @DP001
  Scenario: DP001 - Seller delete product has upload
    Given User fill website on fitur search website
    When User while email "ndesyntha@gmail.com"
    And User while password "Desyntha@123"
    And User press button login 
    And User Navigate to Sell List
    Then User Navigate to Delete Product

 