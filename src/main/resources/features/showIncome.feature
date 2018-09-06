Feature: Show income
  As a customer
  I want to see income
  Background:
    Given a customer add income 500 bahts
  Scenario: show income
    When a customer view income
    Then an income is 500 bahts and amount of money is 500