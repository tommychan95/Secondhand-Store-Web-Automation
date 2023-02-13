@Edit @Smoke
Feature: User want to edit product to sell

  @EP001
  Scenario Outline: User edit product
    Given User access website secondhand
    When User fill email "ndesyntha@gmail.com"
    And User input pass "Desyntha@123"
    And User push login button
    And User push button Sell List  
 		And User click Edit Produk
    And User plugin Harga Produk
    Then User push submit button

