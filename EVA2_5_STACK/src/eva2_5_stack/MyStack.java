package eva2_5_stack;

/**
 *
 * @author diegd
 */
public class MyStack {

    private Nodo fin;
    private Nodo inicio;
    private int lon;

    public int valorEn(int posicion) throws RuntimeException {
        //excepcion
        //VALIDAR posicion
        //1 que posicion son validas? De 0 (cero) a N - 1 (N es la cantidad de nodos)
        //O(??)
        int tama = longitud();
        if (posicion >= 0 && posicion < tama) { //POSICION VALIDA
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();

            }
            return temp.getValor();
        } else {
            throw new RuntimeException("La posicion " + posicion + " no es valida");
        }

    }

    public boolean ListaVacia() {
        Nodo temp = inicio;
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Vaciarlista() {
        inicio = null;
        fin = null;
        lon = 0;
    }

    public int longitud() {
        return lon;

    }

    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    public void imprimirInv() {
        Nodo temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
        // Y LUEGO?
        if (inicio == null) {//LISTA VACIA? VERDAD
            inicio = nuevo;//nuevo es el primer nodo de la lista
            fin = nuevo;
        } else {//lista con nodos
            fin.setSiguiente(nuevo);
            //conectar previo
            nuevo.Setprevio(fin);
            fin = nuevo;
        }
        lon++;
    }

    public void insertarAt(int valor, int posicion) {
        if (posicion < 0 || posicion > longitud()) {
            throw new RuntimeException("La posicion " + posicion + " no es valida");
        }

        Nodo nuevo = new Nodo(valor);

        // Insertar al inicio
        if (posicion == 0) {
            nuevo.setSiguiente(inicio);

            if (inicio != null) {
                inicio.setSiguiente(nuevo);
            }

            inicio = nuevo;

            if (fin == null) {
                fin = nuevo;
            }

            return;
        }

        // Buscar nodo anterior a la posición
        Nodo temp = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }

        Nodo siguiente = temp.getSiguiente();

        // Enlaces hacia adelante
        nuevo.setSiguiente(siguiente);
        temp.setSiguiente(nuevo);

        // Enlaces hacia atrás
        nuevo.Setprevio(temp);

        if (siguiente != null) {
            siguiente.Setprevio(nuevo);
        } else {
            // Si se insertó al final
            fin = nuevo;
        }
    }

    public void borrarEn(int posicion) {

        // Verificar si la lista está vacía
        if (inicio == null) {
            throw new RuntimeException("No se puede borrar: la lista está vacía");
        }

        int tama = longitud();

        // Validar posición
        if (posicion < 0 || posicion >= tama) {
            throw new RuntimeException("La posición " + posicion + " no es válida");
        }

        // Solo hay un nodo
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } // Borrar el primer nodo
        else if (posicion == 0) {
            inicio = inicio.getSiguiente();
            inicio.Setprevio(null);
        } // Borrar cualquier otra posición
        else {

            Nodo temp = inicio;

            // Llegar al nodo que se va a borrar
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }

            Nodo anterior = temp.getPrevio();
            Nodo siguiente = temp.getSiguiente();

            // Reconectar hacia delante
            anterior.setSiguiente(siguiente);

            // Reconectar hacia atrás
            if (siguiente != null) {
                siguiente.Setprevio(anterior);
            } else {
                // Si se eliminó el último nodo
                fin = anterior;
            }
        }

        lon--;
    }

    // ========================================
    // STACK ---> LIFO
    // ULTIMO EN LLEGAR, PRIMERO EN SALIR
    // ========================================
    // AGREGA AL TOPE DE LA PILA
    // O(1)
    public void push(int valor) {
        insertarAt(valor, 0);
    }

    // LEE EL TOPE SIN BORRARLO
    // O(1)
    public int peek() {
        if (ListaVacia()) {
            throw new RuntimeException("No se puede leer: la lista esta vacia");
        }

        return valorEn(0);
    }

    // LEE EL TOPE Y DESPUES LO BORRA
    // O(1)
    public int pop() {
        if (ListaVacia()) {
            throw new RuntimeException("No se puede borrar: la lista esta vacia");
        }
        int valor = valorEn(0);
        borrarEn(0);
        return valor;
    }
}
