Feature: O Palmeiras tem Mundial?
  Todo mundo sabe que o mundial de 1951 é válido pela FIFA

  Scenario: O Palmeiras ter mundial
    Given o mundial contra o Juventus ser valido
    When Eu perguntar se o palmeiras tem mundial
    Then O resposta seria "Lógico!"