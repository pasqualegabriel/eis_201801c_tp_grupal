package Pacman;

import Fantasma.Fantasma;

import java.util.ArrayList;
import java.util.List;

public class ProvedorDeChoques {

    private List<EstrategiaDeChoque> estrategiasDeChoque;

    public ProvedorDeChoques(){
        estrategiasDeChoque = new ArrayList<EstrategiaDeChoque>();
        estrategiasDeChoque.add(new ContraFantasmaConCuerpo());
        estrategiasDeChoque.add(new ContraFantasmaDebilitado());
        estrategiasDeChoque.add(new ContraFantasmaSinCuerpo());
    }

    public void handle(Pacman unPacman, Fantasma unFantasma) {

       estrategiasDeChoque.stream().filter(estrat-> estrat.canHandle(unFantasma)).findFirst().ifPresent(estrat-> estrat.handle(unPacman, unFantasma));;

    }
}
