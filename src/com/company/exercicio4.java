package com.company;

import java.util.Objects;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua letra ");
        System.out.println("sua letra, vocal = a, e, i, o, u e consoantes ");
        String suaLetra = scanner.nextLine();
        if (Objects.equals(suaLetra, "a")) {
            System.out.println("sua letra é uma vocal: " + suaLetra);

        } else
            System.out.println("sua letra é uma consoante: " + suaLetra);

        if (Objects.equals(suaLetra, "e")) {
            System.out.println("sua letra é uma vocal: " + suaLetra);

            if (Objects.equals(suaLetra, "i")) {
                System.out.println("sua letra é uma vocal: " + suaLetra);


                if (Objects.equals(suaLetra, "o")) {
                    System.out.println("sua letra é uma vocal: " + suaLetra);


                    if (Objects.equals(suaLetra, "u")) {
                        System.out.println("sua letra é uma vocal: " + suaLetra);


                    }
                }

            }
        }
    }
}








