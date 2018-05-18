package Pacman;

import Fantasma.Fantasma;

abstract class EstrategiaDeChoque {



    public abstract boolean canHandle(Fantasma unFantasma);

    public abstract void handle(Pacman unPacman, Fantasma unFantasma);
}
