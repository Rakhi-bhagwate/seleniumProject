@Login
Feature: Login Action
Scenario: Successful Login with Valid Credentials
 Given User is on Home Page
  When User enters Credentials to LogIn
    | Admin | admin123 |
 Then Message displayed Login Successfully