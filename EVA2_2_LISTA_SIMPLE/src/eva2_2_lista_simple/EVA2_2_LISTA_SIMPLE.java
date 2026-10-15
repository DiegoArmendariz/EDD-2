package eva2_2_lista_simple;

/**
 *
 * @author diegd
 */
public class EVA2_2_LISTA_SIMPLE {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        /*
        Lista.agregar(100);
        Lista.agregar(200);
        Lista.agregar(300);
        Lista.agregar(400);
        Lista.agregar(500);
        //Imprimir?
        Lista.imprimir(); */

        //==============================================================================
        /* int[] arreglo = new int[1000000];
        long ini, fin, tiempo;
        ini = System.nanoTime();//Tomamos la "Hora" antes de empenzar
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        fin = System.nanoTime();//tomamos la "Hora" Despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);
        
        ini = System.nanoTime();//Tomamos la "Hora" antes de empenzar
        for (int i = 0; i < arreglo.length; i++) {
            Lista.agregar((int) (Math.random() * 100));
        }
        fin = System.nanoTime();//tomamos la "Hora" Despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo); */
        //===============================================================================
        System.out.println("Tamano de lista: " + lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println("Tamano de lista: " + lista.longitud());
        //lista.Vaciarlista();
        lista.imprimir();;
        System.out.println("Tamano de lista: " + lista.longitud());

        System.out.println("\nValor en posicion 2: " + lista.valorEn(2));

        System.out.println("Posicion del 400: " + lista.encontrar(400));

        lista.insertarAt(250, 2);

        System.out.println("\nDespues de insertar 250 en posicion 2:");
        lista.imprimir();
        System.out.println("Tamano: " + lista.longitud());

        lista.borrarEn(3);

        System.out.println("\nDespues de borrar posicion 3:");
        lista.imprimir();
        System.out.println("Tamano: " + lista.longitud());

        System.out.println("\nImpresion inversa:");
        lista.imprimirInversa();

        lista.Vaciarlista();

        System.out.println("\nDespues de vaciar la lista:");
        lista.imprimir();
        System.out.println("Tamano: " + lista.longitud());

        System.out.println("Lista vacia? " + lista.ListaVacia());
    }
}
