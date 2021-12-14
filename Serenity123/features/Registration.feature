@regi
Feature: Registration

  @Registration
  Scenario: Register with username & passowrd
    Given I am on travel portal
    When I register with details
      | UserName         | Sumit   |
      | Password         | IBM@123 |
      | Confirm Password | IBM@123 |
    Then I should be successfully register