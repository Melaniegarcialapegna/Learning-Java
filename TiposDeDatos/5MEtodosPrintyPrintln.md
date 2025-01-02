# Métodos `print` y `println` en Java

Para mostrar un mensaje en consola, utilizamos los métodos `print`, `println` o `printf`. En este post, nos enfocaremos en `print` y `println`. Hablaremos de `printf` más adelante.

## Método `println`

El método `println` imprime el mensaje en consola con un salto de línea.

```java
System.out.println("Hola Mundo");
System.out.println("Mi nombre es Codi");
```

**Salida:**

```
Hola Mundo
Mi nombre es Codi
```

## Método `print`

El método `print` imprime el mensaje en la misma línea.

```java
System.out.print("Hola Mundo");
System.out.print("Mi nombre es Codi");
```

**Salida:**

```
Hola MundoMi nombre es Codi
```

## Secuencias de escape

Java nos provee de secuencias de escape que permiten dar formato a las cadenas de texto.

- `\n`: Salto de línea.
- `\t`: Tabulador.
- `\\`: Diagonal inversa.
- `\"`: Comillas dobles.
- `\'`: Comillas simples.

Estas secuencias pueden ser utilizadas junto con los métodos previamente mencionados.

### Ejemplos

```java
System.out.print("Hola,\nagregamos un salto");
System.out.print("\tagregamos un tab");
System.out.println("");

System.out.println("Mensaje con \\ diagonal inversa");
System.out.println("Mensaje con \" comillas dobles");
System.out.println("Mensaje con \' comillas simples");
```

**Salida:**

```
Hola,
agregamos un salto    agregamos un tab
Mensaje con \ diagonal inversa
Mensaje con " comillas dobles
Mensaje con ' comillas simples
```