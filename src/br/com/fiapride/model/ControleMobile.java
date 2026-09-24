package br.com.fiapride.model;

public class ControleMobile extends Controle{
    private int larguraMaximaSmartphone; // Em milímetros, ex: 170

    public ControleMobile(String nome, Double preco, boolean wireless, Bateria bateria, int larguraMaximaSmartphone) {
        super(nome, preco, wireless, bateria);
        this.larguraMaximaSmartphone = larguraMaximaSmartphone;

        System.out.println("📱 Controle Mobile para smartphones criado com sucesso!");
    }

    public int getLarguraMaximaSmartphone() {
        return larguraMaximaSmartphone;
    }

    public void setLarguraMaximaSmartphone(int larguraMaximaSmartphone) {
        this.larguraMaximaSmartphone = larguraMaximaSmartphone;
    }
}
