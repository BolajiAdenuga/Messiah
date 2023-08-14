Feature: Messiah Project
  As a user on messiah website
  I want to be able to fill in my name and date of birth
  So that i can know my age successfully


    Scenario: Valid testing
      Given I navigate to messiah website
      When user enter name "James Zion"
      And user enter birthday
      And user click on submit button
      Then user should be able to figure out how old he or she is

      Scenario: Test with empty name field
        Given I navigate to messiah website
        When user did not enter name ""
        And user enter birthday
        And user click on submit button
        Then user receive an error message

        Scenario: Test with empty birthday field
          Given I navigate to messiah website
          When user enter name "James Zion"
          And user did not enter birthday ""
          And user click on submit button
          Then user receive  error message

