Feature: Stc Subscription packages

  Scenario Outline: Check subscription landing page for '<Country>'
    Given user navigate to stc tv subscription page for '<Country>'
    When subscription page loaded successfully for '<Country>'
    Then verify subscription page

    Examples:
      | Country |
      | Bahrain |
      | KSA     |
      | Kuwait  |

  Scenario Outline: Check subscription currency for '<Country>'
    Given user navigate to stc tv subscription page for '<Country>'
    When subscription page loaded successfully for '<Country>'
    Then verify '<Currency>' for each country

    Examples:
      | Country | Currency |
      | Bahrain | BHD      |
      | KSA     | SAR      |
      | Kuwait  | KWD      |

  Scenario Outline: Check packages types exists for '<Country>'
    Given user navigate to stc tv subscription page for '<Country>'
    When subscription page loaded successfully for '<Country>'
    Then verify package types for each country

    Examples:
      | Country |
      | Bahrain |
      | KSA     |
      | Kuwait  |