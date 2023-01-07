
# Empleado

Modelar y programar en Java la implementación del Patrón de Diseño Factory.

Dada la siguiente familia de clases, se te encomienda el desafío de optimizar el diseño, teniendo en cuenta que necesitamos construir objetos de estas clases a partir de diferentes parámetros establecidos.

![UML-Consigna]( https://github.com/soymilidev/JAVA-I/blob/main/C19/C19-Clase-Empleado/img/EjercicioClase.png )

Si recibimos como parámetro “EMP-RD” deberás poder construir un objeto de la clase EmpleadoRelacionDependencia con un sueldo de 1000 dolares y si el parámetro es “EMP-PH” deberás poder construir un objeto de la clase EmpleadoContratado con un importe por hora de 7 dolares y una retencion impuesto de 14%.

Basado en el enunciado realizar:  
a) Modificar el diagrama de clases con la implementación del Patrón Factory  
b) La programación del método **calcularSueldo** que devuelva (no muestre por consola) el sueldo para la cantidad de días que dicho método reciba como parámetro. Tener en cuenta que en el caso de los empleados en relación de dependencia se deberá calcular el proporcional a los días trabajados.  

**Consideraciones**: Considerar que los meses tienen 30 días y trabajan 8 hs diarias.
