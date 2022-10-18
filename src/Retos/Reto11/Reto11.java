package Retos.Reto11;
import java.util.ArrayList;
import java.util.List;

public class Reto11{

    /*
     * Crea una función que reciba dos cadenas como parámetro (str1, str2)
     * e imprima otras dos cadenas como salida (out1, out2).
     * - out1 contendrá todos los caracteres presentes en la str1 pero NO
     *   estén presentes en str2.
     * - out2 contendrá todos los caracteres presentes en la str2 pero NO
     *   estén presentes en str1.
     */
    public void resolver(String str1, String str2){

        String out1 = "";
        String out2 = "";

        String[] str1Split = str1.split(" ");
        List <String> str1SplitList = new ArrayList <>();

        for(int i = 0; i < str1Split.length; i++){
            str1SplitList.add(str1Split[i]);
        }

        String[] str2Split = str2.split(" ");
        List <String> str2SplitList = new ArrayList <>();

        for(int i = 0; i < str2Split.length; i++){
            str2SplitList.add(str2Split[i]);
        }

        for(int i = 0; i < str1SplitList.size(); i++){
            if(!str2SplitList.contains(str1SplitList.get(i))){
                out1 += " " + str1SplitList.get(i);
            }
        }

        for(int i = 0; i < str2SplitList.size(); i++){
            if(!str1SplitList.contains(str2SplitList.get(i))){
                out2 += " " + str2SplitList.get(i);
            }
        }

        System.out.println(out1);
        System.out.println(out2);
    }

}
