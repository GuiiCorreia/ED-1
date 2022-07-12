package imparPaar;

import java.util.Scanner;

public class imparpaar {
    public static void main(String[] args) {

        Pilha par = new Pilha();
        Pilha impar = new Pilha();
        int nPar = 0;
        int nImpar = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um numero entre -127 e 128 (0 para finalizar):");
            int num = sc.nextInt();
            if (num == 0) {
                while (true) {
                    Object desempilhado = par.Pop();

                    if (desempilhado == null) {
                        System.out.println("Pilha par vazia");
                        break;
                    } else {
                        System.out.println("Desempilha: " + desempilhado);
                        nPar--;
                    }
                    desempilhado = impar.Pop();

                    if (desempilhado == null) {
                        System.out.println("Pilha impar vazia");
                        break;
                    } else {
                        System.out.println("Desempilha: " + desempilhado);
                        nImpar--;
                    }
                }
                break;

            } else if (num % 2 == 0) {
                System.out.println("Numero par, empilha em par: " + num);
                par.Push(num);
                nPar++;
            } else {
                System.out.println("Numero impar, empilha em impar: " + num);
                impar.Push(num);
                nImpar++;
            }
        }
        sc.close();
        if (!par.vazio()) {
            System.out.println("A pilha Par ainda possui " + nPar + " Elementos que sao:");
            while (!par.vazio()) {
                System.out.println(par.Pop());
            }
        } else {
            System.out.println("A pilha Impar ainda possui " + nImpar + " Elementos que sao:");
            while (!impar.vazio()) {
                System.out.println(impar.Pop());
            }
        }
    }
}