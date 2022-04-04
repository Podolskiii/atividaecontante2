package com.company;

import java.util.Objects;
import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
public class exercico3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu sexo");
        System.out.println(" m para masculino, f para feminino e  j para sexo indefinido ");
    String letra = scanner.nextLine();

    if(Objects.equals(letra,"m")) {
        System.out.println("seu sexo é masculino");
    }else if (Objects.equals(letra,"F")) {
        System.out.println("seu sexo e feminino");
    }else System.out.print("indefinido");
    }
}

