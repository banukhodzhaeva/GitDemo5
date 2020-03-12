@sprint3
Feature: Application Login

@MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"

@SmokeTest @SanityTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"

  @SanityTest @sprint3
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
      | jenny | abcd | john@abcd.com | Australia | 3242353 |
      | jimmy | abcd | john@abcd.com | Australia | 3242353 |
    Then Home page is populated
    And Cards displayed are "false"


  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login in to application with username <Username> and password <Password>
    Then Home page is populated
    And Cards displayed are "true"

    Examples:
      | Username | Password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |