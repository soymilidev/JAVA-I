
# Diagramar con UML

Ahora que conocemos un poco más de la diagramación, vamos a realizar el análisis de unos casos. En cada uno debemos pensar los atributos, las responsabilidades y el constructor adecuado al problema de acuerdo al contexto. Luego, se dibujarán las clases con el DrawIO. Y cuando termino, veo si el resto del grupo los resolvió igual que yo.

### Ejercicio N° 1
El tío Rico tiene dinero guardado en el banco **Digital Bank**, cada vez que retira un poco de su cuantiosa fortuna, verifica exactamente que el nombre que figura como titular de la caja de ahorros sea el suyo, que no le falte un centavo de su saldo y que el número sea el correcto. Recién empezó a operar con la página web.  
Su banco le permite retirar, depositar y recibir transferencias (a su CBU). Para ello, precisa que le indiquen su saldo, el titular, su CBU y alias. Cuando abrió su cuenta de caja de ahorro, le pidieron su nombre y saldo inicial. Con el número que le tocó, la crearon.

#### Actividad
Modelar **la clase caja de ahorros** para que pueda ser utilizada en un programa del banco. Agregar atributos o métodos si te parece que faltan.

### Ejercicio N° 2
Paulina es clienta del banco **Digital Bank** y tiene una cuenta corriente que le permite emitir cheques para pagar electrodomésticos. El banco ofrece dos tipos de cheques:
- Común
- De pago diferido
Los cheques tienen una fecha de emisión y una fecha de vencimiento, con un plazo máximo de 30 días para su presentación a contar desde la fecha de vencimiento. Pueden ser transferidos a otras personas mediante una acción conocida como endoso, esto implica escribir los datos de la nueva persona propietaria al dorso del cheque.

#### Actividad
Modelar **la clase cheque** para que pueda ser utilizada en un programa del banco. Agregar atributos o métodos si te parece que faltan.

### Ejercicio N° 3
Un día cualquiera de la veterinaria consiste en recibir al viejo labrador Ámbar, que viene con su dueña Anita. Lo está esperando en el consultorio 1 el doctor Julio para atenderlo, mientras vemos que sale del consultorio 2 el gatito Miluz, que tiene 3 meses. Cada veterinario tiene un consultorio asignado. Como siempre, a cada mascota se la pesa, mide y registra el estado general (regular, bueno o muy bueno). Los clientes pagan la consulta a fin de mes, por lo que se les va acumulando el importe de las consultas y cuántas fueron.

#### Actividad
Hay que identificar en el texto cuáles son las clases que se presentan en la narrativa. Dibujarlas en un diagrama de clases con atributos, métodos y constructores adecuados.


### Ejercicio N° 4
La veterinaria requiere de un constante suministro de diferentes cajas de provisiones que son adquiridas para su posterior reventa o para ser utilizadas durante las operaciones en las consultas que ocurren los consultorios. Estas cajas de provisiones tienen diferentes características entre las cuales podemos destacar: peso total, origen, nombre de proveedor, descripción del contenido y si tiene que ser tratada con cuidado en el caso de contener material frágil.

#### Actividad
Detectar los atributos y métodos que debería tener el objeto caja de provisiones, considerar agregar un correspondiente constructor y diagramar con UML.

### Resolucion
![UML-EjercicioMesa]( https://github.com/soymilidev/JAVA-I/blob/main/C04/C4-Mesa/UML-EjercicioMesa.png)
