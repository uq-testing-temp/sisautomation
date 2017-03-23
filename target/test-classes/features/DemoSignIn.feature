@Login
Feature: Sign In
  As a user
  I want to be able to SignIn to the SI-net system
  So that I can manage my personal account

  Background:
    Given I am on SI-net SignIn page

  @Smoke
  Scenario Outline: SignIn - Positive Scenario

    When I enter username as "<username>"
      And I enter password as "<password>"
      And I click SignIn button
    Then I should be signed in

    Examples:
    | username | password |
    | UQTRN30  | UQTRN    |

  @Smoke
  Scenario Outline: SignIn - Negative Scenario

    When I enter username as "<username>"
    And I enter password as "<password>"
    And I click SignIn button
    Then I should not be signed in

    Examples:
      | username | password    |
      | UQTRN30  | UQTRN30     |