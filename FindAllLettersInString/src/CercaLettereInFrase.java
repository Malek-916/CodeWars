import com.sun.tools.javac.Main;

public class CercaLettereInFrase {
    public static void main(String[] args) {


        System.out.println(funzione("qazwssxedcgrfvtgbyhnujmikolpg"));


    }

    public static boolean funzione(String input) {

        if (input.length()<26) {
            return false;
        }

        String letterre = "qazwsxedcrfvtgbyhnujmikolp";
        char[] vet = letterre.toCharArray();
        boolean[] vetBoo = new boolean[26];
        char[] frase = input.toCharArray();

        for (int i = 0;i<vet.length;i++) {
        char letteraAlfa = vet[i];

            for (int i1 = 0;i1<frase.length;i1++) {

                char lettFrase = frase[i1];

                if (letteraAlfa == lettFrase)
                    vetBoo[i] = true;
            }
        }
        for (boolean b: vetBoo) {
            if (b == false)
                return false;
        }
    return true;
    }
/*
        for (int i = 0; i < input.length(); i++) {

            if (!input.contains("q"))
                return false;
            if (!input.contains("a"))
                return false;
            if (!input.contains("z"))
                return false;
            if (!input.contains("w"))
                return false;
            if (!input.contains("s"))
                return false;
            if (!input.contains("x"))
                return false;
            if (!input.contains("e"))
                return false;
            if (!input.contains("d"))
                return false;
            if (!input.contains("c"))
                return false;
            if (!input.contains("r"))
                return false;
            if (!input.contains("f"))
                return false;
            if (!input.contains("v"))
                return false;
            if (!input.contains("t"))
                return false;
            if (!input.contains("g"))
                return false;
            if (!input.contains("b"))
                return false;
            if (!input.contains("y"))
                return false;
            if (!input.contains("h"))
                return false;
            if (!input.contains("n"))
                return false;
            if (!input.contains("u"))
                return false;
            if (!input.contains("j"))
                return false;
            if (!input.contains("m"))
                return false;
            if (!input.contains("i"))
                return false;
            if (!input.contains("k"))
                return false;
            if (!input.contains("o"))
                return false;
            if (!input.contains("l"))
                return false;
            if (!input.contains("p"))
                return false;




        }


        return true;

    }

 */
}





