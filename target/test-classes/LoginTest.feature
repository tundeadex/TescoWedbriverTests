Feature: As a Tesco online customer, I want to login
  So that I can buy groceries

  @weaver1
  Scenario: Successful user login
    Given I am on the Tesco website
    When I login with valid credentials
    Then I am logged in

  @weaver2
  Scenario: User attempts to login with incorrect credentials
    Given I am on the Tesco website
    When I login with valid credentials
    Then I am logged in

#
#  Scenario Outline: Check different user accounts
#    Given I am on the Tesco website
#    When I login with username <username> and password <password>
#    Then I am logged in
#    Examples:
#    |username|password|
#    |olawale@yahoo.com|tolani|
#    |tundeadex@yahoo.com|whatever|