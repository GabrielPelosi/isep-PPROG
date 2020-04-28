package org.dei.excecaoUnchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Pessoa p = new Pessoa();

        boolean dadosInvalidos = true;

        do {
            try {
                System.out.print("Nome:");
                String nome = ler.nextLine();
                p.setNome(nome);

                System.out.print("Nº de ID Civil:");
                int idCivil = ler.nextInt();
                ler.nextLine();
                p.setIDCivil(idCivil);

                dadosInvalidos = false;

                System.out.println("\nPessoa: " + p);
            } catch (IllegalArgumentException e) {
                System.out.println("Exceção: " + e.getClass().getSimpleName() + " Msg -> " + e.getMessage());
            } catch (InputMismatchException ee) {
                System.out.println("Exceção: " + ee.getClass().getSimpleName() + " Msg -> valor introduzido só pode ser inteiro");

            }
        } while (dadosInvalidos);

    }

}
