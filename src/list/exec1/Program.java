package list.exec1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Responda com (S/N)");
        System.out.print("1): Telefonou para a vitima? ");
        String telefonou = scan.next();
        list.add(telefonou);
        System.out.print("2): Esteve no local do crime? ");
        String esteve = scan.next();
        list.add(esteve);
        System.out.print("3): Mora perto da vitima? ");
        String mora = scan.next();
        list.add(mora);
        System.out.print("4): Devia para a vitima? ");
        String devia = scan.next();
        list.add(devia);
        System.out.print("5): Ja trabalhou com a vitima? ");
        String trabalhou = scan.next();
        list.add(trabalhou);

        System.out.println(list);

        int count = 0;
        Iterator<String> contador = list.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("S")){
                count++;
            }
        }
        switch (count){
            case 2:
                System.out.println("----\tSuspeita!\t----");
                break;
            case 3:
            case 4:
                System.out.println("\tCumplice!\t");
                break;
            case 5:
                System.out.println("\tAssasina!\t");
                break;
            default:
                System.out.println("\tInocente!\t");
        }
        scan.close();
    }

}
