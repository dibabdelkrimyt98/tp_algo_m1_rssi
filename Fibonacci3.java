import java.util.Scanner;

public class Fibonacci3 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Donner vontre N: ");
            int n = scanner.nextInt();
            scanner.close();
            long tempsDebut = System.currentTimeMillis();
            System.out.println(" Le dernier terme est : " + fibonacci(n) + " :) ");

            long tempsFin = System.currentTimeMillis();

            long duration = tempsFin - tempsDebut;
            System.out.println("Durée d'exécution : " + duration + " ms");
    }
    
}
