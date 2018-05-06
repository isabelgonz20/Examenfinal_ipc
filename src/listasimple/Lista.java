package listasimple;

public class Lista {
    //punteros para saber donde esta el inicio y fin
    protected Nodo inicio,fin;
    protected int tam=0;
    //inicializacion de inicio y fin
    public Lista(){
        inicio=fin=null;
    }
    //metodo para saber si la lista esta vacia o no
    public boolean estaVacia(){
        return inicio==null;
    }
    public void setTam(int tam){
        this.tam=tam;
    }
    public int getTam(){
        return tam;
    }
    //metodo agregar al inicio
    public void agregarAlInicio(Object dato,String nombre){
        //creando al Nodo
        inicio= new Nodo(dato,inicio,nombre);
        tam+=1;
        if(fin==null){
            fin=inicio;
            
        }
    }
    public void agregarAlFinal(Object dato,String nombre){
            tam+=1;
            if(!estaVacia()){
                fin=fin.siguiente=new Nodo(dato,nombre);
            }else{
                inicio=fin=new Nodo(dato,nombre);
            }
        
    }
    //metodo para mostrar Lista
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+","+recorrer.nombre+"]--->");
            recorrer = recorrer.siguiente;
            
        }
        
    }
    //metodo para eliminar nodo del inicio
    public Object removerDelInicio(){
        tam-=1;
        Object dato= inicio.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return dato;
    }
    public Object removerDelFinal(){
        tam-=1;
        Object dato = fin.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            Nodo temporal = inicio;
            while(temporal.siguiente!=fin){
                temporal=temporal.siguiente;
            }
            fin=temporal;
            fin.siguiente=null;
        }
        return dato;
    }
    //Metodo para buscar nodos de forma numerica
    public void buscarNodo(Object dato){
        Nodo recorrer = inicio;
        while(recorrer != null){
            if(recorrer.dato==dato){
                System.out.println(recorrer.dato+","+recorrer.nombre);
                break; //break es para que se detenga sino se vuelve infinito.
            }else{
                recorrer = recorrer.siguiente;
            }
        }

    }

}
