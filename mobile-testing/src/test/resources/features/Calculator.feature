@calculator @android @positive
  Feature: Calculator

    Background:
      Given User is on login page
      When User input username "admin"
      And User input password "admin"
      Then User click button login
      Then User successfully login

    @positive @add
    Scenario: User add firstField and SecondField
      Given User is already on calculator page
      When User input 5 for first field
      Then User click arrow button
      And User select add option
      Then User input 5 for second field
      And User click equal button
      Then The expected total should be 10

    @positive @subtract
    Scenario: User subtract firstField and SecondField
      Given User is already on calculator page
      When User input 10 for first field
      Then User click arrow button
      And User select subtract option
      Then User input 5 for second field
      And User click equal button
      Then The expected total should be 5

    @positive @divide
    Scenario: User divide firstField and SecondField
      Given User is already on calculator page
      When User input 10 for first field
      Then User click arrow button
      And User select divide option
      Then User input 5 for second field
      And User click equal button
      Then The expected total should be 2

    @positive @multiply
    Scenario: User multiply firstField and SecondField
      Given User is already on calculator page
      When User input 5 for first field
      Then User click arrow button
      And User select multiply option
      Then User input 5 for second field
      And User click equal button
      Then The expected total should be 25