package Pacman;

import Fantasma.Fantasma;

public class ContraFantasmaDebilitado extends EstrategiaDeChoque {

    public ContraFantasmaDebilitado(){};

    @Override
    public boolean canHandle(Fantasma unFantasma) {
        return unFantasma.getEstaDevilitado() && unFantasma.tieneCuerpo();
    }

    @Override
    public void handle(Pacman unPacman, Fantasma unFantasma) {
        unFantasma.sinCuerpo();
    }
}
