public class Main {
    public static void main(String[] args) {
        //VARIBALES PRIMITIVAS------------------------
        byte edad = 20;
        int numeroGrande = 1000;

        double edad2 = 20.5;
        float edad3 = 15.5f;

        boolean isActive = true;
        boolean isActive2 = false;

        char curso = 'A';
        //sout -> snippet
        System.out.println(curso);
        System.out.println(numeroGrande);

        //STRINGS---------------------------------

        //String text = new String("Hola Mundo!"); String no literal
        String text = "Hola Mundo!"; //String literal

        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hola","Chau"); // argumento
        // argumento != parametro
        System.out.println(texto);
        System.out.println(text);

        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("unds"));
        System.out.println(texto.indexOf("Mund"));

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        String malo = "    chanchito feliz   ";
        System.out.println(malo.trim());
        System.out.println(malo);

        //CARACTERES DE ESCAPE--------------------------------------------------

        String texto4 = "C:\\Hola \"Mundo\">";
        System.out.println(texto4);

        String texto5 = "Hola \nMundo";
        String texto6 = "Hola \tMundo";
        System.out.println(texto5);

        //ARRAYS---------------------------------------
        int[] numeros = new int[5];// pongo cantidad de elementos [0,1,2,3,4]
        //por defecto uno de int me lo inicializa todos en 0
        // en bool todos falsos
        //string vacio


    }
}