Feature: Login User

  Scenario: user login
    Then Click enter button
    Then Input login
    Then Input password
    Then Click "Войти" button
    Then Content with "Объявления" visible
