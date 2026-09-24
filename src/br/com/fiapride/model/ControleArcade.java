package br.com.fiapride.model;

public class ControleArcade extends Controle {
    private boolean possuiAlavancaTurbo;

    public ControleArcade(String nome, Double preco, boolean wireless, Bateria bateria, boolean possuiAlavancaTurbo) {
        super(nome, preco, wireless, bateria);
        this.possuiAlavancaTurbo = possuiAlavancaTurbo;

        System.out.println("Controle Arcade " + getNome() + " criado");
    }

    public boolean isPossuiAlavancaTurbo() {
        return possuiAlavancaTurbo;
    }

    public void setPossuiAlavancaTurbo(boolean possuiAlavancaTurbo) {
        this.possuiAlavancaTurbo = possuiAlavancaTurbo;
    }
}
