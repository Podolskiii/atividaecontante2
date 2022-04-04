package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero");
        double numeroum = scanner.nextDouble();
        System.out.print("Digite outro numero");
        double numerodois = scanner.nextDouble();
        if (numeroum > numerodois) {
            System.out.print("maior numero foi: " + numeroum);
        } else
            System.out.print("maior numero foi : " + numerodois);
        scanner.close();
    }
 }
