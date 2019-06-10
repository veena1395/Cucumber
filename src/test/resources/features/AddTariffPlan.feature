@Smoke
Feature: Title of your feature
  I want to use this template for my feature file
@tag4 @us4
  Scenario Outline: Title of your scenario outline
    Given user has to goes to home page
    When user fill tarif plan details "<MR>","<FreeLM>","<FreeInterM>","<FreeSms>","<LocalCharge>","<Internationalcharge>","<SmsperCharge>"
    When The user click on submit button
    Then user has to get succeed message

    Examples: 
      | MR   | FreeLM | FreeInterM | FreeSms | LocalCharge | Internationalcharge | SmsperCharge |
      | 1000 |    200 |        500 |     600 |         400 |                   5 |            2 |
      | 2000 |    800 |        400 |     500 |         500 |                   9 |            3 |
      | 3000 |    500 |        900 |     800 |         100 |                   7 |            4 |
