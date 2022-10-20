package Retos.Reto12;
import java.util.ArrayList;
import java.util.List;

public class Reto12{

    /*
     * Escribe una función que reciba un texto y retorne verdadero o
     * falso (Boolean) según sean o no palíndromos.
     * Un Palíndromo es una palabra o expresión que es igual si se lee
     * de izquierda a derecha que de derecha a izquierda.
     * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
     * Ejemplo: Ana lleva al oso la avellana.
     */
    public void resolver(String palabra){

        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        List <Character> palabraInvertida = new ArrayList <>();
        Integer contador = 0;

        for(int i = palabra.length(); i > 0; i--){
            palabraInvertida.add(palabra.charAt(i - 1));
        }

        for(int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(i) == palabraInvertida.get(i)){
                contador++;
            }
        }

        if(contador == palabra.length()){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }

}
