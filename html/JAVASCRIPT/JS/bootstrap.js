window.onload = function () {
    document.getElementsByTagName ('formulario') [0] .onsubmit = function () {
        const dni = document.getElementById ('dni');

        if (validarDni (dni.value)) {
            dni.setCustomValidity ('');
        } más {
            dni.setCustomValidity ('Error en el DNI');
        }
    };
};

/ *
$ (function () {// Carga del documento
    $ ('formulario'). on ('enviar', función () {
        const dni = $ ('# dni');

        if (validarDni (dni.val ())) {
            dni [0] .setCustomValidity ('');
        } más {
            dni [0] .setCustomValidity ('Error en el DNI');
        }
    });
});
* /
function validarDni (dni) {
    const letras = 'TRWAGMYFPDXBNJZSQVHLCKE';

    if (! / [XYZ \ d] \ d {7} [AZ] /. test (dni)) {
        falso retorno;
    }

    cambiar (dni.charAt (0)) {
        caso 'X':
            dni = dni.replace ('X', '0');
            romper;
        caso 'Y':
            dni = dni.replace ('Y', '1');
            romper;
        caso 'Z':
            dni = dni.replace ('Z', '2');
            romper;
    }

    const numero = dni.substring (0, 8);

    const letra = letras [numero% 23];

    if (dni [8]! == letra) {
        falso retorno;
    }

    devuelve verdadero;
}