package br.com.fiapride.model.main;

import br.com.fiapride.model.Controle;

public class TesteControle {
    public static void main(String[] args) {
        System.out.println("--- Teste do Meu Objeto - CONTROLE ---");

        // 1. Instanciando o objeto (criando o espaço na memória)
        Controle controle = new Controle();

        // 2. Definindo os atributos diretamente
        controle.cor = "Azul";
        controle.preco = 530.0;

        // 3. Testando algum comportamento (se você criou na Aula 02)
        controle.atualizarPreco(490.0);

        // 4. Imprimindo o resultado no console
        System.out.println("Preco antigo: " + "R$ " +controle.preco);
        System.out.println("Cor do Controle: " + controle.cor);
    }
}
