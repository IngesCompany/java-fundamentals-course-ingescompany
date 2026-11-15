# Lección 1: ¿Qué es Java y la programación?

_(Contenido para los instructores)_

**Objetivo:** Al terminar, el estudiante puede explicar qué es programar, decir por qué Java es un buen lenguaje para empezar y ejecutar su primer programa en un editor en línea.

**Palabras nuevas:** programa, instrucción, lenguaje de programación, Java, clase, método `main`, consola.

## 1. Estructura de carpetas (GitHub)

```text
/starter-files/leccion-01        # Código de inicio de la lección
└── Main.java

/completed-examples/leccion-01   # Código completo de la lección
└── Main.java
```

## 2. Guion del video (5 minutos)

Los tiempos son los del audio (unos 4:15). Con las tarjetas de pausa, los Run y las transiciones de la edición, el video llega a unos 5 minutos. El guion detallado para grabar, con lo que se muestra en cada momento, está en [grabacion/leccion-01.md](grabacion/leccion-01.md).

> **(0:00 - 0:29) Bienvenida**  
> ¡Hola! Bienvenido al curso Fundamentos de Java. Aquí vas a aprender a programar desde cero, a tu ritmo y sin instalar nada: todo desde tu navegador. Y al final del curso vas a crear tu propio simulador de mascotas. Empecemos con la pregunta más importante: ¿qué es programar?
>
> **(0:29 - 1:13) ¿Qué es programar?**  
> Programar es darle instrucciones a la computadora para que las haga en orden. Pero ojo: la computadora no adivina. Hace exactamente lo que le dices, ni más ni menos. Es como darle a alguien la receta de una torta, paso a paso. Funciona así: primero tú escribes las instrucciones en un lenguaje de programación, como Java. Eso se llama código fuente. Después, Java revisa y traduce tu código: eso es compilar. Y al final, la computadora lo ejecuta.
>
> **(1:13 - 1:40) ¿Por qué Java?**  
> ¿Y por qué aprender Java? Porque está en todas partes: en apps de celular, en videojuegos y en las páginas de bancos y tiendas en línea. Además, Java es ordenado: te pide escribir con cuidado, y eso te deja buenas costumbres para cualquier otro lenguaje que aprendas después.
>
> **(1:40 - 2:18) Tu primer programa**  
> Así se ve un programa en Java. Todo va dentro de una clase, que aquí se llama Main. Adentro está main: es el punto de inicio, lo primero que se ejecuta. Y esta instrucción, System punto out punto println, muestra un mensaje en la consola. Fíjate en el punto y coma del final: en Java, cada instrucción termina con uno. Es como el punto final de una oración.
>
> **(2:18 - 3:25) Probándolo en OnlineGDB**  
> ¡Ahora te toca programar conmigo! Esto es OnlineGDB, un editor gratis que funciona en el navegador. El enlace está en la descripción del video. Dentro de main, donde dice escribe aquí tu primer mensaje, escribo System punto out punto println, abro paréntesis, comillas, hola mundo, cierro comillas, cierro paréntesis y punto y coma. Pulso Run y… ¡mira abajo, en la consola! Ahí está el mensaje. ¡Felicidades, ese es tu primer programa! Agreguemos otra línea: estoy aprendiendo Java. Run otra vez, y ahora salen las dos, en el mismo orden en que las escribí.
>
> **(3:25 - 3:49) Pausa y prueba**  
> ¡Tu turno! Pausa el video, abre el enlace de la descripción y escribe tu propio mensaje. Si sale un error, no te asustes: revisa las comillas y el punto y coma. No puedes romper nada, es solo para practicar. Cuando termines, dale play.
>
> **(3:49 - 4:15) Resumen**  
> ¡Excelente! Repasemos. Programar es escribir instrucciones para la computadora. Java es un lenguaje muy usado en todo el mundo. Y ya escribiste tu primer programa con println. En la próxima lección vas a enseñarle a tu programa a recordar cosas, con variables. ¡Nos vemos ahí!

## 3. Sugerencias multimedia

- **Bienvenida (0:00), Lámina 1 (portada del curso) y Lámina 2:** Portada del curso y portada de la lección 1.
- **¿Qué es programar? (0:29), Lámina 3:** Lámina con el ciclo de tres pasos: escribes el código, se compila y se ejecuta. Al editar se resalta cada paso cuando se nombra.
- **¿Por qué Java? (1:13), Lámina 4:** Lámina con tres columnas: aplicaciones, juegos y servidores.
- **Tu primer programa (1:40), Lámina 5:** Lámina «Tu primer programa» con el código y tres etiquetas: la clase, el método `main` y `println`. Anotación: flechas a `class Main`, `main` y `System.out.println`.
- **Probándolo en OnlineGDB (2:18), editor OnlineGDB, sin lámina:** OnlineGDB con el código de inicio. Se escribe `System.out.println("¡Hola, mundo!");`, se pulsa Run y el mensaje aparece en la consola. Después se agrega una segunda línea y se ejecuta otra vez. Texto en pantalla: «Run = ejecutar». Zoom a la consola.
- **Pausa y prueba (3:25), Lámina 6:** Tarjeta de pausa de 5 segundos con cuenta regresiva.
- **Resumen (3:49), Lámina 7:** Lámina de resumen.

## 4. Pregunta para pensar

¿Qué pasa si cambias el orden de las dos líneas de `println`?
