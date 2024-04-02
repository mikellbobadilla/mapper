# Mapper Project

Este proyecto esta enfocado el pasar datos de una instancia a otra.

- Los puntos mas requeridos son:
    - El argumento fuente si o si tiene que ser una instancia.
    - El argumento objetivo puede ser una instancia o una clase.
        - Si es una instancia, se creara una.
        - Si no lo es, se reescribiran los datos de la clase fuente.
    - Los nombres de las propiedades tienen que coincidir.
        - Si no coinciden se ignoraran.
        - Si no coinciden, se pueden usar anotaciones para poder mapearlas.
        - Si los tipos no coinciden, en las anotaciones tienen que tener codigo que se encargue de hacer el parse.
    - Si uno de los campos es un array. El objetivo es que tambien se puedan mapear. (Experimental).

- Excepciones que se tienen que tener en cuenta.
    - Como argumento objetivo no se permiten interfaces, clases abstractas, enums, anotaciones.
    - Tampoco se permite arrays, tipos de datos primitivos o vacios.
    - Si la clase no tiene un constructor que coincidan.