Feature: Show expense
  As a customer
  I want to see expense
  Background:
    Given a customer add income 500 bahts
    Given a customer add expense 200 bahts
  Scenario: show expense
    When a customer view expense
    Then an expense is 500 bahts and amount of money is 300

