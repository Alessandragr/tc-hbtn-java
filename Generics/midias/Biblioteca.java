import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T> extends Midia{
    private List<T> listaArquivos = new ArrayList<>();

    public void adicionarMidia(T arquivo) {
        listaArquivos.add(arquivo);
    }

    public List<T> obterListaMidias() {
        return listaArquivos;
    }
}
