Feature: Search for a car

  Scenario: Search for a car
    Then Insert "Toyota Prius" in Search bar
    Then Click Search button
    Then Content with "объявлений" visible

