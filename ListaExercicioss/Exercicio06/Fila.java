package Exercicio06;

import java.util.ArrayList;

import java.util.List;

public class Fila {

    List<Integer> fila = new ArrayList<>();

    public void push(int num) {

        fila.add(num);

    }

    public int pop() {

        int removido = fila.get(0);

        fila.remove(0);

        return removido;

    }

    public boolean empty() {

        return fila.isEmpty();

    }

    public int tamanhofila() {

        return fila.size();

    }

    public boolean procurarNafila(int valor) {

        return fila.contains(valor);

    }

    public int peek() {

        return fila.get(0);

    }

    public void validar(int nextInt) {

    }
}
