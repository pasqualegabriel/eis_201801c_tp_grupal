package Pacman;

import Alimentos.Alimento;
import Fantasma.Fantasma;

public class Pacman
{
    private Integer puntosAcumulados;
    private Boolean vivo;

    public Pacman()
    {
        puntosAcumulados    = 0;
        vivo                = true;
    }

    public void come(Alimento unAlimento)
    {   this.puntos(this.puntos() + unAlimento.valor());   }

    public int puntos()
    {   return puntosAcumulados;    }

    public void puntos(int unaCantidadDePuntos)
    {   puntosAcumulados    = unaCantidadDePuntos;  }

    public boolean estaVivo()
    {   return vivo;    }

    public void choca(Fantasma unFantasma)
    {   this.vivo   = false;    }
}
