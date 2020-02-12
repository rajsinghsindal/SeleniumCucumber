Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And Customer enters UserName as "<username>" and Password as "<password>"
    Then Message displayed Login Successfully

    Examples:
    |username |password |
    |shubham  | shubham |
    |opensourcecms |opensourcecms | 