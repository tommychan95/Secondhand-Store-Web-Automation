@Search_Category @Smoke
Feature: User search by category

  @SB001
  Scenario: User want to search product by category hobby
    Given User open secondhand website
    When User click button Hobby
    Then Just product with category Hoby will appear

  @SB002
  Scenario: User want to search product by category kesehatan
    Given User open secondhand website
    When User click button Kesehatann
    Then Just product with category kesehatan will appear

  @SB003
  Scenario: User want to search product by category Baju
    Given User open secondhand website
    When User click button Baju
    Then Just product with category Baju will appear

  @SB004
  Scenario: User want to search product by category Elektronik
    Given User open secondhand website
    When User click button Elektronik
    Then Just product with category Elektronik will appear

  @SB005
  Scenario: User want to search product by category Kendaraan
    Given User open secondhand website
    When User click button Kendaraan
    Then Just product with category Kendaraan will appear
