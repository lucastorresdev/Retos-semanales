package Retos.Reto10;

import java.util.ArrayList;
import java.util.List;

public class Reto10 {
    /*
     * Crea un programa que comprueba si los paréntesis, llaves y corchetes
     * de una expresión están equilibrados.
     * - Equilibrado significa que estos delimitadores se abren y cieran
     *   en orden y de forma correcta.
     * - Paréntesis, llaves y corchetes son igual de prioritarios.
     *   No hay uno más importante que otro.
     * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
     * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
     */

    public void resolver(String expresion) {


        List<Character> expresionChar = new ArrayList<>();
        Integer valorEsperado=0;
        Integer valorObtenido=0;

        for (int i = 0; i < expresion.length(); i++) {
            expresionChar.add(expresion.charAt(i));
            if(expresionChar.get(i)=='['||expresionChar.get(i)==']'){
                valorEsperado++;
            }
            if(expresionChar.get(i)=='{'||expresionChar.get(i)=='}'){
                valorEsperado++;
            }
            if(expresionChar.get(i)=='('||expresionChar.get(i)==')'){
                valorEsperado++;
            }
        }

            if(expresionChar.contains('[')&&expresionChar.contains(']')){
                valorObtenido++;
                valorObtenido++;
            }
            if(expresionChar.contains('{')&&expresionChar.contains('}')){
                valorObtenido++;
                valorObtenido++;
            }
            if(expresionChar.contains('(')&&expresionChar.contains(')')){
                valorObtenido++;
                valorObtenido++;
            }


        if (valorEsperado==valorObtenido){
            System.out.println("Expresion balanceada");
        }else{
            System.out.println("Expresion no balanceada");

        }



    }
}
