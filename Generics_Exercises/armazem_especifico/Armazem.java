import java.util.Map;
import java.util.TreeMap;

public abstract class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> lista = new TreeMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        lista.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String produto) {
        return lista.get(produto);
    }
}
