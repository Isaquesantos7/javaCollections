package stream;
import java.util.*;

public class stream1 {
    public static void main(String []args){
        Map<Integer, Agenda> agenda1 = new HashMap<>(){{
            put(1, new Agenda("Isaque", 987308769));
            put(2, new Agenda("Eliseu", 555555555));
            put(3, new Agenda("Cleidiane", 955655655));
        }};
        for(Map.Entry<Integer, Agenda> i : agenda1.entrySet()){
            System.out.println(i.getKey() + " - " + i.getValue().getNome() + " - " + i.getValue().getNumero());
        }

        System.out.println();
        System.out.println("----\tOrdenar por inserção\t----");
        Map<Integer, Agenda> agenda2 = new LinkedHashMap<>(){{
            put(5, new Agenda("Edicleide", 98700000));
            put(1, new Agenda("Isaque", 987308769));
            put(2, new Agenda("Eliseu", 555555555));
            put(3, new Agenda("Cleidiane", 955655655));
            put(4, new Agenda("Rosalvo", 87032558));
        }};
        for(Map.Entry<Integer, Agenda> i : agenda2.entrySet()) {
            System.out.println(i.getKey() + " - " + i.getValue().getNome() + " - " + i.getValue().getNumero());
        }

        System.out.println();
        System.out.println("----\tOrdenar por ID\t----");
        Set<Map.Entry<Integer, Agenda>> agenda3 = new TreeSet<>(new Comparator<Map.Entry<Integer, Agenda>>() {
            @Override
            public int compare(Map.Entry<Integer, Agenda> id1, Map.Entry<Integer, Agenda> id2) {
                return Integer.compare(id1.getValue().getNumero(), id2.getValue().getNumero());
            }
        });
        agenda3.addAll(agenda2.entrySet());
        for(Map.Entry<Integer, Agenda> i : agenda3) {
            System.out.println(i.getKey() + " - " + i.getValue().getNome() + " - " + i.getValue().getNumero());
        }
        System.out.println();
        System.out.println("----\tOrdenar por numero de telefone\t----");
        Set<Map.Entry<Integer, Agenda>> agenda4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Agenda>>(){
            @Override
            public int compare(Map.Entry<Integer, Agenda> ag1, Map.Entry<Integer, Agenda> ag2){
                return Integer.compare(ag1.getValue().getNumero(), ag2.getValue().getNumero());
            }
        });
        agenda4.addAll(agenda2.entrySet());
        for(Map.Entry<Integer, Agenda> i : agenda4) {
            System.out.println(i.getKey() + " - " + i.getValue().getNome() + " - " + i.getValue().getNumero());
        }
        /*
        System.out.println();
        System.out.println("----\tOrdenar por nome de contatos\t----");
        Set<Map.Entry<Integer, Agenda>> agenda5 = new TreeSet<>(new NameAgenda());
        agenda5.addAll(agenda2.entrySet());
        for(Map.Entry<Integer, Agenda> i : agenda5) {
            System.out.println(i.getKey() + " - " + i.getValue().getNome() + " - " + i.getValue().getNumero());
        }

        */
        System.out.println();
        System.out.println("----\tOrdenar por nome de contatos\t----");
        /*
        Set<Map.Entry<Integer, Agenda>> agenda5 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        agenda5.addAll(agenda2.entrySet());
        */
        Set<Map.Entry<Integer, Agenda>> agenda5 = new TreeSet<>(Comparator.comparing(i -> i.getValue().getNome()));
        agenda5.addAll(agenda2.entrySet());
        for(Map.Entry<Integer, Agenda> i : agenda5) {
            System.out.println(i.getKey() + " - " + i.getValue().getNome() + " - " + i.getValue().getNumero());
        }
    }
}
class Agenda{
    private String nome;
    private Integer numero;

    public Agenda(){

    }
    public Agenda(String nome, Integer numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agenda agenda = (Agenda) o;
        return nome.equals(agenda.nome) && numero.equals(agenda.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
/*
class id implements Comparator<Map.Entry<Integer, Agenda>>{

    @Override
    public int compare(Map.Entry<Integer, Agenda> o1, Map.Entry<Integer, Agenda> o2) {
        return Integer.compare(o1.getKey(), o2.getKey());
    }
}

 */
/*
class Telefone  implements Comparator<Map.Entry<Integer, Agenda>>{
    @Override
    public int compare(Map.Entry<Integer, Agenda> l1, Map.Entry<Integer, Agenda> l2){
        return Integer.compare(l1.getValue().getNumero(), l2.getValue().getNumero());
    }
}

 */
/*
class NameAgenda implements Comparator<Map.Entry<Integer, Agenda>>{
    @Override
    public int compare(Map.Entry<Integer, Agenda> n1, Map.Entry<Integer, Agenda> n2){
        return n1.getValue().getNome().compareToIgnoreCase(n2.getValue().getNome());
    }
}
 */

