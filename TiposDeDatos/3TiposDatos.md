# Tipos de Datos en Java

En Java existen ocho tipos de datos, también conocidos como tipos primitivos: `byte`, `short`, `int`, `long`, `char`, `float`, `double` y `boolean`. Estos tipos de datos se pueden clasificar en cuatro grupos:

## Enteros

Este grupo incluye `byte`, `short`, `int` y `long`. Estos tipos de datos nos permiten trabajar con números enteros, ya sean positivos o negativos.

| Nombre | Bytes | Rango |
|--------|-------|----------------------------------------------------------|
| `long` | 8     | –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807   |
| `int`  | 4     | –2,147,483,648 a 2,147,483,647                           |
| `short`| 2     | –32,768 a 32,767                                         |
| `byte` | 1     | –128 a 127                                               |

En la mayoría de los casos, usaremos el tipo de dato `int` para números positivos.

**Ejemplos:**

```java
byte diasMes = 31; // Aproximadamente
short diasLustro = (12 * 31) * 5;
int velocidadLuz = 299792458;
long añoLuz = velocidadLuz * 365L;
```

## Flotantes/Decimales

Este grupo incluye `float` y `double`. Estos tipos de datos nos permiten trabajar con números que poseen punto decimal, ya sean positivos o negativos.

| Nombre  | Bytes | Rango Aproximado            |
|---------|-------|-----------------------------|
| `double`| 8     | 4.9e–324 a 1.8e+308         |
| `float` | 4     | 1.4e–045 a 3.4e+038         |

**Ejemplos:**

```java
float pi = 3.1415926535f;
double e = 2.718281828459045235360;
```

## Caracteres

En el grupo de caracteres únicamente encontraremos el tipo de dato `char`. Este tipo de datos nos permitirá trabajar con caracteres.

**Ejemplos:**

```java
char letraA = 'a';
char letraANumerico = 61;
```

## Booleanos

Al igual que el grupo de caracteres, en el grupo de booleanos únicamente encontraremos un tipo de dato, el `boolean`. Este tipo de datos nos permitirá trabajar con valores lógicos, verdadero o falso.

**Ejemplos:**

```java
boolean verdadero = true;
boolean falso = false;
```