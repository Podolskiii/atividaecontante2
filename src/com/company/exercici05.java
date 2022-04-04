package com.company;

import java.util.Scanner;
//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.

public class exercici05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeira nota ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("segunda nota ");
        double segundaNota = scanner.nextDouble();
        double divisor = 2;
        double resultadoNota = (primeiraNota + segundaNota)/divisor;

        if(resultadoNota >=7 & resultadoNota < 10){
            System.out.print("parabens voce passou ");
        }
        else if(resultadoNota>=10) {
            System.out.print("parabens foi aprovado com distinção");
        }
        else{
         System.out.print("parabens foi reprovado");


        }


    }
}

