Feature: Alta Shop Mobile

  @Authentication @Positive @Login @ValidEmailAndPassword
  Scenario: Login using valid email and password
    Given User open the app
    When User tap login menu
    And User tap email field
    And User input valid email "someone@mail.com"
    And User tap password field
    And User input valid password "123123"
    And User tap login button
    Then User on home page

#  @Authentication @Positive @Register
#  Scenario: User register
#    Given User open the app
#    When User tap login menu
#    And User tap register menu
#    And User tap fullname field
#    And User input fullname "randomFullName"
#    And User tap email field
#    And User input valid email "someone@mail.com"
#    And User tap password field
#    And User input valid password "123123"
#    Then User tap register button
#
#  @Authentication @Positive @Logout
#  Scenario: User logout
#    Given User open the app
#    When User tap login menu
#    And User tap email field
#    And User input valid email "someone@mail.com"
#    And User tap password field
#    And User input valid password "123123"
#    And User tap login button
#    Then User on home page
#    Then User tap logout button
#
#  @Authentication @Positive @Login @InValidEmailAndPassword
#  Scenario: Login using invalid email and password
#    Given User open the app
#    When User tap login menu
#    And User tap email field
#    And User input valid email "someone@mail.com"
#    And User tap password field
#    And User input valid password "123123"
#    And User click login button
#
#  @Orders @Positive
#  Scenario: Login using valid email and password
#    Given User open the app
#    When User tap login menu
#    And User tap email field
#    And User input valid email "someone@mail.com"
#    And User tap password field
#    And User input valid password "123123"
#    And User click login button
#    Then User on home page
#    Then User tap buy button