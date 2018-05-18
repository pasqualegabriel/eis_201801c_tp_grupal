package Pacman;

import Fantasma.Fantasma;

public class ContraFantasmaConCuerpo extends EstrategiaDeChoque {

    public ContraFantasmaConCuerpo(){}

    @Override
    public boolean canHandle(Fantasma unFantasma) {
        return unFantasma.tieneCuerpo() && !unFantasma.getEstaDevilitado();
    }

    @Override
    public void handle(Pacman unPacman, Fantasma unFantasma) {
        unPacman.morir();
    }
}
