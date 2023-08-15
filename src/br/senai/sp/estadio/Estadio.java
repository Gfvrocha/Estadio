package br.senai.sp.estadio;

import java.util.Objects;
import java.util.Scanner;

public class Estadio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome, corCamisa;
        int idade;

        System.out.print("Nome: ");
        nome = teclado.next();

        System.out.print("Idade: ");
        idade = teclado.nextInt();

        System.out.println("Cor da camiseta: ");
        corCamisa = teclado.next();

        if(Objects.equals(corCamisa, "azul")){
            System.out.println("Arquibancada Azul!");
        }



    }
}
