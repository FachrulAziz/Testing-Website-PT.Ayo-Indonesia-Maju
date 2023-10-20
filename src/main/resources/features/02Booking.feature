Feature: Booking
#  Scenario: Input valid username dan password
#    Given User enter url AIM
#    When User enter valid username
#    And User enter valid password
#    And User click button login
#    Then User get text title page dashboard

  Scenario: Booking valid
    When User pilih tanggal
    And User pilih waktu
    And User memasukan nominal stor
    And User click button save
    Then User get text valid data

Scenario: Invalid nominal stor
  When User pilih tanggal
  And User pilih waktu
  And User memasukan nominal stor yang tidak sesuai
  And User click button save
  Then User get text Invalid stor

  Scenario: Invalid double booking
    When User pilih tanggal
    And User pilih waktu
    And User memasukan nominal stor
    And User click button save
    Then User get text Invalid data double