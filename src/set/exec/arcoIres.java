package set.exec;
import java.util.*;

public class arcoIres {
    public static void main(String[] args) {
        System.out.println("----\tUma embaixo da outra\t----");
        Set<String> cores = new HashSet<>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Blue");
            add("Anil");
            add("Violet");
        }};
        for(String x : cores){
            System.out.println(x);
        }

        System.out.println();
        System.out.println("----\tQuantidade de cores que o arco-ires tem\t----");
        Set<String> cores1 = new HashSet<>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Blue");
            add("Anil");
            add("Violet");
        }};
        System.out.println(cores1.size());

        System.out.println();
        System.out.println("----\tExibar as cores em ordem alfabeticas\t----");
        Set<String> cores2 = new TreeSet<>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Blue");
            add("Anil");
            add("Violet");
        }};

        System.out.println(cores2);

        System.out.println();
        System.out.println("----\tExibar as cores em ordem inversas\t----");
        Set<String> cores3 = new TreeSet<>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Blue");
            add("Anil");
            add("Violet");
        }};
        List<String> minhaLista = new ArrayList<>(cores3);
        Collections.reverse(minhaLista);
        System.out.println(minhaLista);

        System.out.println();
        System.out.println("----\tExibar todas as cores que começam com a letra 'V'\t----");
        for(String i : cores2){
            i.toUpperCase();
            if(i.contains("V")) System.out.println(i);
        }

        System.out.println();
        System.out.println("----\tLimpar totos dos conjuntos que não começam com a letra 'V'\t----");
        List<String> minhaLista1 = new ArrayList<>(cores3);
            Iterator<String> iterator = minhaLista1.iterator();
            while(iterator.hasNext()){
                if(!iterator.next().startsWith("V")){
                    iterator.remove();
                }
            }

        System.out.println(minhaLista1);

        System.out.println();
        System.out.println("----\tLimpe o conjunto'\t----");
        minhaLista.clear();
        System.out.println(minhaLista);

        System.out.println();
        System.out.println("----\tVerifique se o conjunto esta limpo\t----");
        System.out.println(minhaLista.isEmpty());




    }
}
