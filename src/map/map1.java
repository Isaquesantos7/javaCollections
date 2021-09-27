package map;
import java.util.*;

public class map1 {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        System.out.println("----\tDicionarios de carros\t----");
        Map<String, Double> meusCarros = new HashMap<>(){{
            put("Gol", 15.6);
            put("Uno", 13.0);
            put("Mobi", 14.0);
            put("Hb20", 13.0);
            put("Kwid", 15.6);
            put("Lancer", 8.9);
            put("Camaro", 10.9);
        }};

        System.out.println(meusCarros.toString());

        System.out.println();
        System.out.println("----\tSubstituindo o consumo do Gol por 15.2\t----");
        meusCarros.put("Gol", 15.6);
        System.out.println(meusCarros);

        System.out.println();
        System.out.println("----\tConferindo se o modelo Tucson esta no dicionario:\t----");
        System.out.println(meusCarros.containsKey("Tucson"));

        System.out.println();
        System.out.println("----\tExibindo o consumo do Uno:\t----");
        System.out.println(meusCarros.get("Uno"));


        System.out.println();
        System.out.println("----\tExibindo os modelos\t----");
        System.out.println(meusCarros.keySet());

        System.out.println();
        System.out.println("----\tExibindo os consumos dos carros\t----");
        System.out.println(meusCarros.values());

        System.out.println();
        System.out.println("----\tExibindo o modelo mais economico e seu consumo\t----");
        Double comsumoMaisEficiente = Collections.max(meusCarros.values());
        Set<Map.Entry<String, Double>> entries = meusCarros.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry:entries){
            if (entry.getValue().equals(comsumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " +comsumoMaisEficiente);
            }
        }

        System.out.println();
        System.out.println("----\tExibindo o modelo menos eficiente e seu consumo\t----");
        Double consumoMenosEficiente = Collections.min(meusCarros.values());
        Set<Map.Entry<String, Double>> entries1 = meusCarros.entrySet();
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry1:entries1){
            if(entry1.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry1.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println();
        System.out.println("----\tExibindo a soma dos consumos\t----");
        double somando = 0;
        Set<Map.Entry<String, Double>> soma = meusCarros.entrySet();
        for(Map.Entry<String, Double> x : soma){
            somando += x.getValue();
        }
        System.out.println("A soma dos consumos: " + somando);

        System.out.println();
        System.out.println("----\tExibindo a media dos consumos\t----");
        double mediando = 0;
        Set<Map.Entry<String, Double>> media = meusCarros.entrySet();
        for(Map.Entry<String, Double> i : media){
            mediando = mediando + i.getValue() / media.size();
        }
        System.out.printf("A media das somas dos consumos é: %.1f" , mediando);

        System.out.println();
        System.out.println();
        System.out.println("----\tRemovendo os modelos que o consumo for igual a 15.6\t----");
        Iterator<Double> iterator = meusCarros.values().iterator();
        while(iterator.hasNext()){
            double x = iterator.next();
            if (x == 15.6){
                iterator.remove();
            }
        }
        System.out.println(meusCarros.toString());

        System.out.println();
        System.out.println("----\tExibindo os caros na ordem que foram informados\t----");
        Map<String, Double> meuscarros1 = new LinkedHashMap<>(){{
            put("Gol", 15.6);
            put("Uno", 13.0);
            put("Mobi", 14.0);
            put("Hb20", 13.0);
            put("Kwid", 15.6);
            put("Lancer", 8.9);
            put("Camaro", 10.9);
        }};
        System.out.println(meuscarros1);

        System.out.println();
        System.out.println("----\tExibindo o dicionario ordenado pelo modelo\t----");
        Map<String, Double> meuscarros2 = new TreeMap<>(){{
            put("Gol", 15.6);
            put("Uno", 13.0);
            put("Mobi", 14.0);
            put("Hb20", 13.0);
            put("Kwid", 15.6);
            put("Lancer", 8.9);
            put("Camaro", 10.9);
        }};
        System.out.println(meuscarros2.toString());

        System.out.println();
        System.out.println("----\tLimpando o dicionario\t----");
        meuscarros2.clear();
        System.out.println(meuscarros2.toString());

        System.out.println();
        System.out.println("----\tVerificando se o dicionario esta limpo\t----");
        System.out.println( meuscarros2.isEmpty());

    }
}

