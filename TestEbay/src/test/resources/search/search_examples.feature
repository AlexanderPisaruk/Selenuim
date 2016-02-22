Feature: Demo examples

  Scenario: Running a Full Text Quick Search
    Given I set search request "iPhone 4S"
    When I perfom search
    Then the term query "iPhone 4S" should be the first in the Search Result grid

  Scenario: Add device to cart
    Given I have device "iPhone 4S"
    When I add it in cart
    Then Device is in cart
