import java.util.Scanner;

public class Fibonacci3 {
    public static int fibonacci(int n, int a, int b) {

        if (n == 0)
            return a;
        
        if (n == 1) 
            return b;
        return fibonacci(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Donner vontre N: ");
            int n = scanner.nextInt();
            scanner.close();
            long tempsDebut = System.currentTimeMillis();
            int resultat = fibonacci(n, 1, 1);
            System.out.println(" Le dernier terme est : " + resultat + " :) ");

            long tempsFin = System.currentTimeMillis();

            long duration = tempsFin - tempsDebut;
            System.out.println("Durée d'exécution : " + duration + " ms");
    }
    
}
