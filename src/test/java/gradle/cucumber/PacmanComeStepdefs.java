package gradle.cucumber;
import Alimentos.Biscuit;
import Alimentos.Fruta;
import Pacman.Pacman;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;


public class PacmanComeStepdefs {

    private Pacman unNuevoPacman;
    private Biscuit unBiscuitDe20;
    private Fruta unaFrutaDe60;

    @Given("^Un Pacman")
    public void Seteo_de_Pacman_Nuevo()
    {
        this.unNuevoPacman  = new Pacman();
        this.unBiscuitDe20  = new Biscuit(20);
    }
    @When("^come un bisquit")
    public void El_pacman_se_Come_el_Biscuit()
    {
        this.unNuevoPacman.come(this.unBiscuitDe20);
    }
    @Then("^suma puntos")
    public void Al_comerlo_esta_mas_gordo(){
        assertEquals(20, this.unNuevoPacman.puntos());
    }


    @Given("^Pacman come una fruta")
    public void unPacmanComeUnaFruta() {
        unNuevoPacman  = new Pacman();
        unaFrutaDe60   = new Fruta(60);
    }
    @When("^Se come una fruta")
    public void ElPacmanSeComeUnaFruta() {
        unNuevoPacman.come(unaFrutaDe60);
    }
    @Then("^Suma 60 puntos")
    public void AlComerlaEstaMasGordo() {
        assertEquals(60, unNuevoPacman.puntos());
    }

}
