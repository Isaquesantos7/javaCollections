package set.exec.linguagemFavorita;

import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("\tAno de criação\t");
        Set<Linguagem> minhasLinguagens = new LinkedHashSet<>(){{
            add(new Linguagem("Java", 1995, "Eclipse"));
            add(new Linguagem("PHP", 1964, "PHPStorm"));
            add(new Linguagem("python", 1998, "PyCharm"));
        }};
        for (Linguagem x : minhasLinguagens){
            System.out.println(x.getName() + " - " + x.getAnoCriacao() + " - " + x.getIDE());
        }

        System.out.println();
        System.out.println("\tOrdem natural\t");
        Set<Linguagem> minhasLinguagens1 = new TreeSet<>(new OrdemNome()){{
            add(new Linguagem("Java", 1995, "Eclipse"));
            add(new Linguagem("PHP", 1964, "PHPStorm"));
            add(new Linguagem("python", 1998, "PyCharm"));
        }};
        for (Linguagem x : minhasLinguagens1){
            System.out.println(x.getName() + " - " + x.getAnoCriacao() + " - " + x.getIDE());
        }

        System.out.println();
        System.out.println("\tOrdem IDE\t");
        Set<Linguagem> minhasLinguagens2 = new TreeSet<>(new OrdemIDE()){{
            add(new Linguagem("Java", 1995, "Eclipse"));
            add(new Linguagem("PHP", 1964, "Intelij"));
            add(new Linguagem("python", 1998, "PyCharm"));
        }};
        for (Linguagem x : minhasLinguagens2){
            System.out.println(x.getName() + " - " + x.getAnoCriacao() + " - " + x.getIDE());
        }

        System.out.println();
        System.out.println("\tOrdem ano de criação e nome\t");
        Set<Linguagem> minhasLinguagens3 = new TreeSet<>(new AnoNome()){{
            add(new Linguagem("Java", 1995, "Eclipse"));
            add(new Linguagem("Java", 1964, "Intelij"));
            add(new Linguagem("Java", 1998, "PyCharm"));
        }};
        for (Linguagem x : minhasLinguagens3){
            System.out.println(x.getName() + " - " + x.getAnoCriacao() + " - " + x.getIDE());
        }

        System.out.println();
        System.out.println("\tOrdem ano de criação e nome\t");
        Set<Linguagem> minhasLinguagens4 = new TreeSet<>(new nomeAnoIDE()){{
            add(new Linguagem("Java", 1995, "Eclipse"));
            add(new Linguagem("PHP", 1964, "Intelij"));
            add(new Linguagem("Python", 1998, "PyCharm"));
        }};
        for (Linguagem x : minhasLinguagens4){
            System.out.println(x.getName() + " - " + x.getAnoCriacao() + " - " + x.getIDE());
        }
    }
}
class Linguagem{
    private String name;
    private Integer anoCriacao;
    private String IDE;

    public Linguagem(){}
    public Linguagem(String name, Integer anoCriacao, String IDE){
        this.name = name;
        this.anoCriacao = anoCriacao;
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return name.equals(linguagem.name) && anoCriacao.equals(linguagem.anoCriacao) && IDE.equals(linguagem.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, anoCriacao, IDE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }
}
class OrdemNome implements Comparator <Linguagem> {

    @Override
    public int compare(Linguagem linguagem1, Linguagem linguagem2) {
        return linguagem1.getName().compareToIgnoreCase(linguagem2.getName());
    }
}

class OrdemIDE implements Comparator <Linguagem>{
 @Override
 public int compare(Linguagem linguagem1, Linguagem linguagem2){
     return linguagem1.getIDE().compareToIgnoreCase(linguagem2.getIDE());
 }
}
class AnoNome implements Comparator <Linguagem>{
    @Override
    public int compare(Linguagem linguagem1, Linguagem linguagem2){
        int nome = linguagem1.getName().compareToIgnoreCase(linguagem2.getName());
        if(nome != 0) return nome;
        return Integer.compare(linguagem1.getAnoCriacao(), linguagem2.getAnoCriacao());
    }
}
class nomeAnoIDE implements Comparator <Linguagem>{
    @Override
    public int compare(Linguagem linguagem1, Linguagem linguagem2){
        int nome = linguagem1.getName().compareToIgnoreCase(linguagem2.getName());
        if(nome != 0) return nome;
        int IDE = linguagem1.getIDE().compareToIgnoreCase(linguagem2.getIDE());
        if(IDE != 0) return IDE;
        return Integer.compare(linguagem1.getAnoCriacao(), linguagem2.getAnoCriacao());
    }
}