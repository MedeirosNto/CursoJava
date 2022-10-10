package Fundamentos;
// (°F - 32) x 5/9.0 = °C
// Constante para armazenar o número 32, pode ser chamado de diferente ou Ajuste
// Constante para armazenar o valor 5/9.0, pode ser chamado de fator ou multiplicador
// Uma variável para a temperatura em °F
// Uma variável para o resultado em °C
public class Temperatura {
    public static void main(String[] args) {
        // (°F - 32) x 5/9.0 = °C
        final double fator = 5/9.0;
        final double ajuste = 32;
        double fahrenheit = 86;

        double celsius = (fahrenheit - ajuste) * fator;
        System.out.println("O resultado é: " + celsius + "°C.");
    }
}
