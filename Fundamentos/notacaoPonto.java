package Fundamentos;

import java.util.Locale;

public class notacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String X = "leo".toUpperCase();
        System.out.println(X);

        String y = "Bom dia X".replace("X","Gui").toUpperCase().concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."

        int a = 3;
    }
}
