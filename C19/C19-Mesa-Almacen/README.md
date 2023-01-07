
# Almacen

Modelar y programar en Java la implementación del Patrón de Diseño Factory.

Dada la siguiente familia de clases, se te encomienda el desafío de optimizar el diseño, teniendo en cuenta que necesitamos construir objetos de estas clases a partir de diferentes parámetros recibidos.

![UML-Consigna]( https://github.com/soymilidev/JAVA-I/blob/main/C19/C19-Mesa-Almacen/img/EjercicioMesa.png )

Si recibimos como parámetro “CAJA10X10” deberás poder construir un objeto de la clase Caja que tenga una longitud, ancho y altura de 10 cm. Si el parámetro es “PELOTAFULTBOL” deberás poder construir un objeto de la clase pelota cuyo radio sea de 11 cm, tamaño del radio de una pelota de fútbol. Si se recibe como parámetro “PELOTATENIS” deberás construir un objeto pelota con un radio de 0,32 cm.

Con base en el enunciado:  
A) Modificar el diagrama de clases con la implementación del Patrón Factory.  
B) Realizar la programación del método **calcularEspacio** que devuelva (no muestre por consola) la cantidad de espacio necesario que necesita cada producto, es decir, el volumen que ocupa.  
C) Realizar la programación del método **calcularEspacioNecesario** que devuelva la cantidad de espacio necesario para guardar todos los productos del almacén.  

**Consideraciones**: contemplar todas las medidas en cm.

### Resolucion UML
![UML-Almacen]( https://github.com/soymilidev/JAVA-I/blob/main/C19/C19-Mesa-Almacen/img/UML-Almacen.png )
