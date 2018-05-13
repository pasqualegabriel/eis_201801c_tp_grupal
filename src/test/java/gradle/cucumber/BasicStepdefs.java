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


    @Given("^otro booleano")
    public void Prueba_ade_testeo(){
        unBooleano = false;
    }
    @When("^hago otro assert true")
    public void Prueba_dess_testeoasd(){
        unBooleano = true;
    }
    @Then("^me devuelve otro true")
    public void I_run_a_faissling_step(){
        assertTrue(unBooleano);
    }

    @Given("^pepita")
    public void Prueba_adasdasde_testeo(){
        unBooleano = false;
    }
    @When("^pepe")
    public void Prueba_deasdasdasdss_testeoasd(){
        unBooleano = true;
    }
    @Then("^pepote")
    public void I_run_a_faiasdasdasdssling_step(){
        assertTrue(unBooleano);
    }

}
