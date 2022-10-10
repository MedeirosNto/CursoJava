package Fundamentos;

public class Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(30 != 7); // Diferente
        System.out.println(3 > 4); // Maior que
        System.out.println(3 >= 3); // Maior ou igual que
        System.out.println(3 < 7); // Menor que
        System.out.println(30 <= 7); // Menor ou igual que

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);




    }
}
