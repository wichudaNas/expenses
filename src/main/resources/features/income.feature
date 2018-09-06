Feature: Add income
  As a customer
  I want to add income to program
  Background:
    Given a customer add income 500 bahts
  Scenario: Add income
    Given a customer add income 200 bahts
    When a customer income 200 bahts
    Then amount of money is 100 bahts