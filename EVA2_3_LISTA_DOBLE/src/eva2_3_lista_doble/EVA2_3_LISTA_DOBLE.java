package eva2_3_lista_doble;

/**
 *
 * @author diegd
 */
public class EVA2_3_LISTA_DOBLE {

    
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        lista.imprimirInv();
        
        
        lista.insertarAt(258, 2);
        lista.imprimir();
        System.out.println("Tamano: " + lista.longitud());
        
        
        lista.borrarEn(3);
        lista.imprimir();
        System.out.println("Tamanp: " + lista.longitud());
    }
}
