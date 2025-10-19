    import java.util.Scanner;

    public class Fibonacci2 {

        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Donner vontre N: ");
            int n = scanner.nextInt();
            scanner.close();
            long tempsDebut = System.currentTimeMillis();
            calculerEtAfficherFibonacci(n);

            long tempsFin = System.currentTimeMillis();

            long duration = tempsFin - tempsDebut;
            System.out.println("Durée d'exécution : " + duration + " ms");

        }

        public static void calculerEtAfficherFibonacci(int n) {
            long fib0 = 1;
            long fib1 = 1;
           
            System.out.println("Suite de Fibonacci jusqu'à " + n + " termes :");

            for (int i = 2; i <= n; i++) {
                
                    fib1 = fib0 + fib1; 
                    fib0 = fib1 - fib0;
                
            }
            System.out.print(" Le dernier terme est : " + fib1 + " :) ");
            System.out.println(); 
        }
        
    }
