import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> lista, CriterioFiltro criterioFiltro) {
        ArrayList<Produto> listaProduto = new ArrayList<>();
        lista.forEach(produto -> {
            if (criterioFiltro.testar(produto)) {
                listaProduto.add(produto);
            }
        });
        return listaProduto;
    }
}
