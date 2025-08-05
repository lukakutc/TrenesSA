package TrenesSA.Estructuras.LISTA.test;

import TrenesSA.Estructuras.LISTA.estructuras.Lista;

public class TestLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println(lista.toString());

        System.out.println("coloco 3 veces elementos en la primer posicion");
        lista.insertar(3, 1);
        lista.insertar(2,1);
        lista.insertar(1,1);
        System.out.println("si el resultado es [1,2,3] esta bien");
        System.out.println("lista: "+lista.toString());
        System.out.println("inserto en posicion segunda y ultima para probar intermedias");
        lista.insertar(4, 2);
        lista.insertar(5 ,4);
        System.out.println("Salida esperaada: [1,4,2,5,3]");
        System.out.println("lista: "+lista.toString());

        lista.insertar(6, 5);
        lista.insertar(7,6);

        System.out.println("Inserto en final de lista, salida esperada: [1,4,2,3,5,6,7]");
        System.out.println("Lista: "+lista.toString());
        
        System.out.println("ahora elimino elemento de posicion 2");
        lista.eliminar(2);
        System.out.println("Lista esperada: [1,2,3,5,6,7]");
        System.out.println("Lista: "+lista.toString());
        
        System.out.println("elimino ultimo elemento: "+lista.toString());
        lista.eliminar(6);
        System.out.println("Lista esperada: [1,2,3,5,6]");
        System.out.println("Lista: "+lista.toString());
        
        System.out.println("Elimino primer elemento.");
        lista.eliminar(1);
        System.out.println("lista esperada: [2,3,5,6]");
        System.out.println("Lista: "+lista.toString());
        System.out.println("Elimino anteultimo elemento: ");
        lista.eliminar(3);
        System.out.println("Lista esperada: [2,3,6]");
        System.out.println("Lista: "+lista.toString());
    }
}
