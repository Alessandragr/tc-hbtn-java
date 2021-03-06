import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public int obterPosicaoContato(String nomeContato) {
        for (Contato contato: contatos) {
            if (contato.getNome().equals(nomeContato)) {
                return contatos.indexOf(contato);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome())!=-1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        if (obterPosicaoContato(contatoAntigo.getNome())==-1)
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");

            if(obterPosicaoContato(novoContato.getNome())==1 && !contatoAntigo.getNome().equals(novoContato.getNome()))
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
            // contatos.set(contatos.indexOf(contatoAntigo), novoContato);

    }

    public void listarContatos() {
        for (Contato contato: contatos) {
            System.out.println(contato.getNome() + " -> " + contato.getNumeroTelefone() + " (" + contato.getTipo() + ")");
        }
    }

    public void removerContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome())==-1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        } else {
            contatos.remove(contato);
        }
    }
}
