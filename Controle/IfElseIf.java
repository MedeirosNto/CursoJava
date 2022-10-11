package Controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        String nota = entrada.next();
        double notaConvertida = Double.parseDouble(nota);

        if (notaConvertida > 10 || notaConvertida < 0) {
            System.out.println("Nota inválida");
        } else if (notaConvertida >= 8.1) {
                System.out.println("Conceito A");
         } else if (notaConvertida >= 6.1) {
                    System.out.println("Conceito B");
            } else if (notaConvertida >= 4.1) {
                        System.out.println("Conceito C");
                } else if (notaConvertida >= 2.1) {
                            System.out.println("Conceito D");
                     } else {
                                System.out.println("Conceito E");
        }
            System.out.println("Fim!");

            entrada.close();
    }
}