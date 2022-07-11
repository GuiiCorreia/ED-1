package Exercicio05;

import java.util.Random;

import java.util.Stack;

public class Exercicio05 {

    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();

        Fila fila = new Fila();

        Random aleatorio = new Random();

        int i = 0;

        while (i < 1000) {

            int random = aleatorio.nextInt();

            if (!fila.procurarNaFila(random)) {

                fila.push(random);

            } else {

                pilha.push(random);

            }

            i++;

        }

        i = 0;

        System.out.println("Fila: ");

        while (!fila.empty()) {

            System.out.println(i + ". " + fila.pop());

            i++;

        }

        i = 0;

        System.out.println("\nPilha: ");

        while (!pilha.empty()) {

            System.out.println(i + ". " + pilha.pop());

            i++;

        }

    }

}