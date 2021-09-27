package map;
import java.util.*;

public class map2 {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        System.out.println("\tOrdem aleatoria\t");
        Map<String, Livros> livros = new HashMap<>(){{
            put("Clediane Santos ", new Livros("Familia busca pé", 456));
            put("Daniel Moreno ", new Livros("Introdução ao pentester", 405));
            put("Bruno Fraga ", new Livros("Tecnicas de invasão", 365));
        }};
        for(Map.Entry<String, Livros> entry: livros.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNomeAutor() + " - Paginas: " + entry.getValue().getPaginas());
        }
        System.out.println();
        System.out.println("\tOrdem de inserção\t");
        Map<String, Livros> livros2 = new LinkedHashMap<>(){{
            put("Clediane Santos ", new Livros("Familia busca pé", 456));
            put("Daniel Moreno ", new Livros("Introdução ao pentester", 405));
            put("Bruno Fraga ", new Livros("Tecnicas de invasão", 365));
        }};
        for(Map.Entry<String, Livros> entry : livros2.entrySet()) System.out.println(entry.getKey() + " - " + entry.getValue().getNomeAutor() + " - Paginas: " + entry.getValue().getPaginas());

        System.out.println();
        System.out.println("\tOrdem alfabetica autores\t");
        Map<String, Livros> livros3 = new TreeMap<>(){{
            put("Clediane Santos ", new Livros("Familia busca pé", 456));
            put("Daniel Moreno ", new Livros("Introdução ao pentester", 405));
            put("Bruno Fraga ", new Livros("Tecnicas de invasão", 365));
        }};
        for(Map.Entry<String, Livros> entry : livros3.entrySet()) System.out.println(entry.getKey() + " - " + entry.getValue().getNomeAutor() + " - Paginas: " + entry.getValue().getPaginas());

        System.out.println();
        System.out.println("\tOrdem alfabetica nome dos livros\t");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new NomeLivros());
        meusLivros3.addAll(livros.entrySet());

        for(Map.Entry<String, Livros> entry : meusLivros3) System.out.println(entry.getKey() + " - " + entry.getValue().getNomeAutor() + " - Paginas: " + entry.getValue().getPaginas());

        System.out.println();
        System.out.println("\tOrdem alfabetica numero de paginas\t");
        Set<Map.Entry<String, Livros>> livros5 = new TreeSet<>(new NumberPaginas());
        livros5.addAll(livros.entrySet());

        for(Map.Entry<String, Livros> entry : livros5) System.out.println(entry.getKey() + " - " + entry.getValue().getNomeAutor() + " - Paginas: " + entry.getValue().getPaginas());
    }
}
class Livros{
    private String titulo;
    private Integer paginas;

    public Livros(){

    }
    public Livros(String titulo, int paginas){
        this.titulo = titulo;
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return titulo.equals(livros.titulo) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nomeAutor='" + titulo + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public String getNomeAutor() {
        return titulo;
    }

    public void setNomeAutor(String nomeAutor) {
        this.titulo = nomeAutor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
class NomeLivros implements Comparator<Map.Entry<String, Livros>>{
    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2){
        return l1.getValue().getNomeAutor().compareToIgnoreCase(l2.getValue().getNomeAutor());
    }
}
class NumberPaginas implements Comparator <Map.Entry<String, Livros>>{
    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2){
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}