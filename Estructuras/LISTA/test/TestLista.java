package TrenesSA.Estructuras.LISTA.test;

import TrenesSA.Estructuras.LISTA.estructuras.Lista;

public class TestLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println(lista.toString());

        lista.insertar(1, 1);
        System.out.println(lista.toString());
        lista.insertar(2, 2);
        System.out.println(lista.toString());
        lista.insertar(3, 3);
        System.out.println(lista.toString());
    }
}
