package application;

import java.util.ArrayList;
import java.util.List;

public class lista {
    public static void main(String[] args) {
        // necessario importar util.list e Arraylist
        List<String> lista = new ArrayList<>(); // inicializando lista, não aceita tipos primitivos

        lista.add("Maria"); // adicionar elementos na lista
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Ana");
        lista.add(2, "Marco"); // adicionar elementos lista em determinada posicao

        System.out.println(lista.size()); // ver tamanho da lista

        System.out.println("Index of Bob: " + lista.indexOf("Bob")); // Procurar elemento na lista.

        /*
         * lista.remove("Ana"); // Lista é capaz de comprar e remover o dado que é
         * escrito
         * lista.remove(1); // remove tal elemento da posicao dada
         */

        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("---------------------------");
        String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
