package set;
import java.util.*;

public class set2 {
    public static void main(String []args) {
        Locale.setDefault(Locale.US);

        System.out.println("----\tOrdem aleatoria\t----");
        Set<Serie> minhasSeries1 = new HashSet<>(){{
            add(new Serie("Star wars rebels", "Aventura", 120));
            add(new Serie("Star wars the clone wars", "Acao", 25));
            add(new Serie("Star wars Resistence", "historico", 25));
        }};
        for(Serie x : minhasSeries1){
            System.out.println(x.getName() + " - " + x.getGenero() +" - " + x.getTempoDeEpisodio());
        }

        System.out.println();
        System.out.println("----\tOrdem de inserção\t----");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("Star wars rebels", "Aventura", 120));
            add(new Serie("Star wars the clone wars", "Acao", 25));
            add(new Serie("Star wars resistence", "Historico", 25));
        }};
        for(Serie x : minhasSeries2){
            System.out.println(x.getName() + " - " + x.getGenero() +" - " + x.getTempoDeEpisodio());
        }

        System.out.println();
        System.out.println("----\tOrdem natural/tempo de episodio\t----");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries1);
        for(Serie x : minhasSeries3){
            System.out.println(x.getName() + " - " + x.getGenero() +" - " + x.getTempoDeEpisodio());
        }

        System.out.println();
        System.out.println("----\tOrdem nome/genero/tempoDeEpisodio\t----");
        Set<Serie> minhasSeries4 = new TreeSet<>(new nomeTempoEpisodio()){{
            add(new Serie("Star wars ", "Drama", 23));
            add(new Serie("Star wars ", "Acão", 25));
            add(new Serie("Star wars ", "Historia", 120));
        }};
        for(Serie x : minhasSeries4){
            System.out.println(x.getName() + " - " + x.getGenero() +" - " + x.getTempoDeEpisodio());
        }

        System.out.println();
        System.out.println("----\tOrdem Tempo de Episodio\t----");
        Set<Serie> minhasSeries5 = new TreeSet<>(new TempoDeEpisodio()){{
           add(new Serie("Star wars the clone wars", "Ação", 25));
           add(new Serie("Star wars rebels", "Aventura", 22));
           add(new Serie("Star wars the mandalorian", "Aventura", 60));
        }};
        for(Serie x : minhasSeries5){
            System.out.println(x.getName() + " - " + x.getGenero() + " - " + x.getTempoDeEpisodio());
        }

        System.out.println();
        System.out.println("----\tOrdem por genero\t----");
        Set<Serie> minhasSeries6 = new TreeSet<>(new genero()){{
            add(new Serie("Star wars the clone wars", "Ação", 25));
            add(new Serie("Star wars rebels", "Bahamas", 22));
            add(new Serie("Star wars the mandalorian", "Drama", 60));
        }};
        for(Serie x : minhasSeries6){
            System.out.println(x.getName() + " - " + x.getGenero() + " - " + x.getTempoDeEpisodio());
        }

    }
}
class Serie implements Comparable <Serie>{
    private String name;
    private String genero;
    private Integer tempoDeEpisodio;

    public Serie(){

    }
    public Serie(String name, String genero, Integer tempoDeEpisodio){
        this.name = name;
        this.genero = genero;
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoDeEpisodio() {
        return tempoDeEpisodio;
    }

    public void setTempoDeEpisodio(Integer tempoDeEpisodio) {
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDeEpisodio=" + tempoDeEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return name.equals(serie.name) && genero.equals(serie.genero) && tempoDeEpisodio.equals(serie.tempoDeEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genero, tempoDeEpisodio);
    }

    @Override
    public int compareTo(Serie series) {
        int minhaOrdenacao = this.genero.compareTo(series.getGenero());
        if(minhaOrdenacao != 0) return minhaOrdenacao;
        return Integer.compare(this.tempoDeEpisodio, series.tempoDeEpisodio);
    }
}
class nomeTempoEpisodio implements Comparator <Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        int name = o1.getName().compareToIgnoreCase(o2.getName());
        if(name != 0) return name;
        int tempoDeEpisodio = Integer.compare(o1.getTempoDeEpisodio(), o2.getTempoDeEpisodio());
        if (tempoDeEpisodio != 0) return tempoDeEpisodio;
        return Integer.compare(o1.getTempoDeEpisodio(), o2.getTempoDeEpisodio());
    }
}
class TempoDeEpisodio implements Comparator <Serie>{


    @Override
    public int compare(Serie serie1, Serie serie2) {
        return Integer.compare(serie1.getTempoDeEpisodio(), serie2.getTempoDeEpisodio());
    }
}
class genero implements Comparator <Serie>{
    @Override
    public int compare(Serie serie1, Serie serie2){
        return serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
    }
}