import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> todasPessoas) {
        TreeMap<String, TreeSet<Pessoa>> treeSetTreeMap = todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<>(Comparator.reverseOrder()),
                Collectors.toCollection(TreeSet::new)));

        return treeSetTreeMap;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        Map<String, Long> longMap = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
        return longMap;
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoa) {
        Map<String, Map<Integer, Long>> stringMap = pessoa.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
        return stringMap;
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoa) {

        Map<String, Double> doubleMap = pessoa.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));
                return doubleMap;
    }
}
