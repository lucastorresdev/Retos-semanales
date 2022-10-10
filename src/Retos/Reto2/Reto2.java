package Retos.Reto2;

public class Reto2 {

    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */
    public void resolver() {

        Integer print = 0;
        Integer numeroAnterior = 0;
        Integer auxiliar = 1;

        System.out.println(print);
        print+=auxiliar;

        for (int i = 0; i < 50; i++) {


            System.out.println(print);
            auxiliar=print;
            print+=numeroAnterior;
            numeroAnterior=auxiliar;

        }

    }
}
