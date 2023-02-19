@Daftar_Jual @Smoke
Feature: User Login

  @DJ001
  Scenario: User want to choose product on Daftar Jual page
  Given Useer navigate to Login page
    When Useer input username "ikatriyuli@gmail.com"
    And Useer input passwords "kaminka13"
    And Useer click button Login
    And Useer click Navigate to Daftar Jual Produk
  Then Useer can see the selected product offer 