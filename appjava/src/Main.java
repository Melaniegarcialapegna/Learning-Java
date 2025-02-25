import java.util.Arrays;

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
        System.out.println(numeros);

        // Arrays //OMG cuando le das enter te agrega la biblioteca de una (de la clase)
        System.out.println(Arrays.toString(numeros));
        numeros[0] = 5;
        numeros[4] = 8;
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.length); // length = len
        Arrays.sort(numeros);
        System.out.println(numeros); //devuelve direccion de memoria
        System.out.println(Arrays.toString(numeros));//expresion : linea de codigo que te devuelve un valor

        //Otra forma de crear arrays
        int[] numeros2 = {0,1,2,3,4};
        //array de multiple dimension
        int[][] numeros3 = {{1,2},{3,4}};
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numeros3));
        System.out.println(Arrays.deepToString(numeros3));
        int[][] numeros4 = new int[3][2];//fila columna
        numeros4[0][0] = 5;
        System.out.println(Arrays.deepToString(numeros4));
        int[][][] numeros5 = new int[3][2][2];//fila columna
        numeros5[0][0][0] = 5;
        System.out.println(Arrays.deepToString(numeros5));

        //CONSTANTES-------------------------------------------
        //con el "final" convierto en constante
        final String empresa = "Melanie Garcia Lapegna";
        // empresa = "MGL"; me deja

        //
    }
}