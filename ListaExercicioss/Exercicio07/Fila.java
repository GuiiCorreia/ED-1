package Exercicio07;

import java.util.ArrayList;

import java.util.List;

import java.util.Stack;

public class Fila {

    private List<Integer> fila = new ArrayList<>();

    private Stack<Integer> inverter = new Stack<>();

    public void push(int numero) {

        fila.add(numero);

    }

    public int pop() {

        int removido = fila.get(0);

        fila.remove(0);

        return removido;

    }

    public boolean empty() {

        return fila.isEmpty();

    }

    public int tamanhoFila() {

        return fila.size();

    }

    public boolean procurarNaFila(int valor) {

        return fila.contains(valor);

    }

    public int peek() {

        return fila.get(0);

    }

    public void inverterFila() {

        while (!fila.isEmpty()) {

            inverter.push(fila.get(0));

            fila.remove(0);

        }

        while (!inverter.empty()) {

            fila.add(inverter.pop());

        }

    }

}
