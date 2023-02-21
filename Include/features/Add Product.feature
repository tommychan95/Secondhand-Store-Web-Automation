@Add_Product @Smoke
Feature: User Add Product

  @AP001
    Scenario: AP001 - User want to add product to sell
    Given User success access secondhand website
    When User login account
    And User click button Sell List 
    And User click button Add Product   
    And User input Nama Produk "Jedai"
    And User input Harga Produk "20000"
    And User choose Categori 
    And User input Deskripsi "Good Condition"
    And User click btn submit
    Then Product already created

  @AP002
  	Scenario: AP002 - User cannot add products, because they exceed 4
  	Given User success access secondhand website
    When User login account
    And User click button Sell List 
    And User click button Add Product   
    And User input Nama Produk "Jedai"
    And User input Harga Produk "20000"
    And User choose Categori
    And User input Deskripsi "Good Condition"
    And User click btn submit
  	Then User receive a failed product add notification