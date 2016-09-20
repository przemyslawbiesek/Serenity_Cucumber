Feature: Add new todos
  Users need to be able to quickly add tasks as fast as they can think of them.

  Scenario Outline: Add a new todo
    Given the todo application
    When the todo action '<inp1>' is added
    And  the todo action 'Test2' is added
    And  the todo action 'Test3' is added
    Then  '<out1>' should appear in the todo list



    Examples:
    |inp1|out1|
    |111|111  |
    |222|444  |
    |333|333  |
