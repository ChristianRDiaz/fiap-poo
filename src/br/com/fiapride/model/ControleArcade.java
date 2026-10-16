package br.com.fiapride.model;

public class ControleArcade extends Controle {
    private boolean possuiAlavancaTurbo;

    public ControleArcade(String nome, Double preco, boolean wireless, boolean possuiAlavancaTurbo) {
        super(nome, preco, wireless);
        this.possuiAlavancaTurbo = possuiAlavancaTurbo;
    }

    @Override
    public void mapearBotao(){
        System.out.println("Mapeio de botoes no controle ARCADE");
    }

    public boolean isPossuiAlavancaTurbo() {
        return possuiAlavancaTurbo;
    }

    public void setPossuiAlavancaTurbo(boolean possuiAlavancaTurbo) {
        this.possuiAlavancaTurbo = possuiAlavancaTurbo;
    }
}
