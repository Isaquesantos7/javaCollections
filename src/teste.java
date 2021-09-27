import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fatorial = n;
        while (n > 1) {
            fatorial = fatorial * (n - 1);
            n--;
        }
        System.out.println(fatorial);
    }
}


