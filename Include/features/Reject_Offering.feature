@Reject_Offering @Smoke
Feature: Reject Offering
  
  @RO001
  Scenario: ROO1 - Seller want to reject the offering
    Given Seller has login into the secondhand store website
    When Seller input email "tommy.chaniago42@gmail.com"
    And Seller input Password "Tc@$Ec0ndH@nd955!"
    And Seller click LOGIN Button
    And Seller click List Menu
    And Seller click Interested Menu
    And Seller click Product 
    And Seller click Reject Button
    And Seller click Yes Button
    Then Seller wait for Message displayed "Tawaran_produk_ditolak"
 
	@RO002
  Scenario: ROO2 - Seller want to cancel reject the offering
    Given Seller has login into the secondhand store website
    When Seller input email "tommy.chaniago42@gmail.com"
    And Seller input Password "Tc@$Ec0ndH@nd955!"
    And Seller click LOGIN Button
    And Seller click List Menu
    And Seller click Interested Menu
    And Seller click Productt
    And Seller click Rejects Button
    And Seller click No Button
    And Seller click Back Button
    And Seller click Interestedd Menu
    Then Product still in Interested Menu
    