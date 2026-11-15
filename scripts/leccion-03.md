# Lección 3: Estructuras de control: decisiones y bucles

_(Contenido para los instructores)_

**Objetivo:** Al terminar, el estudiante puede hacer que un programa decida con `if-else` y repita instrucciones con `for` y con `while`.

**Palabras nuevas:** condición, `if`, `else`, operador de comparación, bucle, `for`, `while`, contador, bucle infinito.

## 1. Estructura de carpetas (GitHub)

```text
/starter-files/leccion-03        # Código de inicio de la lección
└── Main.java

/completed-examples/leccion-03   # Código completo de la lección
└── Main.java
```

## 2. Guion del video (10 minutos)

Los tiempos son los del audio (unos 8:44). Con las tarjetas de pausa, los Run y las transiciones de la edición, el video llega a unos 10 minutos. El guion detallado para grabar, con lo que se muestra en cada momento, está en [grabacion/leccion-03.md](grabacion/leccion-03.md).

> **(0:00 - 0:30) Introducción**  
> ¡Hola! Bienvenido a la lección tres. Hasta ahora tus programas hacen siempre lo mismo, línea por línea, como un robot. Hoy les vas a dar un poco de inteligencia: van a tomar decisiones y van a repetir tareas sin que tengas que escribir lo mismo muchas veces. Abre el enlace de la descripción, ¡y empecemos!
>
> **(0:30 - 1:30) Decidir con if-else**  
> Piensa en un videojuego: si juntas cien puntos, subes de nivel. Si no, sigues jugando. Eso, en Java, es un if else. If significa si, y else significa si no. Entre paréntesis va la condición: una pregunta que solo se responde con verdadero o falso. Para preguntar usamos comparaciones: mayor, menor, mayor o igual, menor o igual, doble igual para igual, y signo de exclamación igual para diferente. Y recuerda: un solo igual guarda un valor, dos iguales comparan. Y si tienes más de dos caminos, como un semáforo con verde, amarillo y rojo, puedes encadenar varias condiciones con else if. Lo vas a usar en tu proyecto.
>
> **(1:30 - 3:24) El if-else en el código**  
> ¡Al editor! Debajo del comentario uno, creo la variable int puntos igual ciento veinte. Ahora la decisión: if, y entre paréntesis, puntos mayor o igual que cien. Abro llaves, y adentro un println que diga subiste de nivel. Cierro la llave y escribo else, que es el si no. Abro llaves, y adentro: sigue jugando. Run… ¡subiste de nivel! Ahora cambio los puntos a ochenta y vuelvo a ejecutar. Sigue jugando. El mismo programa tomó decisiones distintas según los puntos. Pregunta rápida: ¿y si tengo exactamente cien? Lo pruebo. ¡Subí de nivel! Porque usamos mayor o igual: cien también cuenta. Un dato: lo que va dentro de las llaves se escribe un poco más a la derecha. Se llama sangría, y te ayuda a ver qué parte pertenece al if y cuál al else. Ahora vuelvo a dejar ciento veinte.
>
> **(3:24 - 4:13) Repetir con for y while**  
> Ahora, repetir. Una parte del código que se repite se llama bucle, y Java tiene dos principales. Usa for cuando sabes cuántas veces quieres repetir algo, por ejemplo, dar cinco vueltas a una pista. Y usa while cuando quieres repetir mientras algo se cumpla, por ejemplo, seguir corriendo mientras te quede energía. Un truco para elegir: si en un juego te dicen «da tres saltos», eso es un for, porque sabes cuántos son. Si te dicen «salta mientras presiones el botón», eso es un while, porque no sabes cuándo vas a soltarlo.
>
> **(4:13 - 5:33) El for en el código**  
> Volvamos al editor con el for, debajo del comentario dos. El for tiene tres partes, separadas por punto y coma. Primera: dónde empieza el contador. int vuelta igual uno. Segunda: hasta cuándo repetir. Mientras vuelta sea menor o igual que cinco. Tercera: cómo avanza. vuelta más más, que le suma uno en cada vuelta. Adentro, un println que diga vuelta número, más la variable vuelta. Run… ¡cinco vueltas! Y escribimos el println una sola vez. Imagina si fueran cien vueltas: solo cambias el cinco por cien. Un dato: vuelta más más es una forma corta de escribir vuelta igual vuelta más uno. Los programadores la usan muchísimo, así que la vas a ver en todas partes.
>
> **(5:33 - 7:20) El while en el código**  
> Ahora el while. Fíjate en la diferencia: aquí no decimos cuántas veces repetir, sino hasta cuándo. Debajo del comentario tres, creo int energía igual tres. While, y entre paréntesis, energía mayor que cero. Adentro muestro la energía, y en la siguiente línea le resto uno con energía menos menos. Y después del while, fuera de las llaves, un println que diga a descansar. Por cierto, energía menos menos es lo mismo que energía igual energía menos uno: el hermano del más más que vimos en el for. Run… tres, dos, uno, ¡a descansar! Mucho cuidado con esto: si me olvido de restar, la energía nunca llega a cero, la condición se cumple para siempre y el programa no termina nunca. Eso se llama bucle infinito. Si te pasa, no te preocupes: detén el programa con el botón de stop y revisa que el contador cambie. Por eso, cada vez que escribas un while, pregúntate: ¿qué hace que esto termine?
>
> **(7:20 - 8:00) Pausa y prueba**  
> ¡Te toca experimentar! Pausa el video y prueba esto. Cambia los puntos y mira qué decide tu programa. Haz que el for cuente hasta diez. Y empieza el while con más energía. Antes de darle Run, adivina qué va a salir. Después comprueba si tenías razón. Adivinar primero es un súper hábito de programador: te obliga a pensar cómo funciona tu código, y cuando te equivocas, aprendes el doble. Cuando termines, dale play.
>
> **(8:00 - 8:44) Resumen**  
> ¡Genial! Hoy tu programa aprendió a decidir con if else y a repetir con for y con while. Con estas dos herramientas ya puedes hacer muchísimo: casi todos los juegos repiten algo y toman decisiones todo el tiempo. Si algo no te salió, compara tu programa con el código terminado del enlace de la descripción. En la próxima lección vas a crear tus propios métodos, a hacer que tu programa te pregunte cosas y a conocer las clases. ¡Nos vemos ahí!

## 3. Sugerencias multimedia

- **Introducción (0:00), Lámina 14:** Portada de la lección 3.
- **Decidir con if-else (0:30), Lámina 15:** Lámina «Decidir con if-else»: el código del ejemplo y una tarjeta con los operadores para comparar.
- **El if-else en el código (1:30), editor OnlineGDB, sin lámina:** Se escribe el `if-else` de los puntos. Se crea `int puntos = 120;`, se ejecuta y después se prueba con 80 y con 100. Anotación: resaltar la condición `puntos >= 100`.
- **Repetir con for y while (3:24), Lámina 16:** Lámina de dos columnas: `for` y `while`.
- **El for en el código (4:13), editor OnlineGDB, sin lámina:** Se escribe el `for` de las 5 vueltas. Se ejecuta. Anotación: numerar las tres partes del `for`: inicio, condición y paso.
- **El while en el código (5:33), editor OnlineGDB, sin lámina:** Se escribe el `while` de la energía con `energia--`. Se ejecuta. Texto en pantalla: «Sin `energia--` el bucle no termina nunca».
- **Pausa y prueba (7:20), Lámina 17:** Tarjeta de pausa de 5 segundos con cuenta regresiva.
- **Resumen (8:00), Lámina 18:** Lámina de resumen.

## 4. Pregunta para pensar

¿Cuántas veces se repite `for (int vuelta = 1; vuelta < 5; vuelta++)`? ¿Y con `<=`?
