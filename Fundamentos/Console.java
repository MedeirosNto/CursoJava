package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);

        System.out.printf("Salário: %.1f\n", 1234.2568);
        System.out.printf("Nome: %s", "João\n\n");


        // Isso é o input do python, para que o usuário digite uma informação e apartir dalí iniciar algo.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite a sua profissão: ");
        String prof = entrada.nextLine();

        System.out.println("\n\nNome = " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + prof);

        System.out.println("Obrigado pelas informações, seu cadastro foi realizado com sucesso");


        entrada.close();


    }
}
