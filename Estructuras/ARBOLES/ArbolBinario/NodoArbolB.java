package TrenesSA.Estructuras.ARBOLES.ArbolBinario;

public class NodoArbolB{ //declaradcion del TDA
    //atributos
    private Object elemento; //el elemento que almacena el nodo
    //enlace a hijo izquierdo e hijo derecho
    private NodoArbolB izquierdo;
    private NodoArbolB derecho;
    

    //metodos
    public boolean setIzquierdo(Object elemento){
        this.izquierdo = elemento;
    }

    public NodoArbolB getIzquierdo(){
        return izquierdo;
    }
    public NodoArbolB getDerecho(){
        return derecho;
    }

    public void setElem(Object elemento){
        this.elemento = elemento;
    }

    public Object getElem(){
        return elemento;
    }

    
} 