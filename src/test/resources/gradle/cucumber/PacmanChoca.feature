# language: es

Característica: Pacman choca

  Escenario: Un Pacman choca contra un fantasma y muere
    Dados Un Pacman y un Fantasma
    Cuando Chocan
    Entonces El Pacman Muere

  Escenario: Pacman choca contra un fantasma debilitado.
    Dados Va a chocar
    Cuando Fantasma debilitado
    Entonces No muere

  Escenario: Pacman choca contra un fantasma sin cuerpo.
    Dados Va a chocar un fantasma
    Cuando Fantasma sin cuerpo
    Entonces No fallece