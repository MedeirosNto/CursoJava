package Fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        // Variável utilizando Wrapper
        Integer num1 = 10000;
        System.out.println(num1.toString().length());
// Variável utilizando tipo primitivo
        int num2 = 100000;
        System.out.println(Integer.toString(num2). length());

        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());



    }
}
