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

> **(0:00 - 0:30) Introducción**  
> Los programas necesitan recordar cosas: un puntaje, un nombre, una edad. Para eso están las variables. Hoy vas a crear las tuyas y a hacer cálculos con ellas.
>
> **(0:30 - 1:40) Partes de una variable**  
> Una variable es un espacio de memoria con nombre, donde se guarda un dato. Primero declaras su tipo: int, que es un número entero. Luego le pones un nombre: vidas. Y con el signo igual le asignas un valor: tres. Ojo: en programación, el igual es el operador de asignación: no significa “es igual a”. Y no olvides el punto y coma.
>
> **(1:40 - 2:40) Tipos de datos**  
> Estos son los tipos que más vas a usar. int para números enteros, como 3. double para números con decimales, como 4.5; en Java el decimal se escribe con punto. boolean solo puede ser true o false, verdadero o falso. Y String guarda texto entre comillas. Fíjate que String empieza con mayúscula.
>
> **(2:40 - 4:10) Las variables en el código**  
> Vamos a describir a una mascota. String nombre igual Miso, int edad igual 3, double peso igual 4.5, y boolean esJuguetona igual true. Para mostrarlas uso println y el signo más, que une el texto con el valor de la variable: a eso se le llama concatenar. Run. ¡Ahí están los datos de Miso!
>
> **(4:10 - 5:10) Operadores aritméticos**  
> Con los números puedes hacer cuentas usando operadores: más, menos, por y dividido. Hay dos que sorprenden. Si divides dos enteros, Java da solo el cociente entero: 17 entre 5 da 3. Y el signo de porcentaje es el operador módulo, que da el residuo: 17 módulo 5 da 2.
>
> **(5:10 - 6:40) Cálculos en el código**  
> Probemos. El próximo año, Miso tendrá edad más uno; lo escribo entre paréntesis para que Java haga la suma antes de unir el texto. Ahora un problema: tengo 17 caramelos y 5 amigos. 17 dividido 5: a cada uno le tocan 3. Y 17 módulo 5: sobran 2. Run, y Java hace las cuentas por nosotros.
>
> **(6:40 - 7:20) Pausa y prueba**  
> Tu turno. Pausa el video e inventa tu propia mascota: dale nombre, edad, peso y di si es juguetona. Muéstrala con println y después divide un número entre otro y calcula el residuo con módulo. Si sale un error, revisa el tipo y el punto y coma. Cuando termines, sigue con el video.
>
> **(7:20 - 8:00) Resumen**  
> Hoy aprendiste a crear variables, a elegir su tipo y a hacer cálculos con operadores, incluido el módulo. En la próxima lección tu programa va a tomar decisiones y a repetir tareas.

## 3. Sugerencias multimedia

- **Introducción (0:00), Lámina 8:** Portada de la lección 2. Texto en pantalla: «Lección 2 · Variables y tipos de datos»
- **Partes de una variable (0:30), Lámina 9:** Lámina con `int vidas = 3;` en grande y tres etiquetas: tipo, nombre y valor. Texto en pantalla: «Una variable tiene tipo, nombre y valor».
- **Tipos de datos (1:40), Lámina 10:** Lámina con los cuatro tipos: `int`, `double`, `boolean` y `String`. Texto en pantalla: «`int` 3 · `double` 4.5 · `boolean` true · `String` "Miso"».
- **Las variables en el código (2:40), editor OnlineGDB, sin lámina:** Se escriben las cuatro variables de Miso (`nombre`, `edad`, `peso`, `esJuguetona`) y los `println` que las muestran con `+`. Se pulsa Run. Anotación: subrayar el `+` que une el texto con la variable.
- **Operadores aritméticos (4:10), Lámina 11:** Lámina de operadores: `+`, `-`, `*`, `/` y `%` con un ejemplo cada uno. Texto en pantalla: «`17 / 5` = 3 · `17 % 5` = 2». Anotación: resaltar `/` y `%`.
- **Cálculos en el código (5:10), editor OnlineGDB, sin lámina:** Se agrega `(edad + 1)` en un `println`, y después el reparto de caramelos con `/` y `%`. Se ejecuta. Texto en pantalla: «Usa paréntesis para calcular primero».
- **Pausa y prueba (6:40), Lámina 12:** Tarjeta de pausa de 5 segundos con cuenta regresiva. Texto en pantalla: «Pausa el video y prueba» · «Tómate el tiempo que necesites»: «Crea las variables de tu mascota», «Muéstralas con `println`», «Divide con `/` y halla el residuo con `%`».
- **Resumen (7:20), Lámina 13:** Lámina de resumen. Texto en pantalla: «Variables» · «Tipos de datos» · «Operadores».

## 4. Pregunta para pensar

¿Qué muestra `System.out.println("Edad: " + edad + 1);` sin paréntesis? (Pista: el texto se une antes de sumar.)
