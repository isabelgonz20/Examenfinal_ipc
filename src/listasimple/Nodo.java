package listasimple;

public class Nodo {
    public Object dato;
    public Nodo siguiente;
    String nombre;
    //constructor insertar al final
    public Nodo(Object dato,String nombre){
        this.dato=dato;
        this.siguiente=null;
        this.nombre=nombre;
    }
    //constructor insertar al inicio
    public Nodo(Object dato, Nodo siguiente,String nombre){
        this.dato=dato;
        this.siguiente=siguiente;
        this.nombre=nombre;
    }
}
