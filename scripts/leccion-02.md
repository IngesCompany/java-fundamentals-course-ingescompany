# Lección 2: Variables y tipos de datos

_(Contenido para los instructores)_

**Objetivo:** Al terminar, el estudiante puede crear variables de tipo `int`, `double`, `boolean` y `String`, mostrarlas en pantalla y hacer cálculos con los operadores `+`, `-`, `*`, `/` y `%`.

**Palabras nuevas:** variable, tipo de dato, `int`, `double`, `boolean`, `String`, operador, expresión, concatenar.

## 1. Estructura de carpetas (GitHub)

```text
/starter-files/leccion-02        # Código de inicio de la lección
└── Main.java

/completed-examples/leccion-02   # Código completo de la lección
└── Main.java
```

## 2. Guion del video (8 minutos)

Los tiempos son los del audio (unos 6:46). Con las tarjetas de pausa, los Run y las transiciones de la edición, el video llega a unos 8 minutos. El guion detallado para grabar, con lo que se muestra en cada momento, está en [grabacion/leccion-02.md](grabacion/leccion-02.md).

> **(0:00 - 0:28) Introducción**  
> ¡Hola de nuevo! Bienvenido a la lección dos. Piensa en tu juego favorito: recuerda tu puntaje, tus vidas y tu nombre de jugador. Para recordar cosas, los programas usan variables. Hoy vas a crear las tuyas y a hacer cuentas con ellas. Abre el enlace de la descripción, ¡y vamos!
>
> **(0:28 - 1:07) Partes de una variable**  
> Una variable es como una caja con etiqueta donde guardas un dato. Mira este ejemplo. Primero va el tipo: int, que quiere decir número entero. Después, el nombre de la caja: vidas. Y con el signo igual guardamos un valor adentro: tres. Atención con esto: en programación, el igual no significa «es igual a». Significa «guarda este valor aquí», y se llama asignación. Y como siempre, terminamos con punto y coma.
>
> **(1:07 - 2:01) Tipos de datos**  
> Estos son los cuatro tipos que más vas a usar. int, para números enteros, como tres. double, para números con decimales, como cuatro punto cinco. En Java, el decimal se escribe con punto, no con coma. boolean, que solo puede ser true o false, verdadero o falso, como un interruptor de luz. Y String, para texto, siempre entre comillas. Fíjate que String empieza con mayúscula. ¿Y por qué hay tipos? Para que Java sepa qué puede hacer con cada dato: puedes sumar dos números, pero no puedes multiplicar un nombre. El tipo evita esas confusiones.
>
> **(2:01 - 3:46) Las variables en el código**  
> ¡Al editor! Vamos a describir a una mascota inventada: Miso. Escribe conmigo, y pausa cuando lo necesites. Debajo del comentario uno: String nombre igual Miso, entre comillas. Luego, int edad igual tres. Y double peso igual cuatro punto cinco. Y la última: boolean esJuguetona igual true. Ahora, debajo del comentario dos, las mostramos. Escribo println, entre comillas mi mascota se llama, y después un signo más y la variable nombre. Ese más pega el texto con el valor de la variable, y se llama concatenar. Hago lo mismo con la edad, el peso y si es juguetona. Run… ¡ahí están todos los datos de Miso! Un dato: los nombres de las variables empiezan con minúscula y, si tienen varias palabras, cada palabra nueva va con mayúscula, como esJuguetona.
>
> **(3:46 - 4:24) Operadores aritméticos**  
> Con los números también puedes hacer cuentas: más, menos, por con asterisco, y dividido con la barra. Pero hay dos que sorprenden. Si divides dos números enteros, Java solo te da la parte entera: diecisiete entre cinco da tres, no tres punto cuatro. Y este signo, el de porcentaje, se llama módulo: te da lo que sobra de la división. Diecisiete módulo cinco da dos, porque sobran dos.
>
> **(4:24 - 5:43) Cálculos en el código**  
> Probemos en el editor. Primero, ¿cuántos años tendrá Miso el próximo año? Debajo de la línea de la edad escribo un println con edad más uno, y lo pongo entre paréntesis. Los paréntesis hacen que Java sume primero y después pegue el resultado al texto. Ahora un problema de la vida real. Debajo del comentario tres: tengo diecisiete caramelos y cinco amigos. Diecisiete dividido cinco: a cada uno le tocan tres. Y diecisiete módulo cinco: sobran dos. Run… ¡y Java hace las cuentas por nosotros! Miso tendrá cuatro años, a cada amigo le tocan tres caramelos y sobran dos. Esos dos me los quedo yo.
>
> **(5:43 - 6:15) Pausa y prueba**  
> ¡Te toca! Pausa el video e inventa tu propia mascota: ponle nombre, edad y peso, y di si es juguetona. Muéstrala con println. Y después reparte algo: divide un número entre otro y calcula lo que sobra con módulo. Si sale un error, revisa el tipo de la variable y el punto y coma. Cuando termines, dale play.
>
> **(6:15 - 6:46) Resumen**  
> ¡Muy bien! Hoy aprendiste a crear variables, a elegir su tipo y a hacer cuentas con operadores, incluido el módulo. Si algo no te salió, compara tu programa con el código terminado del enlace de la descripción. En la próxima lección tu programa va a tomar decisiones y a repetir tareas él solito. ¡Nos vemos ahí!

## 3. Sugerencias multimedia

- **Introducción (0:00), Lámina 8:** Portada de la lección 2.
- **Partes de una variable (0:28), Lámina 9:** Lámina con `int vidas = 3;` en grande y tres etiquetas: tipo, nombre y valor.
- **Tipos de datos (1:07), Lámina 10:** Lámina con los cuatro tipos: `int`, `double`, `boolean` y `String`.
- **Las variables en el código (2:01), editor OnlineGDB, sin lámina:** Se escriben las cuatro variables de Miso (`nombre`, `edad`, `peso`, `esJuguetona`) y los `println` que las muestran con `+`. Se pulsa Run. Anotación: subrayar el `+` que une el texto con la variable.
- **Operadores aritméticos (3:46), Lámina 11:** Lámina de operadores: `+`, `-`, `*`, `/` y `%` con un ejemplo cada uno. Anotación: resaltar `/` y `%`.
- **Cálculos en el código (4:24), editor OnlineGDB, sin lámina:** Se agrega `(edad + 1)` en un `println`, y después el reparto de caramelos con `/` y `%`. Se ejecuta. Texto en pantalla: «Usa paréntesis para calcular primero».
- **Pausa y prueba (5:43), Lámina 12:** Tarjeta de pausa de 5 segundos con cuenta regresiva.
- **Resumen (6:15), Lámina 13:** Lámina de resumen.

## 4. Pregunta para pensar

¿Qué muestra `System.out.println("Edad: " + edad + 1);` sin paréntesis? (Pista: el texto se une antes de sumar.)
