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

        //insertar tiene 3 posibildades: insertar  en rango invalido, devuelve false
        //insertar en rango valido (de 2 a longitud+1)
        //insertar en primera lista
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
                Nodo nodo = new Nodo(elemento, aux.getEnlace()); //al nuevo nodo le conecto el resto derecho de la lista
                aux.setEnlace(nodo); //enlazo el nodo anterior al nuevo con el nuevo, que ya tiene enlazada toda la nueva lista
            }
        }
        return exito;
    }

    public String toString(){
        //pensalo y lo haces de vuelta.
        //si lista vacia devuelvo eso, sino devuelvo la lista.
        // se devuevle [ ... ] asi que antes de empezar bucke --> [ y luego de bucle --< ]
        //me paro en cabecera y pongo el elemento. avanzo al siguiente. me fijo si es nulo, (while nodo !=null)
        String s;
        if(longitud==0){
            s = "Lista vacia";
        }else{
            s ="[";

            Nodo aux = cabecera;
            while(aux!=null){
                s += aux.getElemento().toString();
                if(aux.getEnlace()!=null){
                    s+=", "; //si hay mas elementos escribo, sino no escribo.
                }
                aux = aux.getEnlace();
            }
            s += "]";
        }
        return s;
    }

    //vamos con eliminar. que casos hay?
    //1. eliminar primera posicion (cabecera = cabecera.getEnlace());
    //2. eliminar cualq otra posicion (1<pos<=longitud)
    //3. posicion invalida. (pos < 1 || pos > longitud)
    public boolean eliminar(int pos){
        boolean exito = false;
        //no se puede eliminar.
        if(pos>=1 && pos <= longitud){
            //se puede eliminar
            exito = true;
            longitud--;
            if(pos==1){
                cabecera = cabecera.getEnlace(); //si es un solo elemento el enlace sera nulo, la lista queda vacia.
            }else{
                //otro caso que no sea primer posicion
                //me paro en la posicion anterior, y reconecto con el enlace del elemento a eliminar.
                Nodo aux = cabecera;
                int posActual = 1;
                while(posActual != pos-1){
                    posActual++;
                    aux = aux.getEnlace();
                }
                //cuando llego al nodo anterior al de la posicion, lo enlazo con el enlace del nodo a eliminar (lo salteo)
                aux.setEnlace(aux.getEnlace().getEnlace());
                // que pasa cuando elimino ultima posicion? por ejemplo 4. me paro en 3, y le enlazo el enlace de 4 (nulo), esta bien.
            }
        }
        return exito;
    }
}
