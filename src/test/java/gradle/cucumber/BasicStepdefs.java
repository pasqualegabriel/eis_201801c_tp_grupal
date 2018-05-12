package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class BasicStepdefs {

    boolean unBooleano;

    @Given("^un booleano")
    public void Prueba_de_testeo(){
        unBooleano = false;
    }
    @When("^hago un assert true")
    public void Prueba_de_testeoasd(){
        unBooleano = true;
    }
    @Then("^me devuelve true")
    public void I_run_a_failing_step(){
        assertTrue(unBooleano);
    }
}
