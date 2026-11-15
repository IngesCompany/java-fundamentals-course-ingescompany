# Lección 6: Consejos y próximos pasos

_(Contenido para los instructores)_

**Objetivo:** Al terminar, el estudiante puede reconocer los errores más comunes de Java, distinguir un error de compilación de uno de ejecución, leer el mensaje de error para encontrarlo, y sabe cómo seguir aprendiendo.

**Palabras nuevas:** error de compilación, error de ejecución, mensaje de error, depurar (encontrar y corregir errores), buenas prácticas.

## 1. Estructura de carpetas (GitHub)

```text
/starter-files/leccion-06        # Código de inicio de la lección
└── Main.java

/completed-examples/leccion-06   # Código completo de la lección
├── Main.java
└── README.md
```

## 2. Guion del video (10 minutos)

Los tiempos son los del audio (unos 8:53). Con las tarjetas de pausa, los Run y las transiciones de la edición, el video llega a unos 10 minutos. El guion detallado para grabar, con lo que se muestra en cada momento, está en [grabacion/leccion-06.md](grabacion/leccion-06.md).

> **(0:00 - 0:31) Introducción**  
> ¡Hola! Bienvenido a la última lección del curso. Ya sabes programar en Java. Hoy vas a aprender algo que hacen todos los días quienes programan, incluso con años de experiencia: encontrar y corregir errores. Equivocarse es parte de programar. Lo importante es aprender a leer lo que Java te dice. ¡Vamos a convertirnos en cazadores de errores!
>
> **(0:31 - 1:16) Los 5 errores más comunes**  
> Estos cinco errores le pasan a todo el mundo. Olvidar el punto y coma. No cerrar las comillas de un texto. Escribir string con minúscula. Usar un solo igual para comparar. Y usar un índice que no existe en un arreglo. Si alguna vez te pasó alguno, tranquilo: estás en buena compañía. Hasta los programadores de los juegos que más te gustan se equivocan en estas cosas todos los días; la diferencia es que saben encontrarlas rápido. Hoy los vamos a cazar uno por uno.
>
> **(1:16 - 2:15) Dos tipos de errores**  
> Primero, hay dos tipos de errores. Los errores de compilación aparecen antes de que el programa se ejecute. Java revisa tu código y, si hay algo que no entiende, te dice qué es y en qué línea. El programa ni siquiera arranca. Los errores de ejecución son más tramposos: el programa sí arranca, pero en medio de la ejecución algo sale mal, como usar un índice que no existe. Ahí Java se detiene y lanza lo que se llama una excepción. Es como una receta: un error de compilación es una receta mal escrita, que no se entiende. Un error de ejecución es una receta bien escrita que te pide un ingrediente que no tienes.
>
> **(2:15 - 3:05) El programa con errores**  
> Te presento un programa con cinco errores escondidos. Lo tienes en el enlace de la descripción. Pulso Run y… el programa no compila. Fíjate en los mensajes de abajo. Cada uno dice el número de línea y qué esperaba Java. Los mensajes están en inglés, pero no te asustes: expected significa esperado, y error, bueno, ya sabes. Con unas pocas palabras vas a entender casi todos. Antes de que yo los corrija, te reto a encontrarlos tú.
>
> **(3:05 - 3:25) Pausa: encuentra los errores**  
> Pausa el video, abre el programa de la descripción y trata de encontrar los cinco errores. Pista: empieza por el primer mensaje y mira el número de línea. Cuando termines, dale play y los vemos juntos.
>
> **(3:25 - 4:33) Primera ronda: errores de compilación**  
> ¿Cuántos encontraste? Vamos juntos. Un consejo: corrige siempre empezando por el primer mensaje, porque a veces un error causa otros más abajo. El primer mensaje dice que en la línea cinco se espera un punto y coma. Voy a la línea cinco… y es cierto, falta. Lo agrego. El segundo mensaje habla de un texto sin cerrar en la línea trece. Voy a la línea trece: falta la comilla del final. La agrego. Run… y aparecen errores nuevos. ¡No pasa nada, es normal! Java revisa tu código por partes: cuando arreglas unos errores, recién puede ver los siguientes.
>
> **(4:33 - 5:43) Segunda ronda: tipos y comparaciones**  
> Segunda ronda. En la línea cuatro, el mensaje dice cannot find symbol: no encuentro este nombre. Java no encuentra un tipo llamado string. Es porque está en minúscula. En Java las mayúsculas importan, así que lo escribo con S mayúscula. En la línea seis, dentro del if hay un solo igual. Pero un solo igual guarda un valor, y aquí queremos comparar. Necesitamos doble igual. Por eso el mensaje dice incompatible types: Java esperaba un verdadero o falso, y le dimos un número. Run… ¡ahora sí compila y se ejecuta! Muestra el puntaje perfecto y los niveles. Pero mira el final: se detiene con otro error.
>
> **(5:43 - 6:40) Tercera ronda: un error de ejecución**  
> Este es un error de ejecución: el programa sí empezó, mostró algunos niveles y se detuvo. Leamos el mensaje con calma. Dice que el índice tres está fuera de un arreglo de largo tres. ¡Claro! Un arreglo de tres elementos tiene los índices cero, uno y dos. No existe el índice tres. El problema está en el for: usa menor o igual, así que intenta llegar hasta el tres. Lo cambio por menor. Run… ¡el programa termina bien! ¡Cinco errores cazados! Ya lees mensajes de error como alguien con experiencia.
>
> **(6:40 - 7:30) Buenas prácticas**  
> Ahora, tres costumbres que te van a ahorrar muchos errores. Primero, usa nombres claros: energía dice mucho más que una e sola. Segundo, ordena tu código con sangría, para ver dónde empieza y dónde termina cada bloque. Y tercero, prueba seguido. Escribe un poco, ejecuta, revisa y sigue. Así, si aparece un error, sabes que está en lo último que escribiste. Y un extra: si un error no sale, explícale tu código en voz alta a alguien, o hasta a un peluche. Muchas veces el error aparece mientras lo explicas.
>
> **(7:30 - 8:18) ¿Y ahora qué?**  
> ¿Y ahora qué sigue? Puedes explorar la documentación oficial de Java, de Oracle. Está en inglés y tiene ejemplos de todo; el enlace está en la descripción. Haz otro proyecto, como un registro de estudiantes o un juego de adivinanzas. Busca retos de práctica en línea. Y lo más importante: practica un poco cada día. Veinte minutos diarios valen más que cuatro horas un solo día. Y si olvidas algo, vuelve a ver la lección que necesites: este curso siempre va a estar aquí.
>
> **(8:18 - 8:53) Cierre**  
> ¡Lo lograste! Terminaste el curso. Cuando empezaste, no sabías qué era programar. Y ahora creaste tu propio simulador de mascotas, con clases y objetos, y sabes cazar errores. Comparte lo que hiciste con tu familia y tus amigos, pero sin publicar datos personales. Ojalá este sea solo el comienzo. Gracias por programar con nosotros. ¡Y sigue programando!

## 3. Sugerencias multimedia

- **Introducción (0:00), Lámina 32:** Portada de la lección 6.
- **Los 5 errores más comunes (0:31), Lámina 33:** Lámina con los 5 errores más comunes.
- **Dos tipos de errores (1:16), Lámina 34:** Lámina de dos columnas: «Error de compilación» y «Error de ejecución».
- **El programa con errores (2:15), editor OnlineGDB, sin lámina:** El programa con errores. Se pulsa Run y aparecen los dos primeros mensajes de error. Anotación: marcar el número de línea en cada mensaje.
- **Pausa: encuentra los errores (3:05), Lámina 35:** Tarjeta de pausa de 5 segundos con cuenta regresiva.
- **Primera ronda: errores de compilación (3:25), editor OnlineGDB, sin lámina:** Se agrega el `;` en la línea 5 y se cierran las comillas en la línea 13. Run: aparecen dos errores nuevos. Texto en pantalla: «Error 1: falta `;`» · «Error 2: comillas sin cerrar».
- **Segunda ronda: tipos y comparaciones (4:33), editor OnlineGDB, sin lámina:** `string` pasa a `String` y `=` pasa a `==`. Run: el programa compila, muestra unos niveles y se detiene con un error. Texto en pantalla: «Error 3: `String` con mayúscula» · «Error 4: `==` para comparar».
- **Tercera ronda: un error de ejecución (5:43), editor OnlineGDB, sin lámina:** Se lee `ArrayIndexOutOfBoundsException`, se cambia `<=` por `<` y se ejecuta sin errores. Texto en pantalla: «Error 5: índice fuera del arreglo».
- **Buenas prácticas (6:40), Lámina 36:** Lámina «Buenas prácticas» con tres consejos.
- **¿Y ahora qué? (7:30), Lámina 37:** Lámina «¿Y ahora qué?» con cuatro ideas.
- **Cierre (8:18), Lámina 38:** Lámina final con un mensaje de cierre.
