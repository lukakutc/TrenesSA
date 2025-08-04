package TrenesSA.Estructuras.LISTA.estructuras;

public class Lista {
    //atributos
    private int longitud;
    private Nodo cabecera;

    
    //metodos
    //constructor
    public Lista(){
        cabecera = null;
        longitud = 0;
    }

    public boolean esVacia(){
        return longitud==0;
    }

    public boolean insertar(Object elemento, int posicion){
        boolean exito = false;
        if(posicion >=1 && posicion <= longitud+1){ //inserto si estoy en el rango adecuado, que es al principio, en medio, o al final de la lista
            exito = true;
            longitud++;
            //se puede insertar. 2 casos. 
            //inserto al principio: creo nodo y su enlace es el primer nodo de la lista original
            if(posicion==1){
                Nodo nodo = new Nodo(elemento, cabecera); //enlazo nuevo nodo con frente anterior
                cabecera = nodo;
            }else{ //inserto en pos distinta de 1
                //Tengo que recorrer hasta encontrar el nodo ANTERIOR a la posicion. asi lo coloco inmediatamente despues de ese
                Nodo aux = cabecera;
                int posActual = 1;
                while(posActual != posicion-1){ //mientras no este en el nodo anterior al requerido repito
                    aux = aux.getEnlace();
                    posActual++;
                }
                //cuando llego a la posicion requerida (posicion-1)
                Nodo nuevo = new Nodo(elemento, aux.getEnlace()); //al nuevo nodo le conecto el resto derecho de la lista
                aux.setEnlace(nuevo); //enlazo el nodo anterior al nuevo con el nuevo, que ya tiene enlazada toda la nueva lista
            }
        }
        return exito;
    }

    public String toString(){
        String s;
        if(longitud==0){
            s = "Lista vacia";
        }else{
            s = "[";

            Nodo aux = cabecera;
            s = s + aux.getElemento().toString();
            //mostramos el elemento y pasamos al siguiente
            while(aux.getEnlace()!=null){
                aux = aux.getEnlace();
                s = s + aux.getElemento().toString();
            }
            s = "]";
        }
        

        return s;
    }

}
