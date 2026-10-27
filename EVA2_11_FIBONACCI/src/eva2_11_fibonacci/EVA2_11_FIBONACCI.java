package eva2_11_fibonacci;

/**
 *
 * @author diegd
 */
public class EVA2_11_FIBONACCI {

    public static void main(String[] args) {
        System.out.println("Fibonacci(0 =)" + fibonacciRecu(0));
        System.out.println("Fibonacci(4) = " + fibonacciRecu(4));
        System.out.println("Fibonacci(7) = " + fibonacciRecu(7));
        System.out.println("Fibonacci(11) =" + fibonacciRecu(11));
        System.out.println("Fibonacci(13) =" + fibonacciRecu(13));
    }

    public static int fibonacciRecu(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return fibonacciRecu(numero - 2) + fibonacciRecu(numero - 1);
        }
    }

}
