package com.company;
//Faça um Programa que leia três números e mostre o maior e o menor deles.
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o primeiro numero ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("digite o segundo numero ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("digite o terceiro numero ");
        double terceiroNumero = scanner.nextDouble();
        if (primeiroNumero>segundoNumero & primeiroNumero>terceiroNumero) {
            System.out.print("maior numero é:" + primeiroNumero);
        }else if (segundoNumero > primeiroNumero & segundoNumero > terceiroNumero) {
            System.out.print("maior numero é:" + segundoNumero);
        } else if (terceiroNumero>segundoNumero & terceiroNumero > primeiroNumero);
        System.out.print("maior numero é:" + terceiroNumero);

        if (primeiroNumero<segundoNumero & primeiroNumero<terceiroNumero) {
            System.out.print("menor numero é:" + primeiroNumero);
        }else if (segundoNumero < primeiroNumero & segundoNumero < terceiroNumero) {
            System.out.print("menor numero é:" + segundoNumero);
        } else if (terceiroNumero < segundoNumero & terceiroNumero < primeiroNumero) {
            System.out.print("menor numero é:" + terceiroNumero);
        }
    }
}
