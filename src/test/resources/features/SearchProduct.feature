Feature: Search a Product
  Scenario: Search a Simple Product with Success
    Given i access Petz Honepage
    When i search "Aquário"
    Then I see a list of product"Aquário"
    And I click at product "Aquário Boyu Curvo Preto MS-420 31 L"
    Then Show the title "Aquário Boyu Curvo Preto MS-420 31 L" and price "R$ 789,99"