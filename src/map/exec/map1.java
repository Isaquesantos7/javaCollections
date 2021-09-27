package map.exec;
import java.util.*;
import java.util.Objects;

public class map1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Map<String, Estados> meuEstado = new HashMap<>(){{
            put("PE", new Estados(50000.000));
            put("CE", new Estados(250000.000));
            put("BA", new Estados(30000.000));
            put("SP", new Estados(60000.000));
        }};
        for (Map.Entry<String, Estados> estados : meuEstado.entrySet()){
            System.out.println("Estado: " + estados.getKey() + ", População: " + estados.getValue().getPopulacao());
        }
        System.out.println();
        meuEstado.put("PE", new Estados(6000.00));
        for (Map.Entry<String, Estados> estados : meuEstado.entrySet()){
            System.out.println("Estado: " + estados.getKey() + ", População: " + estados.getValue().getPopulacao());
        }

        System.out.println();
        System.out.println("Verificando se o estado da paraiba está na coleção, se não incluir.");
        if(meuEstado.containsKey("PB")){
            System.out.println(meuEstado.containsKey("PB"));
        }else{
            double popul = 600.000;
            meuEstado.put("PB", new Estados(popul));
        }
        for (Map.Entry<String, Estados> estados : meuEstado.entrySet()){
            System.out.println("Estado: " + estados.getKey() + ", População: " + estados.getValue().getPopulacao());
        }

        System.out.println();
        System.out.println("Ordem alfabetica");
        Set<Map.Entry<String, Estados>> set1 = new TreeSet<>(new OrdemNome());
        set1.addAll(meuEstado.entrySet());
        for (Map.Entry<String, Estados> x : set1){
            System.out.println("Estado: " + x.getKey() + ", População: " + x.getValue().getPopulacao());
        }
    }
}
class Estados {
    private double populacao;

    public Estados() {
    }

    public Estados(Double populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "{" +
                "estados='" + populacao + '\'' +
                '}';
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estados estados = (Estados) o;
        return Double.compare(estados.populacao, populacao) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(populacao);
    }
}
class OrdemNome implements Comparator<Map.Entry<String, Estados>>{

    @Override
    public int compare(Map.Entry<String, Estados> o1, Map.Entry<String, Estados> o2) {
        return o1.getKey().compareToIgnoreCase(o2.getKey());
    }

}
