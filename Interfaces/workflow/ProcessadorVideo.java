import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canalNotificacao = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        this.canalNotificacao.add(canalNotificacao);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canalNotificacao) {
            canal.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG));

        }
    }
}
