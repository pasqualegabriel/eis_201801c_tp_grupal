package gradle.cucumber;
import Fantasma.Fantasma;
import Pacman.Pacman;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dados;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.*;


public class PacmanChocaStepdefs {

    private Pacman unPacman;
    private Fantasma unFantasma;

    @Dados("^Un Pacman y un Fantasma$")
    public void Un_Pacman_y_un_Fantasma()
    {
        unPacman  = new Pacman();
        unFantasma     = new Fantasma();
    }

    @Cuando("^Chocan$")
    public void El_pacman_Y_el_Fantasma_chocan()
    {   unPacman.choca(unFantasma);   }

    @Entonces("^El Pacman Muere$")
    public void El_pacman_muere()
    {   assertTrue(! unPacman.estaVivo());    }
}
