@Edit_Products @Smoke
Feature: User Login

  @LG001
  Scenario: User want to login using correct credential
    Given User access websites secondhand
    When User fill email "ndesyntha@gmail.com"
    And User input pass "Desyntha@123"
    And User push login button
    And User push button Sell List  
 		And User click Edit Produk
    And User plugin Harga Produk
    And User push submit button
    Then Harga Produk already change