package Fundamentos;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        System.out.println("Comprou TV 50 Polegadas? " + comprouTV50);


                boolean comprouTV32 = trabalho1 || trabalho2;
                System.out.println("Comprou TV 32 Polegadas? " + comprouTV32);


                        boolean comprouSorvete = trabalho1 ^ trabalho2;
                        System.out.println("Comprou Sorvete? " + comprouSorvete);

                                boolean maisSaudavel = !comprouSorvete;
                                System.out.println("Mais saudável? " + maisSaudavel);
    }
}
