package Retos.Reto8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Reto8 {
        /*
         * Crea un programa se encargue de transformar un número
         * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
         */
    public void resolver(Double numero) {

        List<Double> potenciaDos1 = new ArrayList<>();
        List<Double> potenciaDos2 = new ArrayList<>();
        List<Integer> binario = new ArrayList<>();

        Double base=2.0;
        Integer vuelta=0;

        for (int i = 0; i < 100; i++) {
            potenciaDos1.add(Math.pow(base,i));
        }
        for (Double potencias:potenciaDos1) {
            if (potencias<=numero){
                vuelta++;
            }
        }
        for (int i = 0; i < vuelta+1; i++) {
            potenciaDos2.add((Math.pow(base,i)));
        }
        Collections.reverse(potenciaDos2);

        for (int i = 0; i < vuelta+1; i++) {
            if(potenciaDos2.get(i) <=numero){
                numero-=potenciaDos2.get(i);
                binario.add(1);
            }else if (binario.size()!=0){
                binario.add(0);
            }
        }

        System.out.print(binario+" ");


//
//        for (int i = 0; i < vuelta+1; i++) {
//            if()
//        }

    }
}
