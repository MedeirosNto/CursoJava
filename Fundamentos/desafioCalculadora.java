package Fundamentos;

import java.util.Scanner;

public class desafioCalculadora {
    public static void main(String[] args) {
        // Ler o primeiro numero: num1
        // Ler o segundo número: num2
        // Perguntar ao usuário qual operação ele quer fazer (+ - * / %)

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String op = entrada.next();

        // Lógica do calculo

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
        entrada.close();
    }
}
