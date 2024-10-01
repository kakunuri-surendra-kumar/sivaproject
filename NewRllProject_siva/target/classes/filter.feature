Feature: Flight Selection Process

  Scenario: Verify flight selection process with valid input
    Given User navigates to the flight booking page
    When User selects all flights
    And User sorts flights from high to low
    And User selects the first available flight
    Then The flight should be selected successfully
