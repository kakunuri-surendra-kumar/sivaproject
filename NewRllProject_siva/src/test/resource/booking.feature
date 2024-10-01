Feature: Booking Process

  @Booking_with_ValidData
  Scenario Outline: Verify Booking process with valid input
    Given User is on Booking page of PHP Travels
    When Field enter <Firstname> and <Lastname>
    And User enter <Email> and <Phone> in field
    And User should enter <Address>
    And Do enter <Nation_ality1> and <Current_Country> on
    And User enter <Title> from dropdowns
    And User entered information as <Traveller_F> and <Traveller_L>
    And enters <Nationality> and <Date_of_birth>
    And enter <BirthDay> and <birth_Year> From DropDown
    And User enter <Passport_ID> within range
    And User enter <Inssu_yr> from dropdown issueyear
    And User select payment method as Pay Later
    And User click on agree terms and conditions checkbox
    And click on Booking confirm
    Then Booking must be success

    Examples:
      | Firstname | Lastname | Email           | Phone      | Address              | Nation_ality1 | Current_Country | Title | Traveller_F | Traveller_L | Nationality | Date_of_birth | BirthDay | birth_Year | Passport_ID | Inssu_yr |
      | siva      | kumari   | siva@gmail.com  | 9022769542 | Kharadi bypass, Pune | India         | India           | Miss  | Punam       | Suryawanshi | India       | 12 Dec        | 14       | 1999       | 141414      | 2023     |
