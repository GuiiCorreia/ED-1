package Exercicio04;

import java.util.Random;

import java.util.Stack;

public class Exercicio04 {

    public static void main(String[] args) {

        Fila fila01 = new Fila();

        Stack<Integer> pilha = new Stack<>();

        Fila fila02 = new Fila();

        Random random = new Random();

        byte i = 0;

        while (fila01.tamanhoFila() < 100) {

            fila01.push(random.nextInt(100));

        }

        while (!fila01.empty()) {

            pilha.push(fila01.pop());

            fila02.push(pilha.pop());

        }

        while (!fila02.empty()) {

            System.out.println(i + ". " + fila02.pop());

            i++;

        }

    }

}
