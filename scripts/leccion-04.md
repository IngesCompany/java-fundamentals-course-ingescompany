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

Los tiempos son los del audio (unos 11:10). Con las tarjetas de pausa, los Run y las transiciones de la edición, el video llega a unos 12 minutos. El guion detallado para grabar, con lo que se muestra en cada momento, está en [grabacion/leccion-04.md](grabacion/leccion-04.md).

> **(0:00 - 0:45) Introducción**  
> ¡Hola! Bienvenido a la lección cuatro de Fundamentos de Java. Hoy subimos de nivel. En este video vas a aprender tres cosas muy poderosas: crear tus propios métodos, hacer que tu programa te haga preguntas y te responda, y crear tu primer objeto. Al final del video vas a tener un programa que te pregunta tu apodo, hace cálculos por ti y hasta tiene su propia mascota que te saluda. Abre el editor en otra pestaña, porque vamos a programar juntos. ¿Listo? ¡Vamos!
>
> **(0:45 - 1:55) Partes de un método**  
> Empecemos con los métodos. Imagina que en un videojuego tienes un botón que hace un combo. No tienes que hacer cada movimiento a mano: aprietas el botón y listo. Un método es eso: un bloque de código con nombre que escribes una sola vez y usas todas las veces que quieras. Mira este método, duplicar. Entre paréntesis recibe un dato: eso se llama parámetro. Hace su trabajo, y con la palabra return te devuelve el resultado. La palabra que va antes del nombre, int, te dice qué tipo de dato devuelve. Y si un método no devuelve nada, en su lugar escribimos void, que significa vacío. Y un secreto: ya conoces un método. main, donde escribimos todo hasta ahora, también es un método. Es el primero que Java ejecuta cuando le das a Run.
>
> **(1:55 - 4:24) Métodos en el código**  
> Ahora, al editor. Escribe conmigo y, si voy muy rápido, pausa el video cuando quieras. Debajo del comentario uno vamos a crear un método que salude. Escribo static void saludar. Static, porque lo vamos a usar desde main. Void, porque no devuelve nada: solo muestra un mensaje. Entre paréntesis va el parámetro: un String llamado apodo. Y adentro, un println que diga hola, más el apodo. Ahora lo usamos. Dentro de main lo llamo por su nombre y le paso un apodo entre comillas: saludar, Pixel. Vamos con el segundo. Debajo del comentario dos escribo static int duplicar. Esta vez no es void, es int, porque este método sí devuelve algo: con return devuelve el número por dos. Y como duplicar devuelve un valor, lo puedo meter directo en un println: el doble de veintiuno es, más duplicar de veintiuno. Le doy a Run y… ¡mira! Sale el saludo y sale cuarenta y dos. Cada método hizo su trabajo, y no tuvimos que repetir código. Prueba rápida: cambia Pixel por otro apodo inventado y veintiuno por otro número, y dale Run otra vez. El resultado cambia, pero el método es el mismo. Si a ti también te salió, ¡bien hecho! Si no, revisa los paréntesis, las llaves y el punto y coma. Un dato: los nombres de los métodos se escriben en minúscula y, si tienen varias palabras, cada palabra nueva empieza con mayúscula, como mostrarPuntaje. Y deben decir lo que hacen: saludar saluda, duplicar duplica. Así cualquiera entiende tu código.
>
> **(4:24 - 5:11) Leer el teclado con Scanner**  
> Hasta ahora nosotros decidíamos todo dentro del código. Pero los programas buenos le preguntan cosas a quien los usa, como un juego que te pide tu nombre de jugador. Para eso Java tiene una herramienta que se llama Scanner. Java trae miles de herramientas guardadas en paquetes, como una caja de herramientas gigante. Con import sacamos de la caja la que necesitamos. Entonces: primero la importamos, después creamos un Scanner que lee lo que escribes en el teclado. Y usamos nextLine para leer texto, y nextInt para leer un número entero.
>
> **(5:11 - 7:20) Scanner en el código**  
> Volvamos al editor para que el programa converse contigo. En la primera línea, arriba de todo, escribo import java punto util punto Scanner. Y al inicio de main creo el Scanner: Scanner teclado igual new Scanner, System punto in. Teclado es solo el nombre que le puse. Ahora borro las dos líneas de antes y las cambio por preguntas. Primero: escribe tu apodo. Guardo la respuesta en un String con teclado punto nextLine, y se la paso a saludar. Después: escribe un número. Lo leo con nextInt y muestro el doble usando nuestro método duplicar. Y al final, cerramos el Scanner con close. Un detalle: para las preguntas usé print y no println. ¿La diferencia? println salta a la línea siguiente y print no; así lo que escribes aparece al lado de la pregunta. Run. Fíjate: el programa se queda esperando. ¡Está esperando que tú le escribas! Haz clic en la consola de abajo, escribe Pixel y presiona Enter. ¡Te saluda! Ahora escribe veintiuno, Enter… y te responde cuarenta y dos. Ojo: nextInt espera un número. ¿Qué pasará si escribes una palabra? Guárdate esa pregunta, porque la vamos a responder más adelante en el curso. Tu programa ya conversa contigo.
>
> **(7:20 - 8:11) Clase y objeto**  
> Y ahora viene la gran idea de Java: las clases y los objetos. Piensa en un juego donde eliges una mascota. El juego tiene un molde que dice qué tiene toda mascota: un nombre, y que puede saludar. Ese molde es la clase. Cada mascota que creas a partir del molde es un objeto. Puedes crear todas las que quieras, y cada una guarda sus propios datos. Por ejemplo, Miso y Toby son dos objetos de la misma clase: los dos tienen nombre, pero cada uno tiene el suyo. Para crear un objeto usamos la palabra new.
>
> **(8:11 - 9:57) La primera clase en el código**  
> Vamos a crear nuestra primera mascota. Arriba de la clase Main, debajo del import, escribo class Mascota. Adentro le doy un atributo: String nombre. Y un método saludar que muestre: hola, soy, y su nombre. Este saludar no lleva static, porque pertenece a cada mascota. Ahora en main, antes de cerrar el Scanner, creamos el objeto con new: Mascota miso igual new Mascota. Le ponemos nombre: miso punto nombre igual Miso. Y le pedimos que salude: miso punto saludar. ¿Viste el punto? El punto es como decir «de»: miso punto nombre es el nombre de Miso, y miso punto saludar es pedirle a Miso que salude. Run. Escribo otra vez el apodo y el número en la consola… y al final: ¡hola, soy Miso! Acabas de crear tu primer objeto. Fíjate en un detalle: la clase Mascota empieza con mayúscula y el objeto miso con minúscula. Así se escriben siempre en Java, y te ayuda a distinguirlos de un vistazo. En la próxima lección le vamos a dar muchos más poderes.
>
> **(9:57 - 10:29) Pausa y prueba**  
> ¡Te toca! Pausa el video y haz este reto. Crea un método triplicar. Pídele un número a quien usa el programa y muestra su triple. Y después crea otra mascota con new y haz que salude. Si el programa se queda quieto, no se colgó: está esperando que escribas en la consola. Tómate tu tiempo y, cuando termines, dale play.
>
> **(10:29 - 11:10) Resumen**  
> ¡Muy bien! Repasemos lo que aprendiste hoy. Creaste métodos que reciben parámetros y devuelven resultados con return. Hiciste que tu programa te pregunte cosas con Scanner. Y creaste tu primer objeto a partir de una clase. Si algo no te salió, no pasa nada: el código terminado está en el enlace de la descripción, compáralo con el tuyo. En la próxima lección vas a construir tu proyecto: un simulador de mascotas. ¡Nos vemos ahí!

## 3. Sugerencias multimedia

- **Introducción (0:00), Lámina 19:** Portada de la lección 4.
- **Partes de un método (0:45), Lámina 20:** Lámina «Partes de un método»: el método `duplicar` con etiquetas para el nombre, el parámetro y `return`.
- **Métodos en el código (1:55), editor OnlineGDB, sin lámina:** Se escribe `saludar(String apodo)` y se llama desde `main`. Después se escribe `duplicar(int numero)` con `return`. Anotación: unir con una flecha la llamada y el método.
- **Leer el teclado con Scanner (4:24), Lámina 21:** Lámina «Leer el teclado con Scanner»: `import`, `new Scanner(System.in)`, `nextLine()` y `nextInt()`.
- **Scanner en el código (5:11), editor OnlineGDB, sin lámina:** Se agrega `import java.util.Scanner;`, se crea `teclado` y se piden el apodo y el número. Se pulsa Run y se escribe en la consola. Texto en pantalla: «Escribe en la consola y presiona Enter». Zoom a la consola.
- **Clase y objeto (7:20), Lámina 22:** Lámina de dos columnas: «Clase» y «Objeto».
- **La primera clase en el código (8:11), editor OnlineGDB, sin lámina:** Arriba de `Main` se escribe la clase `Mascota` con el atributo `nombre` y el método `saludar()`. En `main`: `new Mascota()`, `miso.nombre = "Miso"` y `miso.saludar()`. Anotación: resaltar la palabra `new`.
- **Pausa y prueba (9:57), Lámina 23:** Tarjeta de pausa de 5 segundos con cuenta regresiva.
- **Resumen (10:29), Lámina 24:** Lámina de resumen.

## 4. Pregunta para pensar

¿Qué pasa si escribes una palabra cuando el programa pide un número con `nextInt()`?
