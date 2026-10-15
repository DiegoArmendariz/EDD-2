package eva2_2_lista_simple;

/**
 *
 * @author diegd
 */
public class ListaSimple {

    private Nodo inicio;
    private Nodo fin;
    private int lon;

    public ListaSimple() {
        inicio = null;//al crear la lista, se crea vacia
        fin = null;
    }

    //SIEMPRE SE AGREGA AL FINAL DE LA LISTA
    //VERSION 1: O(N) --> SE AGREGA AL FINAL. SE RECORREN TODOS
    //VERSION MEJORADA: 0(1) --> 
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
        // Y LUEGO?
        if (inicio == null) {//LISTA VACIA? VERDAD
            inicio = nuevo;//nuevo es el primer nodo de la lista
            fin = nuevo;
        } else {//lista con nodos
            //movernos al final
            /*  Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente
            }
            temp.setSiguiente(nuevo);//conecto nuevo al final de la lista*/

            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        lon++;
    }

    //o(n)
    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }

    //0(n) a O(1)
    public int longitud() {
        return lon;
        /*int cont = 0;
        Nodo temp = inicio;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
         */
    }

    //0(1)
    public boolean ListaVacia() {
        Nodo temp = inicio;
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //0(1)
    public void Vaciarlista() {
        inicio = null;
        fin = null;
        lon = 0;
    }

    //VALIDAR: posicion tenga un valor valido
    //trows
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

    //REGRESA LA PRIMER APARICIÓN DEL VALOR EN LA LISTA
    //REGRESA LA POSICIÓN
    //O()??
    public int encontrar(int valor) {
        Nodo temp = inicio; // Empezamos en la cabeza
        int posicion = 0;

        // Recorremos la cadena nodo por nodo
        while (temp != null) {
            if (temp.getValor() == valor) {
                return posicion; // Se encontró, regresamos su índice actual
            }
            temp = temp.getSiguiente();
            posicion++;
        }

        // Si el ciclo termina y jamás se activó el return de arriba, 
        // el valor no existe, así que regresamos -1
        return -1;
    }

    //Inserta un valor en una posicion dada
    public void insertarAt(int valor, int posicion) {
        if (posicion < 0 || posicion > longitud()) {
            throw new RuntimeException("La posicion " + posicion + " no es valida");
        }
        Nodo nuevo = new Nodo(valor);

        // Inserta al inicio
        if (posicion == 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

            if (fin == null) {
                fin = nuevo;
            }
        }
        Nodo temp = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        nuevo.setSiguiente(temp.getSiguiente());
        temp.setSiguiente(nuevo);

        if (nuevo.getSiguiente() == null) {
            fin = nuevo;
        }

    }

    public void borrarEn(int posicion) {
        //VER SI LA LISTA ESTA VACIA
        if (inicio == null) {
            throw new RuntimeException("No se puede borrar: la lista esta vacia");
        }
        int tama = longitud();

        // VALIDACION DE POSICIONES
        if (posicion < 0 || posicion >= tama) {
            throw new RuntimeException("La posicion " + posicion + " no es valida!!!");
        }

        //SI SOLO EXISTE UN NODO
        if (inicio == fin) {
            inicio = null;
            fin = null;
            //BORRAR EL PRIMER NODO

        } else if (posicion == 0) {
            inicio = inicio.getSiguiente();

            //BORRAR CUALQUIER OTRA POSICION
        } else {
            Nodo temp = inicio;
            //LLEGAR AL NODO ANTERIOR AL QUE BORRAR
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            //NODO QUE SE VA A BORRAR
            Nodo borrar = temp.getSiguiente();

            //RECONECTAMOS CON EL NODO QUE SIGUE
            temp.setSiguiente(borrar.getSiguiente());

            //SI BORRAOS EL ULTIMO NODO, ACTUALIZAMOS FIN
            if (borrar == fin) {
                fin = temp;

            }
        }
        lon--;
    }

    public void imprimirInversa() {
        int tam = longitud();

        for (int i = tam - 1; i >= 0; i--) {
            Nodo temp = inicio;
            for (int j = 0; j < i; j++) {
                temp = temp.getSiguiente();
            }
            System.out.println("[" + temp.getValor() + "]");
        }
        
    }
}
