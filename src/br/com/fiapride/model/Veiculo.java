package br.com.fiapride.model;

public abstract class Veiculo {
    // 1. Atributos sempre privados (Encapsulamento)
    private String placa;
    private String modelo;
    private double nivelCombustivel;

    // 2. O CONSTRUTOR (O Cartório)
    public Veiculo(String placa, String modelo) {
        this.setPlaca(placa);
        this.modelo = modelo;
    }

    // 3. Getters (Apenas leitura)
    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    // METODO ABSTRATO (sem corpo)
    // OBRIGA todas as filhas a implementarem este metodo!
    public abstract void exibirTipo();

    public void atualizarPlaca(String novaPlaca) {
        System.out.println("🔄 Solicitada atualização de placa no Detran para o veículo " + this.modelo + "...");
        this.setPlaca(novaPlaca);
    }

    private void setPlaca(String novaPlaca) {
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
        } else {
            System.out.println("❌ Erro de Validação: A placa informada é inválida!");
        }
    }
    public String calcularAutonomia() {
        return "Autonomia não definida para um veículo genérico.";
    }

    public void abaster(int quantidade) {
        this.setNivelCombustivel( this.getNivelCombustivel() + quantidade);
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    private void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    // Obs: O modelo do carro é IMUTÁVEL na vida real (um Fiat Uno não se transforma em um Corolla).
    // Portanto, a regra de negócio exige que NÃO exista um metodo setModelo()!
}