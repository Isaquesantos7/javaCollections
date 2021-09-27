package list;
import java.util.List;
import java.util.ArrayList;
public class list2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        int x = 0;
        while(x <= 100){
            number.add(x);
            x++;
        }

        for(Integer i: number){
            System.out.println(i);
        }

        System.out.println("posição do numero 55: " + number.indexOf(55));
        System.out.println("Contém o numero 100? " + number.contains(100));
        //System.out.println(number.toString());
        System.out.println();
        System.out.println(number.set(5, 1000));
        int sum = 0;
        for(int i = 0; i < number.size(); i++){
            sum = sum + i;
        }
        System.out.println("A soma: " + sum);
        System.out.println("Alterando: " + number.toString());
    }
}
