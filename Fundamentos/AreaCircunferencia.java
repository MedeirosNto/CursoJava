package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.1416;

        double area = PI * raio * raio;

        System.out.println("A área da circunferência é: " + area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + " m2");

    }
}
