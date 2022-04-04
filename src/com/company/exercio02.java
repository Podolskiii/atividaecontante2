package com.company;

import java.util.Scanner;

//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
public class exercio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor");
        double valorDoNumero = scanner.nextDouble();
        if (valorDoNumero > 0) {
       System.out.print("Seu numero é positivo : " + valorDoNumero);
        }else
            System.out.print(" Seu numero é negativo : " + valorDoNumero);








    }
}
