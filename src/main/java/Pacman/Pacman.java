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

    public Pacman(List<Fantasma> unosFantasmas)
    {
        puntosAcumulados    = 0;
        vivo                = true;
        fantasmas           = unosFantasmas;
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

    public void choca(Fantasma unFantasma)
    {   this.vivo   = false;    }
}
