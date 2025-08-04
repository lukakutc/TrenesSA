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

        System.out.println("Inserto en final de lista, salida esperada: [1,4,2,3,5,6,7]");
        lista.insertar(5, 5);
        lista.insertar(6, 6);
        lista.insertar(7,7);

    }
}
