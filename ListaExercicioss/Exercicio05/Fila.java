package Exercicio05;

import java.util.ArrayList;

import java.util.List;

public class Fila {

    List<Integer> Fila = new ArrayList<>();

    public void push(int numero) {

        Fila.add(numero);

    }

    public int pop() {

        int remove = Fila.get(0);

        Fila.remove(0);

        return remove;

    }

    public boolean empty() {

        return Fila.isEmpty();

    }

    public int tamanhoFila() {

        return Fila.size();

    }

    public boolean procurarNaFila(int valor) {

        return Fila.contains(valor);

    }

}