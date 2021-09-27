package stream;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ExecStreamAPI {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "3", "2", "4", "6", "5" ,"8","7", "9", "10");

        //numbers.stream().forEach(new Consumer<String>() {
        //    @Override
        //    public void accept(String s) {
        //        System.out.println(s);
        //    }
        // });
        //numbers.stream().forEach(s -> System.out.println(s));
        //numbers.forEach(s -> System.out.println(s));
        numbers.stream().forEach(System.out::println);

        System.out.println();
        System.out.println("Pegando os 5 primeiros numeros: ");
        numbers.stream()
                .limit(5)
                .collect(Collectors.toSet());
        for (String x: numbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
        ) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("Transformando de String para iteiros: ");

        List<Integer> numberList = numbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (Integer x : numberList
              ) {
            System.out.println(x);
        }

    }
}
