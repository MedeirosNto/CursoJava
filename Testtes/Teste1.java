package Testtes;

// Constante para armazenar o número 32, pode ser chamado de diferente ou Ajuste
// Constante para armazenar o valor 5/9.0, pode ser chamado de fator ou multiplicador

public class Teste1 {
    public static void main(String[] args) {
        // (°F - 32) x 5/9.0 = °C
        final double ajuste = 32;
                final double fator = 5/9.0;
                double far = 52;
                        double celsius = (far - ajuste) * fator;
                        System.out.println("O valor é: " + celsius);
    }
}
