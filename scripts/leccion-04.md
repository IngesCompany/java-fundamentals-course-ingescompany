# Lección 4: Métodos, entrada/salida e introducción a la POO

_(Contenido para los instructores)_

**Objetivo:** Al terminar, el estudiante puede crear métodos con parámetros y con valor de retorno, leer lo que escribe el usuario con `Scanner` y crear su primer objeto a partir de una clase.

**Palabras nuevas:** método, parámetro, `return`, `Scanner`, entrada, salida, clase, objeto, `new`, programación orientada a objetos (POO).

## 1. Estructura de carpetas (GitHub)

```text
/starter-files/leccion-04        # Código de inicio de la lección
└── Main.java

/completed-examples/leccion-04   # Código completo de la lección
└── Main.java
```

## 2. Guion del video (12 minutos)

> **(0:00 - 0:30) Introducción**  
> En esta lección vas a dar tres pasos grandes: crear tus propios métodos, hacer que tu programa converse con quien lo usa y conocer las clases y los objetos, la base de la programación orientada a objetos.
>
> **(0:30 - 1:50) Partes de un método**  
> Un método es un bloque de código con nombre: lo escribes una vez y lo llamas cuantas veces quieras. Puede recibir datos, que se llaman parámetros, y puede devolver un resultado con return. El método duplicar recibe un número y devuelve el doble. Si un método no devuelve nada, en lugar del tipo de retorno se escribe void.
>
> **(1:50 - 4:30) Métodos en el código**  
> Escribo un método saludar que recibe un apodo y muestra hola. Desde main lo llamo con su nombre y le paso el apodo entre paréntesis. Ahora duplicar: recibe un int y devuelve número por dos. Como devuelve un valor, puedo usarlo dentro de println. Run: el saludo y el doble aparecen sin repetir código.
>
> **(4:30 - 5:40) Leer el teclado con Scanner**  
> Hasta ahora, los datos estaban escritos en el código. Para que el programa le pregunte algo a quien lo usa, existe Scanner, que viene en la biblioteca de Java. Arriba lo importamos, luego creamos un Scanner que lee del teclado, y usamos nextLine para leer texto y nextInt para leer un número entero.
>
> **(5:40 - 7:40) Scanner en el código**  
> Agrego el import, creo el Scanner y pido: escribe tu apodo. Leo la respuesta con nextLine y se la paso a saludar. Después pido un número, lo leo con nextInt y muestro el doble. Run. El programa espera: escribo un apodo inventado, Enter, y me saluda. Escribo 21 y me responde 42. Ahora el programa conversa contigo.
>
> **(7:40 - 8:50) Clase y objeto**  
> Y ahora, la gran idea de Java: las clases y los objetos. Una clase define los atributos y los métodos que tendrán sus objetos. Cada objeto es una instancia de la clase, y se crea con new. Con una clase Mascota puedes crear todos los objetos que quieras, y cada uno guarda sus propios valores.
>
> **(8:50 - 10:40) La primera clase en el código**  
> Escribo la clase Mascota, con un atributo nombre y un método saludar. En main creo un objeto con la palabra new: Mascota miso igual new Mascota. Le pongo nombre, Miso, y le pido que salude con miso punto saludar. Run: hola, soy Miso. Creaste tu primer objeto; en la próxima lección lo vas a mejorar mucho.
>
> **(10:40 - 11:20) Pausa y prueba**  
> Tu turno. Pausa el video y crea un método triplicar, pide un número con Scanner y muestra su triple. Después crea otra mascota con new y haz que salude. Si el programa se queda esperando, recuerda escribir en la consola. Cuando termines, sigue con el video.
>
> **(11:20 - 12:00) Resumen**  
> Hoy creaste métodos con parámetros y return, leíste datos con Scanner y creaste tu primer objeto. En la próxima lección vas a construir una clase completa y tu proyecto: un simulador de mascotas.

## 3. Sugerencias multimedia

- **Introducción (0:00), Lámina 19:** Portada de la lección 4. Texto en pantalla: «Lección 4 · Métodos, entrada/salida y POO»
- **Partes de un método (0:30), Lámina 20:** Lámina «Partes de un método»: el método `duplicar` con etiquetas para el nombre, el parámetro y `return`. Texto en pantalla: «Recibe (parámetro) → hace → devuelve (`return`)».
- **Métodos en el código (1:50), editor OnlineGDB, sin lámina:** Se escribe `saludar(String apodo)` y se llama desde `main`. Después se escribe `duplicar(int numero)` con `return`. Anotación: unir con una flecha la llamada y el método.
- **Leer el teclado con Scanner (4:30), Lámina 21:** Lámina «Leer el teclado con Scanner»: `import`, `new Scanner(System.in)`, `nextLine()` y `nextInt()`. Texto en pantalla: «`nextLine()` lee texto · `nextInt()` lee un entero».
- **Scanner en el código (5:40), editor OnlineGDB, sin lámina:** Se agrega `import java.util.Scanner;`, se crea `teclado` y se piden el apodo y el número. Se pulsa Run y se escribe en la consola. Texto en pantalla: «Escribe en la consola y presiona Enter». Zoom a la consola.
- **Clase y objeto (7:40), Lámina 22:** Lámina de dos columnas: «Clase» y «Objeto». Texto en pantalla: «Una clase, muchos objetos».
- **La primera clase en el código (8:50), editor OnlineGDB, sin lámina:** Arriba de `Main` se escribe la clase `Mascota` con el atributo `nombre` y el método `saludar()`. En `main`: `new Mascota()`, `miso.nombre = "Miso"` y `miso.saludar()`. Anotación: resaltar la palabra `new`.
- **Pausa y prueba (10:40), Lámina 23:** Tarjeta de pausa de 5 segundos con cuenta regresiva. Texto en pantalla: «Pausa el video y prueba» · «Tómate el tiempo que necesites»: «Crea un método `triplicar`», «Pide un número y muestra su triple», «Crea otra mascota y haz que salude».
- **Resumen (11:20), Lámina 24:** Lámina de resumen. Texto en pantalla: «Métodos» · «Parámetros y `return`» · «`Scanner`» · «Clases y objetos».

## 4. Pregunta para pensar

¿Qué pasa si escribes una palabra cuando el programa pide un número con `nextInt()`?
