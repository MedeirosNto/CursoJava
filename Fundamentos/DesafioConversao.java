package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // Solicitado informações
        System.out.println("Digite em ordem crescente os seus 3 ultimos salários\n");

        System.out.println("Digite o seu salário do mês 7 (Julho): ");
        String valor1 = entrada.nextLine();

        System.out.println("Digite o seu salário do mês 8 (Agosto): ");
        String valor2 = entrada.nextLine();

        System.out.println("Digite o seu salário do mês 9 (Setembro): ");
        String valor3 = entrada.nextLine();

        //Convertendo String para Double e dando replace para que a vírgula seja aceita
        double numero1 = Double.parseDouble(valor1.replace(",","."));
        double numero2 = Double.parseDouble(valor2.replace(",","."));
        double numero3 = Double.parseDouble(valor3.replace(",","."));

        // Realizando a soma, e após a média
        double soma = numero1 + numero2 + numero3;
        double medida = soma / 3;

        // Divulgação do resultado da média
        System.out.println("A media salarial do empregado é: " + medida + " ");


        entrada.close();


    }
}
