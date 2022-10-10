package Fundamentos;

public class Ternario {
    public static void main(String[] args) {

        double media = 8.6;
        String resultadoFinal = media >= 7.0 ?
                "Aprovado" : "em recuperação.";
        System.out.println("O aluno está " + resultadoFinal);

        double nota = 8.5;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim" : "Não.";
        System.out.println("Tem desconto? " + resultado);
    }
}
