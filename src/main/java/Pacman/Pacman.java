package Pacman;

import Alimentos.Alimento;
import Fantasma.Fantasma;

import java.util.ArrayList;
import java.util.List;

public class Pacman
{
    private Integer puntosAcumulados;
    private Boolean vivo;
    private List<Fantasma> fantasmas= new ArrayList<>();
    private ProvedorDeChoques proovedorDeChoques;

    public Pacman(List<Fantasma> unosFantasmas)
    {
        puntosAcumulados    = 0;
        vivo                = true;
        fantasmas           = unosFantasmas;
        proovedorDeChoques  = new ProvedorDeChoques();
    }

    public List<Fantasma> getFantasmas(){
        return this.fantasmas;
    }

    public void come(Alimento unAlimento)
    {
        if(unAlimento.isPellet()){
            fantasmas.forEach(it -> it.devilitate());
        }
        this.puntos(this.puntos() + unAlimento.getValor());
    }

    public int puntos()
    {   return puntosAcumulados;    }

    public void puntos(int unaCantidadDePuntos)
    {   puntosAcumulados    = unaCantidadDePuntos;  }

    public boolean estaVivo()
    {   return vivo;    }

    public void choca(Fantasma unFantasma){
        proovedorDeChoques.handle(this,unFantasma);
    }

    public void morir() {
        this.vivo = false;
    }
}
