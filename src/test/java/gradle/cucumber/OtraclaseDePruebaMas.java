package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class OtraclaseDePruebaMas {

    boolean unBooleano;

    @Given("^goku")
    public void Prueba_de_tasfsdadsgesteo(){
        unBooleano = false;
    }
    @When("^vegeta")
    public void Prueba_de_tesasdgasgasdgasdgteoasd(){
        unBooleano = true;
    }
    @Then("^gohan")
    public void I_run_a_failasdgasdgasdgasdging_step(){
        assertTrue(unBooleano);
    }
}
