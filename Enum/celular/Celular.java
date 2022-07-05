import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<>();
    }

    public ArrayList<Contato> getContatos() {
        return  contatos;
    }

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
        this.contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        if (obterPosicaoContato(contatoAntigo.getNome())==-1)
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");

            if(obterPosicaoContato(contatoAntigo.getNome())==1 && !contatoAntigo.getNome().equals(novoContato.getNome()))
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            this.contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
    }

    public  void removerContato(Contato contato) {
        int retorno = obterPosicaoContato(contato.getNome());
        if(retorno != -1){
            this.contatos.remove(retorno);
        }else
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
    }

    public void listarContatos() {
        for (Contato contato: contatos) {

           System.out.println(contato.getNome() + " -> " + contato.getNumeroTelefone() +  " (" + contato.getTipo() + ")");
        }
    }
}
