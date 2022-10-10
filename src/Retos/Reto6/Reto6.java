package Retos.Reto6;

public class Reto6 {

    /*
     * Crea un programa que invierta el orden de una cadena de texto
     * sin usar funciones propias del lenguaje que lo hagan de forma automática.
     * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
     */

    public void resolver(String cadena) {

        for (int i = cadena.length(); i>0 ; i--) {
            System.out.print(cadena.charAt(i-1));
        }


    }

}
