import java.util.Scanner;

public class Fatorial {
    public static long calcularFatorial(long num) {
        long factorial = 1;
        for (long i = 1 ; i<=num ; i++) {
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long result = calcularFatorial(num);    
        System.out.println(result);
        scanner.close();
    }

}