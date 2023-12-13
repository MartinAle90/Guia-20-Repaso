Feature: request the Star Wars API

  Scenario Outline: Request the Star Wars API
    Given request character id <number>
    When search on Wikipedia "<cName>"
    Then page correctly displayed

    Examples:
      | number | cName          |
      | 1      | Luke Skywalker |
      | 2      | C-3PO          |
      | 3      | R2-D2          |
      | 4      | Darth Vader    |
      | 5      | Leia Organa    |