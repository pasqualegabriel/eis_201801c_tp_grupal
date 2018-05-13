package Pacman;

import Alimentos.Biscuit;

public class Pacman
{
    private Integer puntosAcumulados;

    public Pacman()
    {   puntosAcumulados    = 0;    }

    public void come(Biscuit unBiscuit)
    {   this.puntos(this.puntos() + unBiscuit.valor());   }

    public int puntos()
    {   return puntosAcumulados;    }

    public void puntos(int unaCantidadDePuntos)
    {   puntosAcumulados    = unaCantidadDePuntos;  }
}
