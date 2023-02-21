@Offering @Smoke
Feature: Offering
  
  @OF001
  Scenario: OF001 - Buyer want to fill and send offering price  
    Given Buyer has successfully login into website
    When Buyer input username "tommy.chaniago42@gmail.com"
    And Buyer input password "Tc@$Ec0ndH@nd955!"
    And Buyer click on LOGIN Button 
    And Buyer click on PRODUCT Image
    And Buyer click on INTERESTED Button
    And Buyer input Offering Price "2000000"  
    And Buyer click SEND Button
    Then Message Harga Tawar Berhasil dikirim displayed 