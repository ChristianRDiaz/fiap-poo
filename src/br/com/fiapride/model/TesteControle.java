package br.com.fiapride.model;

public class TesteControle {
    public static void main(String[] args) {
        System.out.println("=== FIAPRIDE: Teste de Classes Abstratas e Polimorfismo ===");
        System.out.println();

        // Controles
        Controle meuMobile = new ControleMobile("GameSir X2", 250.0, true, 170);
        Controle meuArcade = new ControleArcade("Arcade Pro", 600.0, false, true);

        // Chamar o metodo abstrato
        System.out.println("--- Teste de Mapeamento Individual ---");
        meuMobile.mapearBotao();
        meuArcade.mapearBotao();

        System.out.println();
        System.out.println("=== Teste de Polimorfismo com Array ===");

        Controle[] inventarioControles = new Controle[] {
                new ControleMobile("Razer Kishi - Mobile", 400.0, true, 180),
                new ControleArcade("FightStick - Arcade", 800.0, false, true),
                new ControleMobile(" Backbone One - Mobile", 450.0, true, 175)
        };

        // Percorremos o array chamando o mesmo metodo.
        for (Controle controle : inventarioControles) {
            System.out.println("Nome: " + controle.getNome());
            controle.mapearBotao();
            System.out.println("----------------------------------------");
        }
    }
}
