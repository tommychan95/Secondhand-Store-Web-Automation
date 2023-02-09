@Add_Product @Smoke
Feature: User Add Product

  @AP001
    Scenario: AP001 - User want to add product to sell
    Given User successfully access secondhand website
    When User input username "ndesyntha@gmail.com"
    And User input passwordd "Desyntha@123"
    And User click login button
    And User click Sell List 
    And User click Add Product   
    And User fill Nama Produk
    And User fill Harga Produk
    And User choose Kategori
    And User fill Deskripsi
    Then User click submit button

  @AP002
  	Scenario: AP002 - User cannot add products, because they exceed 4
  	Given User success open browser secondhand
  	When User fill email with "ndesyntha@gmail.com"
  	And User fill pwd with "Desyntha@123"
  	And User press btn login
  	And User press btn sell list
  	And User press btn add product
  	And User fill product name
  	And User fill product price
  	And User choose category 
  	And User fill description
  	And User receives a failed product add notification
  	Then User press btn submit