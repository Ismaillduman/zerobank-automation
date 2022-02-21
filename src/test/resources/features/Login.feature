Feature: Tries to login valid and invalid credentials
@wip
  Scenario: Login with valid credentials
    Given the user logged in
    Then The user should be able to see the title "Zero - Account Summary"
  @wip
  Scenario Outline: Tries to login with invalid credentials
    Given The user login with "<username>" and "<password>"
    Then The user should be able to see the message "Login and/or password are wrong."

    Examples:
      | username      | password      |
      | wrongusername | wrongpassword |
      | wrongusername | password      |
      | username      | wrongpassword |
      |               | password      |
      | username      |               |
      |               |               |


