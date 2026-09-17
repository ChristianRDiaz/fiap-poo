package br.com.fiapride.model;

public class Bateria {
    // Atributos Simples
    private int nivelCarga;
    private boolean carregando;
    private int capacidadeMah;

    // Quando criamos uma bateria, capacidade inicial 100
    public Bateria(int capacidadeMah) {
        this.capacidadeMah = capacidadeMah;
        this.nivelCarga = 100; // cheia por padrão
        this.carregando = false;
        System.out.println("Bateria de " + this.capacidadeMah + "mAh instalada.");
    }

    // Métodos de Ação (Comportamento)
    public void gastarCarga(int quantidade) {
        this.nivelCarga -= quantidade;
        if (this.nivelCarga < 0) {
            this.nivelCarga = 0;
        }
    }

    public void carregarBateria() {
        this.carregando = true;
        this.nivelCarga = 100;
        System.out.println("Bateria totalmente carregada.");
    }

    public int getNivelCarga() {
        return this.nivelCarga;
    }

    public boolean isCarregando() {
        return this.carregando;
    }
}
