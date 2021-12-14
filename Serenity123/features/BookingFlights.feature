@tag
Feature: Booking Flight
  @BookingFlight
  Scenario: Booking Flight
    Given I am on travel portal
    When I am searching flight
      | TripType | OneWay    |
      | Date     | November-15    |
      | From     | London    |
      | To       | Frankfurt |
    Then I should be successfully booked flight