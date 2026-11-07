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

> **(0:00 - 0:30) Introducción**  
> Hasta ahora, tus programas hacen siempre lo mismo, línea por línea. Hoy vas a darles inteligencia: van a tomar decisiones y a repetir tareas sin que escribas lo mismo muchas veces.
>
> **(0:30 - 1:50) Decidir con if-else**  
> En un videojuego, si juntas 100 puntos, subes de nivel; si no, sigues jugando. Eso es un if-else. Entre paréntesis va la condición, una pregunta que solo puede responderse con verdadero o falso. Para comparar usamos mayor, menor, mayor o igual, menor o igual, y doble igual para preguntar si dos cosas son iguales. Recuerda: un solo igual asigna, dos iguales comparan.
>
> **(1:50 - 3:30) El if-else en el código**  
> Creo la variable puntos con 120. Si puntos es mayor o igual que 100, muestra subiste de nivel; si no, sigue jugando. Run: subí de nivel. Ahora cambio puntos a 80 y vuelvo a ejecutar: sigue jugando. El mismo programa tomó decisiones distintas.
>
> **(3:30 - 4:30) Repetir con for y while**  
> Para repetir hay dos bucles principales. Usa for cuando sabes cuántas veces quieres repetir, por ejemplo, 5 vueltas a una pista. Usa while cuando quieres repetir mientras algo se cumpla, por ejemplo, mientras te quede energía.
>
> **(4:30 - 6:20) El for en el código**  
> El for tiene tres partes. Primero, dónde empieza el contador: vuelta igual 1. Segundo, hasta cuándo repetir: mientras vuelta sea menor o igual que 5. Tercero, cómo avanza: vuelta más más, que suma uno. Run: cinco vueltas, sin copiar cinco veces la misma línea.
>
> **(6:20 - 8:10) El while en el código**  
> Ahora el while. Mientras la energía sea mayor que cero, muestro la energía y le resto uno con energía menos menos. Run: 3, 2, 1, y a descansar. Cuidado: si olvido restar, la condición se cumple para siempre y el programa no termina. Eso se llama bucle infinito; si te pasa, detén el programa y revisa el paso.
>
> **(8:10 - 9:20) Pausa y prueba**  
> Tu turno. Pausa el video y experimenta: cambia los puntos, haz que el for cuente hasta 10 y empieza el while con más energía. Antes de ejecutar, adivina qué va a salir; después comprueba si tenías razón. Cuando termines, sigue con el video.
>
> **(9:20 - 10:00) Resumen**  
> Hoy tu programa aprendió a decidir con if-else y a repetir con for y con while. En la próxima lección vas a crear tus propios métodos, a leer lo que escribe el usuario y a conocer las clases.

## 3. Sugerencias multimedia

- **Introducción (0:00), Lámina 14:** Portada de la lección 3. Texto en pantalla: «Lección 3 · Decisiones y bucles»
- **Decidir con if-else (0:30), Lámina 15:** Lámina «Decidir con if-else»: el código del ejemplo y una tarjeta con los operadores para comparar. Texto en pantalla: «Comparar: `>` `<` `>=` `<=` `==` `!=`».
- **El if-else en el código (1:50), editor OnlineGDB, sin lámina:** Se escribe el `if-else` de los puntos. Se ejecuta con 120 y después con 80. Anotación: resaltar la condición `puntos >= 100`.
- **Repetir con for y while (3:30), Lámina 16:** Lámina de dos columnas: `for` y `while`. Texto en pantalla: «`for`: repite un número de veces que ya conoces» · «`while`: repite mientras una condición sea verdadera».
- **El for en el código (4:30), editor OnlineGDB, sin lámina:** Se escribe el `for` de las 5 vueltas. Se ejecuta. Anotación: numerar las tres partes del `for`: inicio, condición y paso.
- **El while en el código (6:20), editor OnlineGDB, sin lámina:** Se escribe el `while` de la energía con `energia--`. Se ejecuta. Texto en pantalla: «Sin `energia--` el bucle no termina nunca».
- **Pausa y prueba (8:10), Lámina 17:** Tarjeta de pausa de 5 segundos con cuenta regresiva. Texto en pantalla: «Pausa el video y prueba» · «Tómate el tiempo que necesites»: «Cambia los puntos y mira qué decide», «Haz que el `for` cuente hasta 10», «Empieza el `while` con más energía».
- **Resumen (9:20), Lámina 18:** Lámina de resumen. Texto en pantalla: «`if-else` decide» · «`for` repite un número de veces» · «`while` repite mientras se cumpla».

## 4. Pregunta para pensar

¿Cuántas veces se repite `for (int vuelta = 1; vuelta < 5; vuelta++)`? ¿Y con `<=`?
