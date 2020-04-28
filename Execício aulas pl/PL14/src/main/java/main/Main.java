package main;

import com.pelosi.pl14.exception.AnoInvalidoException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static public void main(String[] args) {

        createFile("aniversarios.txt");

        try {
            adicionarAniversarios();
        } catch (AnoInvalidoException e) {
            e.printStackTrace();
        }

    }

    static public void adicionarAniversarios() throws AnoInvalidoException {

        List<Aniversario> aniversarios = new ArrayList<Aniversario>();

        Scanner scanner = new Scanner(System.in);

        boolean over = false;

        while (!over) {
            System.out.println("Nome (\"ENTER para Terminar \"):");
            String nome = scanner.next();
            System.out.println("Data de Aniversário (ano/mes/dia):");
            String dataAniversario = scanner.next();

            // Pase data
            String[] data = dataAniversario.split("/");

            int ano;

            try {
                ano = Integer.parseInt(data[0]);
            } catch (Exception e) {

                throw new AnoInvalidoException("vai po caralho");

            }

            if (ano > 2018 || ano < 0) {
                throw new AnoInvalidoException("vai po caralho");
            }

        }

    }

    static public void createFile(String fileName) {
        try {

            PrintWriter writer = new PrintWriter("./src/main/resources/" + fileName, "UTF-8");

            writer.println("The first line");
            writer.println("The saaaaaaa line");
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println("sdad");
        }
    }

}
