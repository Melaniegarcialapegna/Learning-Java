Para que nosotros podamos mostrar un mensaje en consola debemos hacer uso de los métodos print, println o printf. Para este post nos concentramos en print y println, de printf ya estaremos hablando más adelante.

Con el método println el mensaje se imprimirá en consola con un salto de línea.

System.out.println("Hola Mundo");
System.out.println("Mi nombre es Codi");
Salida

Hola Mundo
Mi nombre es Codi
Por otro lado, el método print imprimirá el mensaje en la misma línea.

System.out.print("Hola Mundo");
System.out.print("Mi nombre es Codi");
Salida

Hola MundoMi nombre es Codi
Secuencias de escapes
Java nos provee de una secuencia de escapes que nos permiten dar formato a las cadenas de texto con las que nos encontramos trabajando.

\n. Salto de línea.
\t. Tabulador.
\\. Diagonal inversa.
\". Comillas dobles.
\'. Comillas simples.
Estas secuencias pueden ser utilizadas junto con los métodos previamente mencionados.

Ejemplos

System.out.print("Hola,\nagregamos un salto");
System.out.print("\tagregamos un tab");
System.out.println("");

System.out.println("Mensaje con \\ diagonal inversa");
System.out.println("Mensaje con \" comillas dobles");
System.out.println("Mensaje con \` comillas simples");
salida

Hola,
agregamos un salto  agregamos un tab
Mensaje con \ diagonal inversa
Mensaje con " comillas dobles
Mensaje con ' comillas simples