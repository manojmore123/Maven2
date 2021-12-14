@flightAssignment
Feature: Booking Flight
  @BookingFlight_OneTrip
  Scenario: Booking Flight
    Given I am on travel portal
    When I am searching flight for onetrip
      | TripType | OneWay    |
      | Date     | December-15    |
      | From     | London    |
      | To       | Frankfurt |
    Then I should be successfully booked flight
    
      @BookingFlight_RoundTrip
  	Scenario: Booking Flight22
    Given I am on travel portal
    When I am searching flight for round trip
      | TripType | TwoWay    |
      | Date     | December-18    |
      | From     | London    |
      | To       | Frankfurt |
      |RetunDate | December-24|
    Then I should be successfully searched flight for roundtrip