import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {

    public static void main(String[] args) {

        Stack<String> p1 = new Stack<String>();

        Stack<String> p2 = new Stack<String>();

        Stack<String> p3 = new Stack<String>();

        try (Scanner sc = new Scanner(System.in)) {

            p1.push("carro");

            p1.push("moto");

            p1.push("camionete");

            p1.push("caminhao");

            p1.push("lancha");

            p1.push("bicicleta");

            p1.push("barco");

            while (!p1.empty()) {

                p2.push(p1.peek());

                p3.push(p1.pop());

            }

            System.out.println("Digite o elemento que deseja remover: ");

            String chaveC = sc.nextLine();

            System.out.println("\np1 antes de remover o elemento: ");

            while (!p2.empty()) {

                System.out.print(p2.pop() + ' ');

            }

            System.out.println();

            System.out.println("\np1 depois de remover o elemento: ");

            while (!p3.empty()) {

                if (p3.peek().equals(chaveC)) {

                    p3.pop();

                } else {

                    System.out.print(p3.pop() + ' ');

                }

            }

        }

        System.out.println();

    }

}