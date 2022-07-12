import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> lista, Predicate<Produto> produtoPredicate) {
        ArrayList<Produto> listaProduto = new ArrayList<>();
        lista.forEach(produto -> {
            if (produtoPredicate.test(produto)) {
                listaProduto.add(produto);
            }
        });
        return listaProduto;
    }
}
