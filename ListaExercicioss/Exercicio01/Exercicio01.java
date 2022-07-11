import java.util.Stack;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Stack<Character> pilha = new Stack<Character>();

        Stack<Character> modificar = new Stack<Character>();

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Escreva uma frase:");

            String frase = sc.nextLine();

            StringBuilder mov1 = new StringBuilder();

            StringBuilder mov2 = new StringBuilder();

            for (int i = 0; i < frase.length(); i++) {

                pilha.push(frase.charAt(i));

                if ((frase.charAt(i) != ' ') && (frase.charAt(i) != '.')
                        && (frase.charAt(i) != '-')) {

                    mov2.append(frase.charAt(i));

                }

            }

            System.out.println("\nA) texto invertido:");

            while (!pilha.empty()) {

                if ((pilha.peek() != ' ') && (pilha.peek() != '.')
                        && (pilha.peek() != '-')) {

                    System.out.print(pilha.peek());

                    modificar.push(pilha.pop());

                    mov1.append(modificar.pop());
                }

                else if (pilha.peek() == ' ') {

                    System.out.print(' ');

                    pilha.pop();

                }

                else if (pilha.peek() == '.') {

                    System.out.print('.');

                    pilha.pop();

                }

                else if (pilha.peek() == '-') {

                    System.out.print('-');

                    pilha.pop();

                }

            }

            System.out.println("\n");

            if (mov1.compareTo(mov2) == 0) {

                System.out.println("B) A frase e um palindromo!");

            } else {

                System.out.println("B) A frase nao e um palindromo!");

            }

        }

    }

}
