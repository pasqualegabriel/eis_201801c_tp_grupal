package Fantasma;

public class Fantasma
{
    private boolean estaDevilita = false;
    private boolean tieneCuerpo = true;

    public void devilitate() {
        this.estaDevilita = true;
    }

    public boolean getEstaDevilitado(){
       return this.estaDevilita;
    }

    public boolean tieneCuerpo(){
        return this.tieneCuerpo;
    }

    public void sinCuerpo() { this.tieneCuerpo = false; }
}
