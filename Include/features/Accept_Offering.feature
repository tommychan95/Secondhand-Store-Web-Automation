@Accept_Offering @Smoke
Feature: Accept Offering

  @TP001
  Scenario: Sellers want to accept the offering price product
    Given Sellers navigate to Login page
    When Sellers input username "ikaamintri01@gmail.com"
    And Sellers input passwords "kaminka13"
    And Sellers click button Login
    And Sellers click List Product
    And Sellers click button Diminati
    And Sellers click item product
    And Sellers click button Terima Penawaran
    Then Text warning "Tawaran produk diterima" show up