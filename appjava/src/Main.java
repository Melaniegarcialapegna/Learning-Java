import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

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

        String texto = text.replace("Hola", "Chau"); // argumento
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
        int[] numeros2 = {0, 1, 2, 3, 4};
        //array de multiple dimension
        int[][] numeros3 = {{1, 2}, {3, 4}};
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

        //OPERADORES ARITMETICOS--------------------------------
        int a = 2 + 2;
        System.out.println(a);
        int b = 2 - 2;
        int c = 2 *2;
        int d = 10 / 2;
        int e = 4 % 2;
        float f = 10 / 3; // no funca
        float g = 10f / 3f; //division con decimales
        double h = 10.0 / 3.0;

        int x = 5;
        ++x; //x+1 -> la variable incrementa su valor
        x++; //x+1 -> lo aumenta luego! , si lo hiciera mientras lo estoy imprimiendo primero imprime el 5 y luego recien le suma 1
        x = x + 5;
        x += 5; //x = x+5
        System.out.println(x);

        //ORDEN DE LAS OPERACIONES--------------------------------
        int r = 5 + 3 * 2;
        /** orden: PEMDAS
         * parentesis
         * potencia
         * multiplicacion
         * division
         * suma/resta
         */
        System.out.println(r);

        //CONVERSION DE TIPOS-------------------------------------
        //Conversion implicita
        byte a1 = 1;
        int b1 = 15;
        int c1 = a + b; //java se encarga de castear el byte a int (pq dev int) PERO NO TOCA A a1, solo lo hace para la suma pero la vaariable queda igual
        // SI O SI TIENE QUE IR DE DATO MAS CHIQUITO A DATO MAS GRANDE
        // byte ->short -> int -> long -> float -> double

        byte a11 = 1;
        double b11 = 15.15;
        double c11 = a11 + b11;
        System.out.println(c11);

        //Conversion explicita
        int a2 = 15;
        double b2 = 15.015;
        int c2 = (int) (a2+b2); //transformo la ecuacion entera
        int d2 = a2+(int)b2 ;//transformo solo a b2
        System.out.println(c2);

        String a3 = "1.1";
        int b3 = 5;
        double c3 = Double.parseDouble( a3 )+ b3; // EXISTE PARA TODOS LOS TIPOS DE DATOS, ES UNA CLASE!! (la de int se llama Integer)
        System.out.println(c3);

        //CLASE MATH-------------------------------------
        //System.out.println(Math.abs(-15)); //metodo overloaded: puedo usar el mismo metodo para distintos tipos de datos
        //System.out.println(Math.ceil(10.00001)); // redondea para arriba
        //System.out.println(Math.floor(10.9999)); // redondea para abajo
        //System.out.println(Math.max(2,3 ));// devuelve el mayor
        //System.out.println(Math.min(2,3 )); // devuelve el min
        //System.out.println(Math.round(15.5)); // redondea al numero mas cercano(si es el del medio redondea para arriba)
        //System.out.println(Math.random(12)); //devuleve un numero random entre 0 y 12

        //FORMATO DE NUMEROS------------------------------
        //Clase : NumberFormat
        Locale locale = Locale.forLanguageTag("es-AR");
        NumberFormat number = NumberFormat.getCurrencyInstance(locale);//para trabajar con tipos de monedas
        String result = number.format(1099.90);
        System.out.println(result);

        NumberFormat porcentaje = NumberFormat.getPercentInstance(locale);
        System.out.println(porcentaje.format(15));

        //CLASE SCANNER--------------------------------------
        //interaccion con usuarios :)
        Scanner scanner = new Scanner(System.in);
        String valor = scanner.next(); //toma el primer token
        System.out.println(valor);
        String valor2 = scanner.nextLine(); // toma todo
        System.out.println(valor2)<>;

        Byte valor3 = scanner.nextByte(); // toma todo
        System.out.println(valor2);
    }

}