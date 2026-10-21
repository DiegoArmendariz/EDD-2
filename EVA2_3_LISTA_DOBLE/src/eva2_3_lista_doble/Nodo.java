package eva2_3_lista_doble;

/**
 *
 * @author diegd
 */
public class Nodo {

    private int valor;
    private Nodo siguiente;
    private Nodo previo = null;

    //CONTRUCTORES
    public Nodo() {
        siguiente = null;//ESTO ES MUY IMPORTANTE
    }

    public Nodo(int valor) {//PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = valor;
        siguiente = null;
    }

    public void setValor(int valor) {//CREACION DE LOS set y get
        this.valor = valor;

    }

    public int getValor() {
        return valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void Setprevio(Nodo previo) {
        this.previo = previo;
    }
    public Nodo getPrevio(){
        return previo;
    }
}
