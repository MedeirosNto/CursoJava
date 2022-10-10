package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // informações do funcionário

        // tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445_44F;
        double vendasAcumuladas = 2;

        // Tipo booleano
        boolean estaDeFerias = true; // ou true

        // Tipo caractere, só aceita 1 Letra
        char status = 'A'; // Ativo

        // Dias de empresa
        System.out.println("A quantidade de dias na empresa é: " + anosDeEmpresa*365);

        // Número de viagens
        System.out.println("A quantidade de viagens é: " + numeroDeVoos / 2);

        // Pontos por real
        System.out.println(" A quantidade de pontos por real é: " + pontosAcumulados / vendasAcumuladas);

        System.out.println(" O funcionário " + id + " ganha " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}

