package eva2_1_referencia;

/**
 *
 * @author diegd
 */
public class EVA2_1_REFERENCIA {

    public static void main(String[] args) {
        Ejemplo inicio = new Ejemplo();
        inicio.valor = 100;
        System.out.println("Inicio= " + inicio);
        System.out.println("Inicio.valor= " + inicio.valor);
        System.out.println("Inicio.otro= " + inicio.otro);
        //CREAR LISTA
        inicio.otro = new Ejemplo();
        inicio.otro.valor = 200;//segundo objeto
        inicio.otro.otro = new Ejemplo();
        inicio.otro.otro.valor = 300;
        inicio.otro.otro.otro = new Ejemplo();
        inicio.otro.otro.otro.valor = 400;

        Ejemplo sig = inicio;
        while (sig != null) {
            System.out.println("[" + sig.valor + "]");
            sig = sig.otro;
        }
    }
}

class Ejemplo {

    int valor;
    Ejemplo otro;
}
