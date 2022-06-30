import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tarefa {

    private String descricao;
    private  boolean estahFeita;
    private int identificador;

    private List<Tarefa> tarefas = new ArrayList<>();
    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao, int id) {
        if (descricao!=null) {
            for(Tarefa tarefa: tarefas) {
                if (tarefa.getIdentificador()==id) {
                    tarefa.setDescricao(descricao);
                }
            }
        } else {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
    }
}
