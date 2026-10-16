package br.com.fiapride.model;

public class ControleMobile extends Controle{
    private int larguraMaximaSmartphone; // Em milímetros, ex: 170

    public ControleMobile(String nome, Double preco, boolean wireless, int larguraMaximaSmartphone) {
        super(nome, preco, wireless);
        this.larguraMaximaSmartphone = larguraMaximaSmartphone;
    }

    @Override
    public void mapearBotao(){
        System.out.println("Mapeio de botoes no controle MOBILE");
    }

    public int getLarguraMaximaSmartphone() {
        return larguraMaximaSmartphone;
    }

    public void setLarguraMaximaSmartphone(int larguraMaximaSmartphone) {
        this.larguraMaximaSmartphone = larguraMaximaSmartphone;
    }
}
