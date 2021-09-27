package list;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class list1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String name1 = "Isaque Santos pinto";
        String name2 = "Edicleide Santos Pinto";
        String name3 = "Abigail Santos Pinto";
        String name4 = "Eliseu Santos Pinto";
        String name5 = "Rosalvo Souza Pinto";
        String name6 = "Cleidiane Santos Pinto";

        List<String> list = new ArrayList<>();

        //add
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        list.add(name5);
        list.add(name6);

        //remove
        list.remove(2);
        String search = list.stream().filter(x -> x == name5).findFirst().orElse(null);
        list.remove(search);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        linked();
    }
    public static void linked(){
        List<String> list = new LinkedList<>();
        String name1 = "Isaque Santos pinto";
        String name2 = "Edicleide Santos Pinto";
        String name3 = "Abigail Santos Pinto";
        String name4 = "Eliseu Santos Pinto";
        String name5 = "Rosalvo Souza Pinto";
        String name6 = "Cleidiane Santos Pinto";

        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        list.add(name5);
        list.add(name6);

        list.remove(name6);
        String search = list.stream().filter(x -> x == name5).findFirst().orElse(null);
        list.remove(search);

        for(String i : list) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(list.indexOf(name3));
    }
}
