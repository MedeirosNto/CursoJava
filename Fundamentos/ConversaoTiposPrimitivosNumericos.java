package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; // Conversão implícita
        System.out.print(a);

        float b = (float) 1.12345; // Conversão Explícita (CAST)
        System.out.print(b);


        // Conversões explícitas (CAST)

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e;
        System.out.println(f);

    }
}
