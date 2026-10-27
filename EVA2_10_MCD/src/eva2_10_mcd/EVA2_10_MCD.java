package eva2_10_mcd;

/**
 *
 * @author diegd
 */
public class EVA2_10_MCD {

    public static void main(String[] args) {

        System.out.println("MCD con recursividad:");
        System.out.println(maximoDiviRecu(180, 48));
    }

    public static int maximoDiviRecu(int valor1, int valor2) {
        // CASO BASE:
        // SI EL RESIDUO YA LLEGO A 0,
        // TERMINA LA RECURSIVIDAD
        if (valor2 == 0) {
            return valor1;
        } else {
            // SE LLAMA A SI MISMO
            return maximoDiviRecu(valor2, valor1 % valor2);
        }
    }

}
