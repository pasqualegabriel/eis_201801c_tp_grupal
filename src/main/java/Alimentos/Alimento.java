package Alimentos;

public abstract class Alimento {

    private int valor;

    public Alimento(int unValor) {
        this.valor  = unValor;
    }

    public int getValor() {
        return this.valor;
    }


    public boolean isPellet(){return false; }



}
