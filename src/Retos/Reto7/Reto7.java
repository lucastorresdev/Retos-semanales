package Retos.Reto7;

public class Reto7 {

    /*
     * Crea un programa que cuente cuantas veces se repite cada palabra
     * y que muestre el recuento final de todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que
     *   lo resuelvan automáticamente.
     */

    public void resolver(String cadena) {

        String cadenaLower=cadena.toLowerCase();
        String[] listaDePalabras;
        Integer contador=0;
        Integer numeros=0;

        listaDePalabras = cadenaLower.split(" ");

        for (String cadenas:listaDePalabras) {
            contador++;
        }

        for (int i = 0; i < contador ; i++) {

            if(i==0) {
                for (int j = 0; j < contador; j++) {
                    if (listaDePalabras[i].equals(listaDePalabras[j + 1])) {
                        numeros++;
                    }
                }
            }


        }


    System.out.println(numeros);


    }
}
