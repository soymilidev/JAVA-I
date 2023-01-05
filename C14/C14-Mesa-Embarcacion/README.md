
# Práctica Parcial

Realizar el diagrama UML y programar en Java el siguiente enunciado:

La empresa Navetur se dedica a alquilar embarcaciones y necesita un sistema para administrar las mismas.

Una embarcación tiene que tener si o si un capitán y los datos que se necesitan del capitán son: nombre, apellido y matrícula de navegación —utilizar un constructor que permita asignar todos estos atributos al momento de crear el objeto—.

Una embarcación, además de tener asociado un capitán, tiene un precio base, un valor adicional, un año de fabricación y la longitud en metros que se denomina eslora.

Existen dos variantes de embarcaciones que alquila Navetur. Ambas con las características que se describieron, pero cada una de estas tienen además otras características. Los veleros tienen cantidad de mástiles y los yates cantidad de camarotes.

El sistema debe contar con las siguientes funcionalidades:
Dada cualquier embarcación el sistema debe permitir **calcular el monto del alquiler**. El monto del alquiler es el valor base y si el año de fabricación es mayor al 2020, se le suma un valor adicional.

En el caso de los yates debe ser posible **compararlos**. Un yate tiene mayor lujo que otro si tiene mayor cantidad de camarotes.

Es importante poder **evaluar** en un velero si es grande. Los veleros grandes son aquellos que superan los 4 mástiles.

### Resolucion UML
![UML-Examen]( https://github.com/soymilidev/JAVA-I/blob/main/C14/C14-Mesa-Embarcacion/img/UML-Embarcacion.png )
