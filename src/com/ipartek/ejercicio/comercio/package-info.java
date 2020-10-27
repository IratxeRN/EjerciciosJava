/**
 * Ejercicio de Herencias 2
 * 
 * Realizar un proyecto nuevo llamado Comercio en la que definiremos las
 * siguientes clases y su herencia <b>Bloque1:</b> <p style:"justify">Clase
 * producto: la utilizaremos para representar todos los productos que tengamos
 * en nuestra tienda. Contará con los atributos referencia y precio. Asimismo,
 * tendremos las clases discoDuro, con los atributos capacidad, velocidad y
 * esSSD, la clase Grafica, con los atributos memoria y conexión y la clase
 * Procesador, que tendrá los atributos modelo y velocidad. Todas estas clases
 * serán clases hijas de la clase producto, y contarán con dos constructores
 * mínimo, el completo y el vacío Todas las clases anteriores, contaran con un
 * método llamado toString, que nos mostrara los valores de todos sus atributos,
 * tanto loas propios de la clase como los heredados si los tuviera
 * </p>
 * 
 * <b>Bloque 2</b> La tienda también prestara distintos servicios informáticos.
 * Par ello contaremos con una clase padre llamada Servicio (esta clase será
 * hija de la clase producto) que tendrá los atributos código, precio y
 * minimoHoras, de la que heredaran dos clases hijas, la clase servicioTienda,
 * con un atributo Empleado de tipo string, y servicioDomicilio, con un atributo
 * gastoAdicional. Todas estas clases contaran con los constructores adecuados
 * Programa main Una vez realizado esta jerarquía de clases, se procederá a
 * crear un programa principal llamado gestión de stocks, que almacenara todos
 * los datos solicitados en una lista En él se creará un menú que muestre las
 * siguientes opciones al usuario: A: añadir al stock de la tienda B: vender
 * producto C: vender servicio informático
 * 
 * Validar la introducción de la elección, repetir este menú hasta que la opción
 * sea A, a, B, b Si pulsa la opción A: se mostrará otro menú, con tres opciones
 * A: disco duro B: procesador C: grafica Se validará que la introducción de
 * elección es correcta y si es correcta, se le solicitara la información por
 * teclado al usuario para llenar el producto seleccionado. Una vez obtenida
 * toda la información, se añadirá a la lista. Si pulsa la opción B: se
 * mostrarán las referencias de toda la lista, se pedirá que se elimine ese
 * producto del stock (solo se mostraran en esta lista los objetos de tipo
 * producto) pidiéndole la posición del elemento a eliminar al usuario por
 * teclado, volviendo a mostrar la lista de productos para verificar que se
 * vendió. Si pulsa la opción C: se añadirá a la lista un nuevo servicio. Para
 * ello deberá escogerse qué tipo de servicio será, si es en la tienda o es en
 * donde el cliente. Una vez escogido el tipo, se creara el objeto de dicho tipo
 * y se rellenara con los datos adecuados, que se solicitaran por teclado al
 * cliente
 * 
 * Consejos: Se recomienda precargar mediante código una serie de productos y
 * servicios en la lista para tener material de prueba
 * 
 * 
 */

package com.ipartek.ejercicio.comercio;