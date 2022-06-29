import java.util.List;

public class ManipularArrayNumeros {
    public static int retorno;
    public static int buscarPosicaoNumero(List<Integer> list, int numero) {
        return list.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> list, int numero) throws IllegalArgumentException {
        int comparador = buscarPosicaoNumero(list,numero);
        if (comparador!=-1) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        } else {
            list.add(numero);
        }
    }

    public static void removerNumero(List<Integer> list, int numero) throws IllegalArgumentException {
        int comparador = buscarPosicaoNumero(list, numero);
            if (comparador!=-1) {
                list.remove(Integer.valueOf(numero));
            } else {
                throw new IllegalArgumentException("Numero nao encontrado na lista");
            }
    }

    public static void substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto) {
        int comparador = buscarPosicaoNumero(list, numeroSubstituir);
        if (comparador<0) {
            list.add(numeroSubstituto);
        } else {
            list.set(comparador, numeroSubstituto);
        }
    }
}
