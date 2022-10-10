package Retos.Reto4;

public class Reto4 {

    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */


    public void resolver(Poligono poligono, Double n1, Double n2) {
        switch (poligono){
            case TRIANGULO:
                 System.out.println((n1*n2/2));
                 break;
            case CUADRADO:
                System.out.println( n1*n1);
                break;
            case RECTANGULO:
                System.out.println( n1*n2);
                break;
            default: System.out.println("Error al calcular");
        }
    }

}
