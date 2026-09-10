package br.com.fiapride.model;

public class Controle {
    public String nome;
    public Double preco;
    public String cor;
    public boolean wireless;


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
