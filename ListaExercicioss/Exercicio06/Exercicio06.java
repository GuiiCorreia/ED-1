package Exercicio06;

import java.util.Random;

import java.util.Stack;

public class Exercicio06 {

    public static void main(String[] args) {

        Fila fila = new Fila();

        Stack<Integer> pilha = new Stack<>();

        Random aleatorio = new Random();

        int i = 0;

        while (i < 1000) {

            int random = aleatorio.nextInt();

            if (random >= 0) {

                fila.push(random);

                i++;

            }

        }

        i = 0;

        while (i < 1000) {

            int random = aleatorio.nextInt();

            if (random < 0) {

                fila.push(random);

                i++;

            }

        }

        i = 0;

        while (!fila.empty()) {

            if (fila.peek() > 0) {

                pilha.push(fila.pop());

            } else {

                System.out.println(i + ". " + pilha.pop());

                i++;

                fila.pop();

            }

        }

    }

}