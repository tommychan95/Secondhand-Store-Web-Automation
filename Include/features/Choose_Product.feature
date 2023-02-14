@Choose_Product @Smoke
Feature: Choose Product

  @DJ001
  Scenario: Sellerr want to choose product from list product
    Given Sellerr navigate to Login page
    When Sellerr input username "ikaamintri01@gmail.com"
    And Sellerr input passwords "kaminka13"
    And Sellerr click button Login
    And Sellerr click List Product
    And Sellerr click button Diminati
    And Sellerr click item product
    Then Item product details displayed 