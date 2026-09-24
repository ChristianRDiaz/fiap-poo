package br.com.fiapride.model;

public class TesteControle {
    public static void main(String[] args) {
    System.out.println("--- TESTE DE HERANÇA - CONTROLES DE CONSOLE ---\n");

    // 1. Criando as baterias independentes para cada controle
    Bateria bateriaArcade = new Bateria(3000);
    Bateria bateriaMobile = new Bateria(1500);

    // 2. Instanciando o objeto filho 1 (ControleArcade)
    ControleArcade meuArcade = new ControleArcade("Fighter Stick Pro", 600.0, false, bateriaArcade, true);

    // 3. Instanciando o objeto filho 2 (ControleMobile)
    ControleMobile meuMobile = new ControleMobile("GameSir X2", 350.0, true, bateriaMobile, 175);

        System.out.println("\n--- TESTANDO MÉTODOS HERDADOS ---");
    // O ControleArcade herda o método de atualizar preço da superclasse Controle!
        meuArcade.atualizarPreco(550.0);

    // O ControleMobile herda o método de exibir status da bateria (que usa a associação!)
        meuMobile.exibirStatusBateria();

        System.out.println("\n--- TESTANDO ATRIBUTOS EXCLUSIVOS DOS FILHOS ---");
    // Testando o atributo exclusivo do Arcade
        System.out.println("Arcade: "+meuArcade.getNome());
        System.out.println("Possui alavanca turbo? "+(meuArcade.isPossuiAlavancaTurbo()?"Sim":"Não"));

    // Testando o atributo exclusivo do Mobile
        System.out.println("Mobile: "+meuMobile.getNome());
        System.out.println("Largura máxima do smartphone: "+meuMobile.getLarguraMaximaSmartphone()+"mm");
    }
}
