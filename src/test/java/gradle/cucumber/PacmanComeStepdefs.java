package gradle.cucumber;
import Alimentos.Biscuit;
import Alimentos.Fruta;
import Alimentos.Pellet;
import Fantasma.Fantasma;
import Pacman.Pacman;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class PacmanComeStepdefs {

    private Pacman unNuevoPacman;
    private Biscuit unBiscuitDe20;
    private Fruta unaFrutaDe60;
    private Pellet unaPellet;
    private List<Fantasma> fantasmas = new ArrayList<>();


    @Given("^Un Pacman$")
    public void Seteo_de_Pacman_Nuevo() {
        this.unNuevoPacman = new Pacman(fantasmas);
        this.unBiscuitDe20 = new Biscuit(20);
    }

    @When("^come un bisquit$")
    public void El_pacman_se_Come_el_Biscuit() {
        this.unNuevoPacman.come(this.unBiscuitDe20);
    }

    @Then("^suma puntos$")
    public void Al_comerlo_esta_mas_gordo() {
        assertEquals(20, this.unNuevoPacman.puntos());
    }


    @Given("^Pacman come una fruta$")
    public void unPacmanComeUnaFruta() {
        unNuevoPacman = new Pacman(fantasmas);
        unaFrutaDe60 = new Fruta(60);
    }

    @When("^Se come una fruta$")
    public void ElPacmanSeComeUnaFruta() {
        unNuevoPacman.come(unaFrutaDe60);
    }

    @Then("^Suma 60 puntos$")
    public void AlComerlaEstaMasGordo() {
        assertEquals(60, unNuevoPacman.puntos());
    }

    @Given("^Pacman come una Pellet$")
    public void unPacmanComeUnaPellet() {
        Fantasma unFantasma = new Fantasma();
        Fantasma unFantasma2 = new Fantasma();
        Fantasma unFantasma3 = new Fantasma();

        fantasmas.add(unFantasma);
        fantasmas.add(unFantasma2);
        fantasmas.add(unFantasma3);

        unNuevoPacman = new Pacman(fantasmas);
        unaPellet = new Pellet(0);
    }

    @When("^Se como una pellet$")
    public void ElPacmanSeComeUnapellet() {
        unNuevoPacman.come(unaPellet);
    }

    @Then("^Debilita A Los Fantasmas$")
    public void AlComerlaEsteDebilitaALosFantasmas() {
        assertTrue(this.unNuevoPacman.getFantasmas().stream().allMatch(Fantasma::getEstaDevilitado));
    }


}
