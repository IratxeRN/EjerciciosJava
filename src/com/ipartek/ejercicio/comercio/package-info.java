/**
 * Ejercicio de Herencias 2
 * 
 * Realizar un proyecto nuevo llamado Comercio en la que definiremos las
 * siguientes clases y su herencia <b>Bloque1:</b> <p style:"justify">Clase
 * producto: la utilizaremos para representar todos los productos que tengamos
 * en nuestra tienda. Contar� con los atributos referencia y precio. Asimismo,
 * tendremos las clases discoDuro, con los atributos capacidad, velocidad y
 * esSSD, la clase Grafica, con los atributos memoria y conexi�n y la clase
 * Procesador, que tendr� los atributos modelo y velocidad. Todas estas clases
 * ser�n clases hijas de la clase producto, y contar�n con dos constructores
 * m�nimo, el completo y el vac�o Todas las clases anteriores, contaran con un
 * m�todo llamado toString, que nos mostrara los valores de todos sus atributos,
 * tanto loas propios de la clase como los heredados si los tuviera
 * </p>
 * 
 * <b>Bloque 2</b> La tienda tambi�n prestara distintos servicios inform�ticos.
 * Par ello contaremos con una clase padre llamada Servicio (esta clase ser�
 * hija de la clase producto) que tendr� los atributos c�digo, precio y
 * minimoHoras, de la que heredaran dos clases hijas, la clase servicioTienda,
 * con un atributo Empleado de tipo string, y servicioDomicilio, con un atributo
 * gastoAdicional. Todas estas clases contaran con los constructores adecuados
 * Programa main Una vez realizado esta jerarqu�a de clases, se proceder� a
 * crear un programa principal llamado gesti�n de stocks, que almacenara todos
 * los datos solicitados en una lista En �l se crear� un men� que muestre las
 * siguientes opciones al usuario: A: a�adir al stock de la tienda B: vender
 * producto C: vender servicio inform�tico
 * 
 * Validar la introducci�n de la elecci�n, repetir este men� hasta que la opci�n
 * sea A, a, B, b Si pulsa la opci�n A: se mostrar� otro men�, con tres opciones
 * A: disco duro B: procesador C: grafica Se validar� que la introducci�n de
 * elecci�n es correcta y si es correcta, se le solicitara la informaci�n por
 * teclado al usuario para llenar el producto seleccionado. Una vez obtenida
 * toda la informaci�n, se a�adir� a la lista. Si pulsa la opci�n B: se
 * mostrar�n las referencias de toda la lista, se pedir� que se elimine ese
 * producto del stock (solo se mostraran en esta lista los objetos de tipo
 * producto) pidi�ndole la posici�n del elemento a eliminar al usuario por
 * teclado, volviendo a mostrar la lista de productos para verificar que se
 * vendi�. Si pulsa la opci�n C: se a�adir� a la lista un nuevo servicio. Para
 * ello deber� escogerse qu� tipo de servicio ser�, si es en la tienda o es en
 * donde el cliente. Una vez escogido el tipo, se creara el objeto de dicho tipo
 * y se rellenara con los datos adecuados, que se solicitaran por teclado al
 * cliente
 * 
 * Consejos: Se recomienda precargar mediante c�digo una serie de productos y
 * servicios en la lista para tener material de prueba
 * 
 * 
 */

package com.ipartek.ejercicio.comercio;