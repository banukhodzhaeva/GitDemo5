Feature: Application Login

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "jerry" and password "5555"
    Then Home page is populated
    And Cards displayed are "true"

  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
      | jenny | abcd | john@abcd.com | Australia | 3242353 |
      | jimmy | abcd | john@abcd.com | Australia | 3242353 |
    Then Home page is populated
    And Cards displayed are "false"

