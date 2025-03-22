package questoes;

import java.util.Scanner;;

public class Questao02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.next();

        System.out.println("Digite a 1ª nota: ");
        double primeiraNota = teclado.nextDouble();
        
        System.out.println("Digite a 2ª nota: ");
        double segundaNota = teclado.nextDouble();
        
        System.out.println("Digite a 3ª nota: ");
        double terceiraNota = teclado.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;
        String resultado;

        if (media >= 7){
            resultado = "Aprovado.";
        } else if (media >= 5 & media < 6.9) {
            resultado = "Recuperação.";
        } else {
            resultado = "Reprovado.";
        }

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Terceira nota: " + terceiraNota);
        System.out.println("Resultado: " + resultado);
    }
}