package Exercicio04;

import java.util.ArrayList;

import java.util.List;

public class Fila {

    List<Integer> Fila = new ArrayList<>();

    public void push(int numero) {

        Fila.add(numero);

    }

    public int pop() {

        int removido = Fila.get(0);

        Fila.remove(0);

        return removido;

    }

    public boolean empty() {

        return Fila.isEmpty();

    }

    public int tamanhoFila() {

        return Fila.size();

    }

}