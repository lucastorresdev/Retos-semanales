package Retos.Reto1;

public class Reto1 {

    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */
    public Boolean resolver(String palabra1, String palabra2) {
        Boolean respuesta= false;
        Integer correcto = 0;
        if (palabra1.length()==palabra2.length()){
            if (palabra1.equals(palabra2)){
                respuesta = false;
                return  respuesta;
            }
            for (int i = 0; i < palabra1.length(); i++) {
                for (int j = 0; j < palabra2.length(); j++) {
                    if (palabra1.charAt(i)==palabra2.charAt(j)){
                        correcto++;
                        if(correcto==palabra1.length()){
                            respuesta=true;
                            return respuesta;
                        }
                    }
                }
            }
        }
        return respuesta;
    }
}
