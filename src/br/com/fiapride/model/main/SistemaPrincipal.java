package br.com.fiapride.model.main;

import br.com.fiapride.model.Controle;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Christian";
        passageiro1.saldo = 100.0;

        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Anderson";
        passageiro2.saldo = 200.0;

        Passageiro passageiro3 = new Passageiro();
        passageiro3.nome = "Maria";
        passageiro3.saldo = 300.0;
        //-------------------Meu objeto--------------

        Controle controle1 = new Controle();
        controle1.nome="Controle Xbox Series X";
        controle1.preco= 540.00;
        controle1.cor = "Shock Blue";
        controle1.wireless = false;

        Controle controle2 = new Controle();
        controle2.nome="Controle Sony DualSense ps5";
        controle2.preco= 499.00;
        controle2.cor = "Cosmic Red";
        controle2.wireless = true;


        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Nome: " + passageiro1.nome + " | " + " Saldo: " + passageiro1.saldo);

        System.out.println("Nome: " + passageiro2.nome + " | " + " Saldo: " + passageiro2.saldo);

        System.out.println("Nome: " + passageiro3.nome + " | " + " Saldo: " + passageiro3.saldo);

        System.out.println("\n--- Meu Objeto  1---");
        System.out.println("Nome: "+ controle1.nome);
        System.out.println("Preço: "+ controle1.preco);
        System.out.println("Cor: "+ controle1.cor);
        System.out.println("Wireles: "+ controle1.wireless);

        System.out.println("\n--- Meu objeto 2 ---");
        System.out.println("Nome: "+ controle2.nome);
        System.out.println("Preço: "+ controle2.preco);
        System.out.println("Cor: "+ controle2.cor);
        System.out.println("Wireles: "+ controle2.wireless);
    }
}
