package Retos.Reto42;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Reto42{

    /*
     * Enunciado: Crea una función que transforme grados Celsius en Fahrenheit
     * y viceversa.
     *
     * - Para que un dato de entrada sea correcto debe poseer un símbolo "°"
     *   y su unidad ("C" o "F").
     * - En caso contrario retornará un error.
     * - ¿Quieres emplear lo aprendido en este reto?
     *   Revisa el reto mensual y crea una App:
     *   https://retosdeprogramacion.com/mensuales2022
     */
    public void resolver(String temperatura){

//        Formula celcius a fahrenheit: (°C×9/5) + 32
//        Formula fahrenheit a celcius:  (°F−32) × 5/9

        List <String> numero = new ArrayList <>();

        for(int i = 0; i < temperatura.length(); i++){

            switch(temperatura.charAt(i)){

                case '0':
                    numero.add("0");
                    break;
                case '1':
                    numero.add("1");
                    break;
                case '2':
                    numero.add("2");
                    break;
                case '3':
                    numero.add("3");
                    break;
                case '4':
                    numero.add("4");
                    break;
                case '5':
                    numero.add("5");
                    break;
                case '6':
                    numero.add("6");
                    break;
                case '7':
                    numero.add("7");
                    break;
                case '8':
                    numero.add("8");
                    break;
                case '9':
                    numero.add("9");
                    break;
                case ',':
                    numero.add(".");
                    break;
                case '.':
                    numero.add(".");
                    break;
            }
        }
        String numeroToString = "";
        for(String s: numero){
            numeroToString += s;
        }

        Double numeroToDouble = Double.parseDouble(numeroToString);

        if(temperatura.contains("°c") || temperatura.contains("°C")){
            Double celcius = numeroToDouble;
            Double celciusToFahrenheit = (celcius * (1.8)) + 32;
            DecimalFormat decimal = new DecimalFormat();
            System.out.println(temperatura.toUpperCase() + " son " + decimal.format(celciusToFahrenheit) + "°F");
        }else if(temperatura.contains("°f") || temperatura.contains("°F")){
            Double fahrenheit = numeroToDouble;
            Double fahrenheitToCelcius = (fahrenheit - 32) * (0.5555555555);
            DecimalFormat decimal = new DecimalFormat();
            System.out.println(temperatura.toUpperCase() + " son " + decimal.format(fahrenheitToCelcius) + "°C");
        }else{

            System.out.println("Hubo un error");
        }
    }

}
