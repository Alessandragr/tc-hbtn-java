import java.util.ArrayList;

public class Agencia {
   private String nome;
   private ArrayList<Cliente> clientes;

   private boolean statusTransacao;

    public Agencia(String nome) {
        clientes = new ArrayList<>();
        this.nome = nome;
    }

//    public Cliente buscarCliente(String nomeCliente) {
//        Iterator<Cliente> iterador = clientes.iterator();
//        while (iterador.hasNext()) {
//            Cliente cliente = iterador.next();
//            if (cliente.getNome().equals(nomeCliente))
//                return cliente;
//        }
//        return null;
//    }

    public Cliente buscarCliente(String nomeCliente){
        for (Cliente nome: clientes) {
            if (nome.getNome().equals(nomeCliente)){
                return nome ;
            }
        }
        return null;
    }

    public boolean novoCliente(String nome, double valorTransacao){

        Cliente resultado =  buscarCliente(nome);

        if (resultado == null){
            Cliente n1 = new Cliente(nome , valorTransacao);
            clientes.add(n1);
            return true ;
        }
        return false;
    }

//    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial) {
//        if (buscarCliente(nomeCliente) == null)
//            return this.clientes.add(new Cliente(nomeCliente, valorTransacaoInicial));
//        return false;
//    }

//    public boolean novoCliente(String nomeCliente, double valorTransacao) {
//        for (Cliente cliente: clientes) {
//            if (buscarCliente(nomeCliente)==null){
//                return clientes.add(new Cliente(nomeCliente, valorTransacao));
//            } else {
//                status = false;
//            }
//        }
//        return status;
//    }
    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao) {
        for (Cliente cliente: clientes) {
            if (buscarCliente(nomeCliente)==null) {
                statusTransacao = false;
            } else {
                cliente = buscarCliente(nomeCliente);
                cliente.adicionarTransacao(valorTransacao);
                statusTransacao = true;
            }
        }
        return statusTransacao;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
