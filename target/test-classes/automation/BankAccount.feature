Feature: BankAccount

  Scenario: withdraw money from bank in user account
    Given BankAccount has 1000 PLN
    When User withdraw 500 PLN
    Then Transaction should be possible
    And Account balance should be 500 PLN

    Scenario: withdraw money from bank is not possible
      Given BankAccount has 1000 PLN
      When User withdraw 1500 PLN
      Then Transaction should not be possible
      And Account balance should be 1000 PLN

      Scenario: withdraw and transfer money available for user
        Given BankAccount has 1000 PLN
        When User withdraw 1000 PLN
        And User transfer 2000 PLN
        And User withdraw 500 PLN
        Then Transaction should be possible
        And Account balance should be 1500 PLN

        Scenario: withdraw and transfer money is not available for user
          Given BankAccount has 2000 PLN
          When User withdraw 1500 PLN
          And User withdraw 1500 PLN
          Then Transaction should not be possible
          And Account balance should be 500 PLN



