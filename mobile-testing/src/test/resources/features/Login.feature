@login @android
  Feature: Login

    @positive @valid
    Scenario: Verify user successfully login when input valid email and password
      Given User is on login page
      When User input username "admin"
      And User input password "admin"
      Then User click button login
      Then User successfully login

    @negative @invalid
    Scenario: Verify user failed login when input valid email and password
      Given User is on login page
      When User input username "invalid"
      And User input password "invalid"
      Then User click button login