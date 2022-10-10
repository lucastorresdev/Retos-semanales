package Retos.Reto3;

public class Reto3 {

    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */
    public void resolver() {

        for (int i = 2; i <= 100; i++) {

            if (i%2==0&&2/i==1){
                System.out.println(i);
            }
            if (i%3==0&&3/i==1){
                System.out.println(i);
            }
            if (i%5==0&&5/i==1){
                System.out.println(i);
            }
            if (i%7==0&&7/i==1){
                System.out.println(i);
            }
            if (i%2!=0&&i%3!=0&&i%4!=0&&i%5!=0&&i%6!=0&&i%7!=0&&i%8!=0&&i%8!=0&&i%9!=0&&i%10!=0){
                System.out.println(i);
            }


        }

    }
}
