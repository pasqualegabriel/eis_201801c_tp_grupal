Feature: Pacman Come

  Scenario: Pacman come un biscuit se vuelve más gordo (suma puntos).
    Given Un Pacman
    When come un bisquit
    Then suma puntos

  Scenario: Pacman come una fruta se vuelve más gordo (suma puntos).
    Given Pacman come una fruta
    When Se come una fruta
    Then Suma 60 puntos

  Scenario: Pacman come un pellet.
    Given Pacman come una Pellet
    When Se como una pellet
    Then Debilita A Los Fantasmas

  Scenario: Pacman choca contra un fantasma debilitado.
    Given Va a chocar
    When Fantasma debilitado
    Then No muere