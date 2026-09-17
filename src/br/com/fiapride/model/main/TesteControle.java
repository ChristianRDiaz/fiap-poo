package br.com.fiapride.model.main;

import br.com.fiapride.model.Bateria;
import br.com.fiapride.model.Controle;

public class TesteControle {
    public static void main(String[] args) {
        System.out.println("--- Teste do Meu Objeto - CONTROLE ---");

        // 1. Criamos a bateria primeiro (independente)
        Bateria pilhaDoControle = new Bateria(2000);

        // 2. Criamos o controle injetando/associando a bateria nele
        Controle meuControle = new Controle("DualSense", 450.0, true, pilhaDoControle);

        // 3. Testando a navegação entre os objetos (igualzinho na Viagem!)
        meuControle.exibirStatusBateria();

        // 4. Gastando a carga para ver a bateria interagir
        pilhaDoControle.gastarCarga(25);

        System.out.println("\nApós jogar um pouco...");
        meuControle.exibirStatusBateria();
    }
}
