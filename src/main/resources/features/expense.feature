Feature: Add expense
  As a customer
  I want to add expense to program
  Background:
    Given a customer add income 500 bahts
  Scenario: Add expense
    Given a customer add expense 200 bahts
    When a customer expense 200 bahts
    Then amount of money is 100 bahts
