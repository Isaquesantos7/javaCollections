package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class list3 {
    public static void main(String []args){
        List<Double> list = new ArrayList<Double>();
        double n = 0;
        double sum = 0;
        while(n < 50){
            list.add(n);
            n+= 1;
        }

        System.out.println(list.toString());
        System.out.println("The smallest: " + Collections.min(list));
        System.out.println("The biggest: " + Collections.max(list));

        double media = 0;
        for (int i = 0; i < list.size(); i++){
            sum += i;
            media = sum / list.size();
        }


        System.out.println("The sum: " + sum);
        System.out.println("The media: " + media);
        list.remove(0);
        System.out.println();
        for (Double x : list){
            System.out.println(x);
        }

        System.out.println();
        System.out.println("the note smaller than 7: ");
        Iterator<Double> iterator = list.iterator();
        while(iterator.hasNext()){
            double i = iterator.next();
            if(i < 7) System.out.println(i);
        }

        list.clear();
        for(Double x : list){
            System.out.println("Clear the list: ");
        }
        System.out.println("Clear the list: " + list.isEmpty());
        list.toString();

    }
}
