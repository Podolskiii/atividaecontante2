package com.company;

import java.util.Scanner;
//Faça um Programa que leia três números e mostre o maior deles.

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o primeiro numero");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("digite o segundo numero");
        double segundoNumero = scanner.nextDouble();
        System.out.print("digite o terceiro numero");
        double terceiroNumero = scanner.nextDouble();
        if (primeiroNumero>segundoNumero & primeiroNumero>terceiroNumero) {
            System.out.println("maior numero é:" + primeiroNumero);
        }else if (segundoNumero > primeiroNumero & segundoNumero > terceiroNumero) {
            System.out.println("maior numero é:" + segundoNumero);
        } else if (terceiroNumero>segundoNumero & terceiroNumero > primeiroNumero);
        System.out.println("maior numero é:" + terceiroNumero);

        }
    }

