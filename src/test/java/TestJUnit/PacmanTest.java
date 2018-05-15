package TestJUnit;

import Alimentos.Biscuit;
import Fantasma.Fantasma;
import Pacman.Pacman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PacmanTest {

    Pacman unNuevoPacmanSut;
    Biscuit unBiscuit;

    @Before
    public void setUp()
    {
        this.unNuevoPacmanSut = new Pacman();
        this.unBiscuit   = new Biscuit(15);
    }

    @Test
    public void Test_Cuando_Un_Pacman_Nuevo_Come_Suma_Puntos(){
        // Setup

        // Exercise
        this.unNuevoPacmanSut.come(this.unBiscuit);
        // Test
        assertEquals(15, this.unNuevoPacmanSut.puntos());
    }

    @Test
    public void Test_Cuando_Un_Pacman_con_15_puntos_Come_Un_Biscuit_Tiene_30_puntos(){
        // Setup
        this.unNuevoPacmanSut.puntos(15);

        // Exercise
        this.unNuevoPacmanSut.come(unBiscuit);
        // Test
        assertEquals(30, this.unNuevoPacmanSut.puntos());
    }

    @Test
    public void Test_Cuando_un_pacman_es_creado_esta_vivo()
    {   assertTrue(unNuevoPacmanSut.estaVivo());    }

    @Test
    public void Test_Cuando_un_pacman_Choca_a_Un_fantasma_el_pacman_muere()
    {
        // Setup
        Fantasma unFantasma = new Fantasma();

        // Exercise
        this.unNuevoPacmanSut.choca(unFantasma);

        // Test
        assertFalse(this.unNuevoPacmanSut.estaVivo());
    }

}