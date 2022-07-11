package Exercicio08;

import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {

        Pilha P = new Pilha();
        Pilha N = new Pilha();

        for (int i = 0; i < 1000; i++) {
            int numero = Sorteio(-100, 100);
            if (numero < 0) {
                N.Push(numero);
            } else if (numero > 0) {
                P.Push(numero);
            } else {
                System.out.println("Pilha N: " + N.Pop() + "\nPilha P: " + P.Pop() + "\n");
            }
        }
    }

    public static int Sorteio(int valorMinimo, int valorMaximo) {
        Random random = new Random();
        return random.nextInt((valorMaximo - valorMinimo) + 1) + valorMinimo;
    }
}
