package com.company.AtividadesDeDecisao;


import java.util.Scanner;

public class AprovadoOuReprovadoIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();
        byte divisorDeMedia = 3;
        double somaDeNotas = nota1 + nota2 + nota3;
        double resultado = somaDeNotas / divisorDeMedia;
        System.out.println("Sua nota foi: " + resultado );
        if (resultado == 10) {
            System.out.print("Parabens, você foi aprovado!");
        } else if (resultado <= 7) {
            System.out.print("Nao foi dessa vez, você foi reprovado!");
        } else if (resultado >= 7){
            System.out.print("Meus Parabéns!");
        }
    }
}

