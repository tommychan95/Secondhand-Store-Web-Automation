@Update_Status_Offering @Smoke
Feature: Update Status Offering

  @SP001
  Scenario: Selller want to update status the offering price product
    Given Selller navigate to Login page
    When Selllers input username "ikaamintri01@gmail.com"
    And Selllers input passwords "kaminka13"
    And Selllers click button Login
    And Selllers click List Product
    And Selllers click button Diminati
    And Selllers click item product
    And Selllers click button Terima Penawaran
    And Selllers click button Status
    And Selllers click pilih status berhasil
    And Selllers click button kirim status
    Then Text warning "Status produk berhasil diperbarui" show up
    
    @SP002
  Scenario: Selller want to update status the offering price product
    Given Selllerr navigate to Login page
    When Selllerr input username "ikaamintri01@gmail.com"
    And Selllerr input passwords "kaminka13"
    And Selllerr click button Login
    And Selllerr click List Product
    And Selllerr click button Diminati
    And Selllerr click item product
    And Selllerr click button Terima Penawaran
    And Selllerr click button Status
    And Selllerr click pilih status batalkan
    And Selllerr click button kirim status
    Then Text warning "Status produk berhasil diperbarui" show up