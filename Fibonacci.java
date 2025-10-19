import java.util.Scanner; 

public class Fibonacci {
    int n = 0;
    long fibTab[];
    
    public Fibonacci(int n) {
        this.n = n;
        fibTab = new long [n+1];
        fibTab[0] = 1;
        if (n >= 1) {
            fibTab[1] = 1;
            for(int i=2; i<=n; i++) {
                fibTab[i] = fibTab[i-1] + fibTab[i-2];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        Fibonacci fib = new Fibonacci(n);
        System.out.println("Fibonacci series up to " + n + ":");
        for(int i=0; i<=n; i++) {
            System.out.print(fib.fibTab[i] + " ");
        }
        scanner.close();
    }
}