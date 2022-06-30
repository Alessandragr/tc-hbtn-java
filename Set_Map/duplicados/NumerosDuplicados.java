import java.util.*;

public class NumerosDuplicados {
    public static TreeSet<Integer> busca(int[] numeros) {
        HashSet<Integer> listaHash = new HashSet<Integer>();
        TreeSet<Integer> listaSet = new TreeSet<Integer>();

        for (int listaNumeros : numeros){
            if (!listaHash.add(listaNumeros)){
                listaSet.add(listaNumeros);
            }
        }
        return listaSet;
    }
}
