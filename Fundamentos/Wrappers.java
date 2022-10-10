package Fundamentos;

public class Wrappers {
    public static void main(String[] args) {

       //byte
        Byte b = 100;
        Short s = 1000;

        //Integer.parseInt(entrada.next());
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        // Float
        Float f = 123.10F;
        System.out.println(f);

        // Double
        Double d = 123.456;
                System.out.println(d);

        // Boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

       // char
        Character c = '#';
        System.out.println(c + "...");



    }
}