package Retos.Reto7;

import java.util.ArrayList;
import java.util.List;

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
        Integer aux=0;

        listaDePalabras = cadenaLower.split(" ");



        List<Palabra> palabrasSeparadas = new ArrayList<>();
        List<Palabra> palabrasContadas = new ArrayList<>();
        for (String cadenas:listaDePalabras) {
            contador++;
            palabrasContadas.add(new Palabra("",0));
        }
        int j=0;
        for (int i = 0; i < contador ; i++) {
                for (j=j; j < contador; j++) {
                    if (listaDePalabras[i].equals(listaDePalabras[j])) {
                        if (!palabrasContadas.get(i).getPalabra().equals(listaDePalabras[i])) {
                            palabrasContadas.set(i,new Palabra(listaDePalabras[i], 0));
                        }
                    }
                    if(palabrasContadas.get(i).getPalabra().equals(listaDePalabras[j])){
                        palabrasContadas.get(i).sumarCantidad();
                    }
                }
                aux++;
                if(j==contador){
                j=aux;
                }
        }


        for (Palabra palabra:palabrasContadas) {
            System.out.println(palabra.getPalabra()+": "+palabra.getCantidad());
        }


    }
}
