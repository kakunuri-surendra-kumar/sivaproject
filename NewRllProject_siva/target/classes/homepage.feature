Feature: Flight Booking Process

  Scenario: Verify flight booking process with valid input
    Given I open the browser and navigate to the flight booking page
    When I select one way trip
    And I choose Germany as the departure country
    And I choose India as the destination country
    And I select the departure date
    And I select the number of travelers
    Then I click on the search button

