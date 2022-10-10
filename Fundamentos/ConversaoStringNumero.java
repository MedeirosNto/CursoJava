package Fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite a primeira nota do aluno: ");

        String valor2 = JOptionPane.showInputDialog("Digite a segunda nota do aluno: ");

        System.out.println("O primeiro valor digitado foi: " + valor1 + "\nO segundo valor:" + valor2 + "\nConfere?");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + soma /2 );

    }
}
