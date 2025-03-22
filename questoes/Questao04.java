package questoes;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine(); 

        double[] notas = new double[2];  

        for (int i = 0; i < notas.length; i++) {
            boolean notaValida = false;
            while (!notaValida) {
                System.out.println("Digite a " + (i + 1) + "ª nota: ");
                double nota = teclado.nextDouble();
                
                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                    notaValida = true;  
                } else {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            }
        }

        double media = (notas[0] + notas[1]) / 2;
        String resultado;

        if (media >= 7) {
            resultado = "Aprovado.";
        } else {
            resultado = "Reprovado.";
        }

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Segunda nota: " + notas[1]);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
}