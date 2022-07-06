import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        this.canais.add(canalNotificacao);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            canal.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG));

        }
    }
}
