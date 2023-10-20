Feature: Login Page Test
  Scenario: Tanpa input username dan password
    Given User enter url AIM
    And User click button login
    Then User get text invalid credentials

  Scenario: Input username yang terdaftar dan password salah
    Given User enter url AIM
    When User enter valid username
    And User enter invalid password
    And User click button login
    Then User get text invalid Password
    And User click ok

  Scenario: Input username yang salah dan password benar
    Given User enter url AIM
    When User enter invalid username
    And User enter valid password
    And User click button login
    Then User get text invalid credentials
    And User click ok

  Scenario: Input username dan password yang salah
    Given User enter url AIM
    When User enter invalid username
    And User enter invalid password
    And User click button login
  Then User get text invalid credentials

  Scenario: Input valid username dan password
   Given User enter url AIM
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User get text title page dashboard