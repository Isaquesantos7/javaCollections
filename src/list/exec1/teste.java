package list.exec1;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class test {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Responda com (S/N)");
        System.out.print("1): Telefonou para a vitima? ");
        String telefonou = scan.next();
        list.add(telefonou.toLowerCase());
        System.out.print("2): Esteve no local do crime? ");
        String esteve = scan.next();
        list.add(esteve.toLowerCase());
        System.out.print("3): Mora perto da vitima? ");
        String mora = scan.next();
        list.add(mora.toLowerCase());
        System.out.print("4): Devia para a vitima? ");
        String devia = scan.next();
        list.add(devia.toLowerCase());
        System.out.print("5): Ja trabalhou com a vitima? ");
        String trabalhou = scan.next();
        list.add(trabalhou.toLowerCase());

        System.out.println();
        System.out.println(list);

        int count = 0;
        Iterator<String> contador = list.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")){
                count++;
            }
        }
        switch(count){
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Sera investigado!");
                break;
            case 5:
                System.out.println("Assassino!");
                break;
            default:
                System.out.println("Inocente!");
        }

        scan.close();
    }
}
