import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
    private String nome;

    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        Iterator<Agencia> iterador = agencias.iterator();
        while (iterador.hasNext()) {
            Agencia agencia = iterador.next();
            if (agencia.getNome().equals(nomeAgencia))
                return agencia;
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        for (Agencia agencia : agencias) {
            if (buscarAgencia(agencia.getNome()).equals(null)) {
                return agencias.add(new Agencia(nomeAgencia));
            }

        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTansacaoInicial) {

        Agencia agenciaLocalizada = buscarAgencia(nomeAgencia);

        if (agenciaLocalizada == null) {

            return false;

        }
        agenciaLocalizada.novoCliente(nomeCliente, valorTansacaoInicial);
        agenciaLocalizada.adicionarTransacaoCliente(nomeCliente, valorTansacaoInicial);
        return true;

    }

//    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacaoInicial) {
//
//        if (buscarAgencia(nomeAgencia)!=null) {
//            for (Agencia agencia : agencias) {
//                if (agencia.buscarCliente(nomeCliente)!=null) {
//                    return agencia.novoCliente(nomeCliente, valorTransacaoInicial);
//                }
//            }
//        }
//        return false;
//    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        if (buscarAgencia(nomeAgencia)!=null) {
            for (Agencia agencia : agencias) {
                if (!agencia.buscarCliente(nomeCliente).equals(null)) {
                    return agencia.adicionarTransacaoCliente(agencia.buscarCliente(nomeCliente).getNome(), valorTransacao);
                }
            }
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacao) {
        if (buscarAgencia(nomeAgencia) == null)
            return false;
        else {
            Agencia agencia = buscarAgencia(nomeAgencia);

            if (!imprimirTransacao) {
                for (int i = 0; i < agencia.getClientes().size(); i++) {
                    System.out.printf("Cliente: %s [%d]\n", agencia.getClientes().get(i).getNome(), i + 1);
                }
            } else {
                for (int i = 0; i < agencia.getClientes().size(); i++) {
                    System.out.printf("Cliente: %s [%d]\n", agencia.getClientes().get(i).getNome(), i + 1);

                    for (int j = 0; j < agencia.getClientes().get(i).getTransacoes().size(); j++) {
                        System.out.printf("  [%d] valor %.2f\n", j + 1, agencia.getClientes().get(i).getTransacoes().get(j));
                    }
                }
            }
            return true;
        }
    }
}
