package Exercicio07;

import java.util.Random;

public class Exercicio07 {

    public static void main(String[] args) {

        Fila fila = new Fila();

        Random aleatorio = new Random();

        Fila inversao = new Fila();

        for (int i = 0; i < 20; i++) {

            fila.push(aleatorio.nextInt());

        }

        System.out.println("Fila normal:");

        while (!fila.empty()) {

            inversao.push(fila.peek());

            System.out.println(fila.pop());

        }

        inversao.inverterFila();

        System.out.println("\nFila invertida:");

        while (!inversao.empty()) {

            System.out.println(inversao.pop());

        }

    }

}