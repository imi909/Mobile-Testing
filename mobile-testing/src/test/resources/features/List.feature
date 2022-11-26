@list @android @positive
  Feature: List Menu

    Background:
      Given User is on login page
      When User input username "admin"
      And User input password "admin"
      Then User click button login
      Then User successfully login

    @positive @scroll
    Scenario: Scroll with pointer
      Then User go to list menu
      And User doing scroll

    @positive @longPress
    Scenario: Long press the list menu
      Then User go to list menu
      And User doing long press in the list

    @positive @tapMultiple
    Scenario: Tap multiple times the list menu
      Then User go to list menu
      And User doing tap multiple times in the list
