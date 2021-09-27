package list.exec;
import list.exec.entities.Temp;
import list.exec.entities.enums.Months;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Temp> tempList = new ArrayList<>(){{}};

        int n = 1;
        System.out.println("Digit the 6 first Month and the temperature: ");
        while (n < 6){
            System.out.print("Month: ");
            Months months = Months.valueOf(scan.next());
            System.out.print("Temperature: ");
            double temp = scan.nextDouble();
            tempList.add(new Temp(months, temp));
            n++;
        }
        double media = 0;
        for (Temp x : tempList){
            media += x.getTemp() / tempList.size();
            System.out.println(x);

        }
        System.out.println();
        System.out.println("Temperature Media: " + media);
        System.out.println();
        System.out.println("Months above average: ");
        for(Temp i : tempList){
            if(i.getTemp() > media){
                System.out.println(i);
            }
        }


        scan.close();
    }
}
