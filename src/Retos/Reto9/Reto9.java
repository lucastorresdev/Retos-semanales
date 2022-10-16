package Retos.Reto9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reto9 {

    //        A 	· — 	  	N 	— · 	  	0 	— — — — —
//        B 	— · · · 	  	Ñ 	— — · — — 	  	1 	· — — — —
//        C 	— · — · 	  	O 	— — — 	  	2 	· · — — —
//        CH 	— — — — 	  	P 	· — — · 	  	3 	· · · — —
//        D 	— · · 	  	Q 	— — · — 	  	4 	· · · · —
//        E 	· 	  	R 	· — · 	  	5 	· · · · ·
//        F 	· · — · 	  	S 	· · · 	  	6 	— · · · ·
//        G 	— — · 	  	T 	— 	  	7 	— — · · ·
//        H 	· · · · 	  	U 	· · — 	  	8 	— — — · ·
//        I 	· · 	  	V 	· · · — 	  	9 	— — — — ·
//        J 	· — — — 	  	W 	· — — 	  	. 	· — · — · —
//        K 	— · — 	  	X 	— · · — 	  	, 	— — · · — —
//        L 	· — · · 	  	Y 	— · — — 	  	? 	· · — — · ·
//        M 	— — 	  	Z 	— — · · 	  	" 	· — · · — · 	  	/ 	— · · — ·

    /*
     * Crea un programa que sea capaz de transformar texto natural a código
     * morse y viceversa.
     * - Debe detectar automáticamente de qué tipo se trata y realizar
     *   la conversión.
     * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
     *   o símbolos y dos espacios entre palabras "  ".
     * - El alfabeto morse soportado será el mostrado en
     *   https://es.wikipedia.org/wiki/Código_morse.
     */
    public void resolver(String frase) {



        Map morse = new HashMap();

        morse.put('A',"· — ");
        morse.put('B',"— · · · ");
        morse.put('C',"— · — · ");
        morse.put('D',"— · · ");
        morse.put('E',"· ");
        morse.put('F',"· · — · ");
        morse.put('G',"— — · ");
        morse.put('H',"· · · · ");
        morse.put('I',"· · ");
        morse.put('J',"· — — — ");
        morse.put('K',"— · — ");
        morse.put('L',"· — · · ");
        morse.put('M',"— — ");
        morse.put('N',"— · ");
        morse.put('Ñ',"— — · — — ");
        morse.put('O',"— — — ");
        morse.put('P',"· — — · ");
        morse.put('Q',"— — · — ");
        morse.put('R',"· — · ");
        morse.put('S',"· · · ");
        morse.put('T',"— ");
        morse.put('U',"· · — ");
        morse.put('V',"· · · — ");
        morse.put('W',"· — — ");
        morse.put('X',"— · · — ");
        morse.put('Y',"— · — — ");
        morse.put('Z',"— — · · ");
        morse.put(' ',"  ");

        ;
        List<Character> letrasDeLaFrase = new ArrayList<>();
        List<String> codigoMorseTranscripto = new ArrayList<>();

        for (int i = 0; i < frase.length(); i++) {
            letrasDeLaFrase.add(frase.toUpperCase().charAt(i));
        }



        for (int i = 0; i < letrasDeLaFrase.size(); i++) {
            if(morse.containsKey(letrasDeLaFrase.get(i))){
              System.out.print(morse.get(letrasDeLaFrase.get(i)));
            }
        }



    }
}

