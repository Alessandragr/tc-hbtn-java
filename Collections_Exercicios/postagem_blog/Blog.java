import java.util.*;

public class Blog {

    private List<Post> list = new ArrayList<>();

    public List<Post> getList() {
        return list;
    }

    public  Blog() {}

    public void adicionarPostagem(Post post) {

        for (Post postComparativo: list) {
            if (postComparativo.getAutor().equals(post.getAutor()) && postComparativo.getTitulo().contentEquals(post.getTitulo()))
               throw new IllegalArgumentException("Postagem jah existente");
        }
        this.list.add(post);
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> map = new TreeMap<Categorias, Integer>();

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

    public Set<Autor> obterTodosAutores() {
        Set<Autor> setAutores = new TreeSet<>();
        list.forEach(post1 -> {
            Autor autores = post1.getAutor();
            setAutores.add(autores);
        });
        return setAutores;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();
        list.sort(Comparator.comparing(Post::getTitulo));

        list.forEach(post -> {
            if (post.getAutor().equals(autor)) {
                posts.add(post);
            }
        });

        return posts;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> posts = new TreeMap<>();
        for (Post post2: list) {
            Set<Post> postTotal;
            if (posts.containsKey(post2.getAutor())) {
                postTotal = posts.get(post2.getAutor());
            } else {
                postTotal = new TreeSet<>();
            }
            postTotal.add(post2);
            posts.put(post2.getAutor(), postTotal);
        }
        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsTotal = new TreeMap<>();
        for (Post post : list) {
            Set<Post> postagem;
            if (postsTotal.containsKey(post.getCategoria())) {
                postagem = postsTotal.get(post.getCategoria());
            } else {
                postagem = new TreeSet<>();
            }

            postagem.add(post);
            postsTotal.put(post.getCategoria(), postagem);
        }

        return postsTotal;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> posts = new TreeSet<>();
        list.sort(Comparator.comparing(Post::getTitulo));

        list.forEach(post -> {
            if (post.getCategoria().equals(categoria)) {
                posts.add(post);
            }
        });

        return posts;
    }
}

