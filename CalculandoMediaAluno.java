package controller;

import java.util.Scanner;

public class CalculandoMediaAluno {
    public static void main(String[] args) throws Exception {
        double primeiraNota;
        double segundaNota;
        double terceiraNota;
        double quartaNota;
        double media;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        primeiraNota = ler.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = ler.nextDouble();

        System.out.println("Digite a terceira nota: ");
        terceiraNota = ler.nextDouble();

        System.out.println("Digite a quarta nota: ");
        quartaNota = ler.nextDouble();

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.println("A média do aluno " + media);

        if ((media >= 5) || (media >= 10)) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }
    }
}
