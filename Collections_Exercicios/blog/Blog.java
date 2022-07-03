import java.util.*;

public class Blog {

    private List<Post> list = new ArrayList<>();

    public List<Post> getList() {
        return list;
    }

    public void adicionarPostagem(Post post) {
        this.list.add(post);

    }

    public Set<String> obterTodosAutores() {
        Set<String> set = new TreeSet<>();

        for (Post post: list) {
            set.add(post.getAutor());
        }
        return set;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> map = new TreeMap<>();

        int total=0;

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() ; j++) {
                if(list.get(i).getCategoria().equals(list.get(j).getCategoria())) {
                    total++;
                }
            }
            map.put(list.get(i).getCategoria(), total);
            total = 0;
        }
        return map;
    }
}
