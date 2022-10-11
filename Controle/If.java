package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        String media = entrada.next().replace(",", ".");
        double mediaConvertida = Double.parseDouble(media);

        if (mediaConvertida >= 7.0 && mediaConvertida <= 10) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        } else if (mediaConvertida >= 4.5 && mediaConvertida < 7) {
            System.out.println("Recuperação");

        } else if (mediaConvertida < 4.5) {
            System.out.println("Reprovado");

        } else {
            System.out.println("Valor informado fora do padrão");

        }

        entrada.close();
    }
}
