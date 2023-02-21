@Update_Status_Offering @Smoke
Feature: Update Status Offering

  @SP001
  Scenario: Selller want to update status the offering price product
    Given Selllers navigate to Login page
    When Selllers input username "alt.fq-fo0gtkl7@yopmail.com"
    And Selllers input passwords "asdfghjkl"
    And Selllers click button Login
    And Selllers click List Product
    And Selllers click button Diminati
    And Selllers click item product
    And Selllers click buttons Status
    And Selllers click pilih statuss berhasil
    And Selllers click buttons kirim status
    Then alert success update showup
    
    @SP002
  Scenario: Selller want to update status the offering price product
    Given Selllers navigate to Login page
    When Selllers input username "alt.fq-fo0gtkl7@yopmail.com"
    And Selllers input passwords "asdfghjkl"
    And Selllers click button Login
    And Selllers click List Product
    And Selllers click button Diminati
    And Selllers click item product to be canceled
    And Selllers click buttons Status
    And Selllerrs click pilih status batalkan
    And Selllerrs click button kirim status
    Then product missing from diminati page