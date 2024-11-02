/**
 * HolaMundo
 */

//para completar la estructura del programa podemos usar los atajos de vs code

//importar clase
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        
        //imprimir datos en la pantalla / consola / terminal

        System.out.println("Hola Mundo!"); //println hace un salto de linea

        System.out.print("Hola Juan!"); //print no hace salto de linea
        System.out.print("Como estas ?");
        System.out.print(10);
        System.out.print(10.5);
        System.out.print('A');

        System.out.println(); //salto de linea

        //printf permite dar un formato a la salida de datos
        System.out.printf("Aqui va una cadena: %s%n","Juan"); // %s indica que en ese espacio ira una cadena de caracteres (String)
        System.out.printf("Aqui va un entero: %d%n",10); // %i indica que en ese espacio ira un numero (Double) y %n hace un salto de linea
        System.out.printf("Hola soy %s y tengo %d años%n","Juan",23);

        //entrada de datos
        var scanner = new Scanner(System.in); //var permite crear rapidamente variables sin necesidad de especificar el tipo de variable
        //(scanner es el nombre del objeto de la clase Scanner pero se puede usar cualquier otro nombre)

        System.out.print("Por favor ingrese un numero entero: ");
        var entero = scanner.nextInt();

        System.out.println(entero);

        scanner.close(); //cerrar scanner

    }
}

/* NOTAS

* Los archivos java deben ir con upper camel case: HolaMundo.java
* El nombre de la clase debe ser el mismo nombre del archivo
* Dentro de la clase debe de ir el metodo main

* Para compilar usamos el comando <javac nombredelarchivo.java> en el terminal
* Para ejecutar usamos el comando <java nombredelaclase> en el terminal

* Ejemplo:
    javac HolaMundo.java -> compilar
    java Holamundo -> ejecutar

* Tambien podemos usar el boton Run Java de vscode (porque ya tenemos la extension)

*/