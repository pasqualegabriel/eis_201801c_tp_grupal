package Pacman;

import Alimentos.Alimento;

public class Pacman
{
    private Integer puntosAcumulados;

    public Pacman()
    {   puntosAcumulados    = 0;    }

    public void come(Alimento unAlimento)
    {   this.puntos(this.puntos() + unAlimento.valor());   }

    public int puntos()
    {   return puntosAcumulados;    }

    public void puntos(int unaCantidadDePuntos)
    {   puntosAcumulados    = unaCantidadDePuntos;  }
}
