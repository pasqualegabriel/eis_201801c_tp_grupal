package Pacman;

import Fantasma.Fantasma;

public class ContraFantasmaSinCuerpo extends EstrategiaDeChoque {

    public ContraFantasmaSinCuerpo(){}

    @Override
    public boolean canHandle(Fantasma unFantasma) {
        return !unFantasma.tieneCuerpo();
    }

    @Override
    public void handle(Pacman unPacman, Fantasma unFantasma) {

    }
}
