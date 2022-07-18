
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudante>  {
    private String nomeArquivo;

    private List<Estudante> estudantesLista = new ArrayList<>();

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        File arquivo = new File(nomeArquivo);
        try {
            arquivo.delete();
            arquivo.createNewFile();

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(arquivo));
            objectOutputStream.writeObject(estudantes);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> estudanteArrayList = new ArrayList<>();

        try {
            File arquivo = new File(nomeArquivo);

                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(arquivo));
                estudanteArrayList = (List<Estudante>) objectInputStream.readObject();
                objectInputStream.close();
                
        } catch(Exception ex ) {
            System.out.println("Nao foi possivel desserializar");
        }
        return estudanteArrayList;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
}