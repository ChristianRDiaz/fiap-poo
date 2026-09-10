package br.com.fiapride.model;

public class Controle {
    public String nome;
    public Double preco;
    public String cor;
    public boolean wireless;

    public Controle(String nome, Double preco, boolean wireless) {
        this.nome = nome;
        this.preco = preco;
        this.wireless = wireless;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public void alternarConexao(boolean wireless) {
        this.wireless = wireless;
        if(this.wireless) {
            System.out.println("O controle " + nome + ", mudou para o modo com wireless");
        } else {
            System.out.println("O controle " + nome + ", mudou para o modo com cabo");
        }
    }

    public void atualizarPreco(Double novoPreco) {
        if (novoPreco <= 0){
            System.out.println("O preco náo pode ser zero nem negativo ");
        }else {
            System.out.println("Preço atualizado: R$ " + novoPreco);
        }
    }

}
