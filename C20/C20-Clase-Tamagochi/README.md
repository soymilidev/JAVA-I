
# Tamagochi

Se desea modelar un Tamagotchi (mascota virtual), esta responde a cada uno de los estímulos que se le aplican de diferente manera de acuerdo a como se encuentra en ese momento.

Puede estar en alguno de los siguientes estados (solo uno a la vez):
- Feliz.  
- Triste.  
- Hambriento.  
- Sediento.  

Se le pueden dar los siguientes estímulos:
- Darle de beber  
- Darle de comer  
- Hacerle mimos  

| Estado actual  | Estímulo           | Efecto final                                              | 
| :--------------|:-------------------| :---------------------------------------------------------|
| Hambriento     | se le da de comer  | pasa a Feliz                                              |
| Triste         | se le da de comer  | hace 2 beep y el display muestra a la mascota vomitando   |
| Sediento       | se le da de comer  | se pone Triste                                            |
| Feliz          | se le da de comer  | se pone Sediento                                          |
| Sediento       | se le da de tomar  | pasa a Feliz                                              |
| Feliz          | se le da de tomar  | Se pone Hambriento                                        |
| Triste         | se le da de tomar  | el artefacto hace 3 beep y titila el display              |
| Hambriento     | se le da de tomar  | se pone triste                                            |
| Triste         | se le hace un mimo | pasa a Feliz                                              |
| Feliz          | se le hace un mimo | sin cambio alguno                                         |
| Hambriento     | se le hace un mimo | sin cambio alguno                                         |
| Sediento       | se le hace un mimo | sin cambio alguno                                         |

Vamos a realizar el diagrama de clases y el código Java necesario para representar el modelo enunciado sin tomar en cuenta lo que ocurre en el display ni los beeps.

### Resolucion UML
![UML-Tamagochi]( https://github.com/soymilidev/JAVA-I/blob/main/C20/C20-Clase-Tamagochi/img/UML-Tamagochi.png )
