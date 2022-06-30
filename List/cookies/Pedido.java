import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public ArrayList<PedidoCookie> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie cookies) {
        this.cookies.add(cookies);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie pedido: cookies) {
            total += pedido.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int total =0;
        Iterator<PedidoCookie> cookieIterator = cookies.iterator();
        while (cookieIterator.hasNext()) {
            PedidoCookie pedidoCookie = cookieIterator.next();
            if(pedidoCookie.getSabor().equalsIgnoreCase(sabor)) {
                total+=pedidoCookie.getQuantidadeCaixas();
                cookieIterator.remove();
            }
        }
        return total;
    }

}
