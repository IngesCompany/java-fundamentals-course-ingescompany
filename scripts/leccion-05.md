# Lección 5: Fundamentos de POO y tu proyecto: el simulador de mascotas

_(Contenido para los instructores)_

**Objetivo:** Al terminar, el estudiante puede escribir una clase con atributos privados, constructor, getters y setters, guardar varios objetos en un arreglo y combinar todo lo aprendido en un programa pequeño: un simulador de mascotas.

**Palabras nuevas:** atributo, constructor, `this`, encapsulamiento, `private`, `public`, getter, setter, arreglo, índice, `length`.

## 1. Estructura de carpetas (GitHub)

```text
/starter-files/leccion-05        # Código de inicio de la lección
└── Main.java

/completed-examples/leccion-05   # Código completo de la lección
└── Main.java
```

## 2. Guion del video (15 minutos)

Los tiempos son los del audio (unos 13:43). Con las tarjetas de pausa, los Run y las transiciones de la edición, el video llega a unos 15 minutos. El guion detallado para grabar, con lo que se muestra en cada momento, está en [grabacion/leccion-05.md](grabacion/leccion-05.md).

> **(0:00 - 0:45) Introducción: el simulador terminado**  
> ¡Hola! Bienvenido a la lección cinco, la más emocionante del curso. Hoy construyes tu proyecto: un simulador de mascotas. Eliges una mascota y la cuidas: le das de comer, juegas con ella y miras cómo está. Mira cómo funciona el simulador terminado. Para lograrlo vas a usar todo lo que aprendiste, más tres ideas nuevas de la programación orientada a objetos. Abre el enlace de la descripción, ¡y a programar!
>
> **(0:45 - 1:42) Una clase por dentro**  
> Primero, veamos una clase por dentro. ¿Te acuerdas de la lección anterior? La clase es el molde, y cada objeto es una mascota hecha con ese molde. Ahora vamos a ver el molde completo. Tiene tres partes. Los atributos son los datos que guarda cada objeto: en nuestra mascota, su nombre, su energía y su felicidad. El constructor es un método especial que se ejecuta cuando creas el objeto con new. Su trabajo es darle sus valores iniciales, como cuando creas un personaje y empieza con la vida llena. Y los métodos son lo que el objeto sabe hacer: comer, jugar y mostrar su estado.
>
> **(1:42 - 3:42) La clase Mascota en el código**  
> ¡Al editor! Debajo del comentario uno, dentro de la clase Mascota, escribo los atributos. private String nombre. private int energía. private int felicidad. Ya te explico qué es private en un momento. Fíjate que energía y felicidad son int: números enteros del cero al cien, como una barra de vida. Ahora el constructor, debajo del comentario dos. Se llama igual que la clase, Mascota, y recibe el nombre entre paréntesis. Adentro escribo this punto nombre igual nombre. ¿Qué es this? Significa este objeto. Así que this punto nombre es el nombre de esta mascota, y ahí le guardo el nombre que recibí. Y la energía y la felicidad empiezan en cincuenta. Listo: cada mascota que nazca va a tener su nombre y empezará con cincuenta de energía y cincuenta de felicidad. Un dato: el constructor no lleva tipo de retorno, ni siquiera void. Así Java sabe que es el constructor. Y cuando escribamos new Mascota con un nombre entre paréntesis, es justo este constructor el que se va a ejecutar.
>
> **(3:42 - 4:32) Encapsulamiento**  
> ¿Por qué escribimos private? Por algo que se llama encapsulamiento. Private significa que esos atributos solo se pueden usar dentro de la clase. Nadie de afuera puede cambiar la energía a mil por error, o hacer trampa. Imagina un juego donde cualquiera pudiera ponerse un millón de vidas: se acabaría la diversión. Entonces, ¿cómo los leemos desde afuera? Con métodos que se llaman getters, que solo devuelven el valor. Y para cambiarlos usamos setters, que primero revisan que el valor tenga sentido y recién ahí lo guardan. Es como un guardia en la puerta.
>
> **(4:32 - 6:58) Getters, setters y métodos en el código**  
> De vuelta al editor, debajo del comentario tres. Un dato: los getters y setters se nombran con get o set y el nombre del atributo con mayúscula: getNombre, setNombre. Así cualquiera sabe para qué sirven. Primero los getters. public String getNombre, que devuelve el nombre. Y public int getEnergía, que devuelve la energía. Ahora el setter: public void setNombre, que recibe un nombre nuevo. Adentro uso un if: si el nombre nuevo está vacío, aviso que el nombre no puede estar vacío. Si no, lo guardo. Ese if es el guardia del que te hablé. Ahora, lo que la mascota sabe hacer. El método comer le suma veinte de energía. Pero no queremos que pase de cien, así que uso Math punto min de cien y la energía más veinte. Math punto min elige el número más chico de los dos, y así nunca pasa de cien. Después, jugar. Si la energía es menor que diez, la mascota está muy cansada y no puede jugar. Si no, gasta diez de energía y sube quince de felicidad, también con tope de cien. Y por último, mostrarEstado, que imprime el nombre, la energía y la felicidad. Fíjate que comer y jugar también muestran un mensaje, para que sepas qué pasó. ¡Nuestra clase Mascota está completa!
>
> **(6:58 - 7:39) Arreglos de objetos**  
> Ahora, ¿cómo guardamos varias mascotas juntas? Con un arreglo. Un arreglo es como una fila de casilleros, y en cada casillero guardas un elemento del mismo tipo. Cada casillero tiene un número, que se llama índice. Y aquí viene algo muy importante: en Java, el primer índice es cero, no uno. Con tres mascotas, los índices son cero, uno y dos. Y para saber cuántos casilleros tiene el arreglo usamos length, que aquí vale tres.
>
> **(7:39 - 9:16) El arreglo en el código**  
> Vamos a main, debajo del comentario cuatro. Creo el arreglo: Mascota, corchetes, mascotas igual, y entre llaves tres mascotas nuevas, cada una con new: Miso, Toby y Luna. Ahora las mostramos con un for. El contador i empieza en cero, y repetimos mientras i sea menor que mascotas punto length. Adentro guardo el nombre de cada una con mascotas, corchete i, punto getNombre. Y muestro su número, su nombre en mayúsculas con toUpperCase, y cuántas letras tiene con length. ¿Viste? Los textos también tienen sus propios métodos. Y ojo: toUpperCase no cambia el nombre guardado, solo lo muestra en mayúsculas. Otro detalle curioso: en el arreglo escribimos length sin paréntesis, y en el texto, length con paréntesis. Así es Java; con la práctica te sale solo. Run… ¡ahí está la lista de mascotas! Cero, Miso; uno, Toby; y dos, Luna.
>
> **(9:16 - 9:59) Cómo funciona el simulador**  
> Así funciona el simulador. Primero eliges una mascota. Después eliges una acción: comer, jugar o ver su estado. Ves el resultado, y vuelves a elegir. Eso se repite una y otra vez, hasta que escribas cero para salir. En código, eso es un while con un menú adentro. ¡Y ya sabes hacer todas esas partes! Un consejo de programador: antes de escribir código, piensa el ciclo así, con flechas, incluso en un papel. Te ahorra muchos errores.
>
> **(9:59 - 12:10) El menú del simulador**  
> Último paso, en el editor. Después del for, le pido al usuario que elija una mascota escribiendo cero, uno o dos. La leo con teclado punto nextInt, y guardo esa mascota en una variable llamada elegida. Ahora el menú. Creo int opción igual menos uno. ¿Por qué menos uno? Porque si empezara en cero, el while ni siquiera entraría, y el menú nunca aparecería. While opción sea diferente de cero: muestro el menú, uno comer, dos jugar, tres ver estado, cero salir, y leo la opción. Con if y else if, el que vimos en la lección tres para varios caminos: si es uno, elegida punto comer. Si es dos, jugar. Si es tres, mostrarEstado. Y al salir del while, me despido con el nombre de la mascota y cierro el teclado. ¡Momento de la verdad! Run. Elijo a Toby, el uno. Juego con él… otra vez… otra vez… hasta que dice que no tiene energía para jugar. Pobre Toby. Le doy de comer, miro su estado… y salgo con cero. ¡Tu simulador de mascotas funciona! Pruébalo tú también con Miso o con Luna: cada una guarda su propia energía y su propia felicidad.
>
> **(12:10 - 12:54) Pausa y prueba**  
> ¡Ahora el proyecto es tuyo! Pausa el video y mejóralo. Agrega una cuarta mascota al arreglo. Crea un método nuevo, por ejemplo dormir, que le recupere energía. Y súmalo al menú con la opción cuatro. Si algo falla, lee el mensaje de error: te dice en qué línea está el problema. Y si quieres un reto extra, haz que la felicidad baje un poco cada vez que la mascota come, como en los juegos de verdad. Cuando termines, dale play.
>
> **(12:54 - 13:43) Resumen**  
> ¡Increíble trabajo! Repasemos todo lo que lograste hoy. Construiste una clase completa con atributos privados, un constructor, getters y setters. Guardaste objetos en un arreglo. Y juntaste todo en tu propio simulador de mascotas. Eso es programación orientada a objetos de verdad, la misma idea que se usa en apps y videojuegos profesionales. Si algo no te salió, compara tu programa con el código terminado del enlace de la descripción. En la última lección vas a aprender a encontrar y corregir errores como alguien con experiencia. ¡Nos vemos ahí!

## 3. Sugerencias multimedia

- **Introducción: el simulador terminado (0:00), Lámina 25:** Portada de la lección 5 y, después, el simulador terminado funcionando en la consola.
- **Una clase por dentro (0:45), Lámina 26:** Lámina «Una clase por dentro»: la clase `Mascota` con etiquetas para los atributos, el constructor y los métodos.
- **La clase Mascota en el código (1:42), editor OnlineGDB, sin lámina:** Se escribe la clase `Mascota` con los tres atributos `private` y el constructor con `this`. Anotación: resaltar `this.nombre = nombre`.
- **Encapsulamiento (3:42), Lámina 27:** Lámina «Encapsulamiento»: el código con `private`, un getter y un setter, y qué hace cada uno.
- **Getters, setters y métodos en el código (4:32), editor OnlineGDB, sin lámina:** Se escriben `getNombre()`, `getEnergia()`, `setNombre(...)` con su regla, y los métodos `comer()`, `jugar()` y `mostrarEstado()`. Texto en pantalla: «`Math.min(100, ...)` no deja pasar de 100».
- **Arreglos de objetos (6:58), Lámina 28:** Lámina «Arreglos de objetos»: tres casillas con los índices 0, 1 y 2, con una mascota en cada una.
- **El arreglo en el código (7:39), editor OnlineGDB, sin lámina:** En `main` se crea el arreglo con Miso, Toby y Luna, y un `for` muestra cada nombre con `toUpperCase()` y `length()`. Se ejecuta. Anotación: señalar `mascotas[i]`.
- **Cómo funciona el simulador (9:16), Lámina 29:** Lámina con el ciclo del simulador: elegir mascota, elegir acción y ver el resultado.
- **El menú del simulador (9:59), editor OnlineGDB, sin lámina:** Se escribe la elección con `teclado.nextInt()`, el `while (opcion != 0)` y los `if` del menú. Se ejecuta: se elige a Toby, se juega varias veces hasta que no tiene energía, se le da de comer y se ve su estado. Texto en pantalla: «Escribe un número de la lista».
- **Pausa y prueba (12:10), Lámina 30:** Tarjeta de pausa de 5 segundos con cuenta regresiva.
- **Resumen (12:54), Lámina 31:** Lámina de resumen.

## 4. Pregunta para pensar

¿Qué pasa si en el menú eliges la mascota 5? ¿Cómo lo evitarías con un `if`?
