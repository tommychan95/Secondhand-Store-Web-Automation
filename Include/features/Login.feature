@Login @Smoke
Feature: User Login

  @LG001
  Scenario: User want to login using correct credential
    Given User navigate to Login page
    When User input email "irmapujiandrianis@gmail.com"
    And User input password "Admin123"
    And User click button Login
    Then User navigate to homepage

  @LGI002
  Scenario: User want to login using unregistered email
    Given User navigate to Login page
    When User input email "irmapujidrianis@gmail.com"
    And User input password "Admin13"
    And User click button Login
    Then Text warning "Akun tidak ditemukan" show up

  @LGI003
  Scenario: User want to login with incorrect password
    Given User navigate to Login page
    When User input email "irmapujiandrianis@gmail.com"
    And User input password "Admin13"
    And User click button Login
    Then Text warning "Password anda salah!" show up

  @LGI004
  Scenario: User want to login with unverified email
    Given User navigate to Login page
    When User input email "alt.b3-75y3qfz@yopmail.com"
    And User input password "Admin13"
    And User click button Login
    Then Text warning "Silahkan cek email anda untuk melakukan verifikasi terlebih dahulu" show up
