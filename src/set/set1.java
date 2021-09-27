package set;
import java.util.*;

class set1 {
    public static void main(String []args){
        Set<Double> notas = new HashSet<>();
        double n = 0.0;
        while (n < 10){n++; notas.add(n);}

        System.out.println(notas.toString());
        System.out.println();
        System.out.println("smaller value: " + Collections.min(notas));
        System.out.println("Bigger value: " + Collections.max(notas));
        System.out.println();
        System.out.println("Nota contains 5.0? " + notas.contains(5.0));
        System.out.println();
        Iterator<Double> cont = notas.iterator();
        double i = 0.0;
        while(cont.hasNext()){
            double next = cont.next();
            i += next;
        }
        System.out.println("The sum every elements: " + i);

        System.out.println();
        double media = 0.0;
        /*
        double mediaA = 0.0;
        for(int a = 0; a <= notas.size(); a++){
            media += a;
            mediaA = media / notas.size();
        }

         */


        Iterator<Double> cont1 = notas.iterator();
        while(cont1.hasNext()){
            double next = cont1.next();
            media = media + next / notas.size();
        }

        System.out.println("The media: " + media);
        //System.out.println("The media: " + mediaA);
        System.out.println();

        //removing with Iterator
        System.out.println("Removing elements smaller than 7: ");
        Iterator<Double>cont2 = notas.iterator();
        while(cont2.hasNext()){
            double next = cont2.next();
            if(next < 7){
                cont2.remove();
            }
        }

        System.out.println(notas.toString());

        System.out.println();
        Set<Double> notas2 = new HashSet<>(Arrays.asList(5d, 6.5, 7d, 8d, 9.9, 10d));
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3.toString());
    }
}
