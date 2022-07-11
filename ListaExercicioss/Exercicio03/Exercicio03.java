package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        boolean funcionando = true;

        try (Scanner sc = new Scanner(System.in)) {

            Aeronave aero1 = new Aeronave("Aero1", 1);

            Aeronave aero2 = new Aeronave("Aero2", 2);

            Aeronave aero3 = new Aeronave("Aero3", 3);

            Aeronave aero4 = new Aeronave("Aero4", 4);

            Aeronave aero5 = new Aeronave("Aero5", 5);

            Aeronave aero6 = new Aeronave("Aero6", 6);

            Aeronave aero7 = new Aeronave("Aero7", 7);

            Fila fila = new Fila();

            fila.aguarda(aero1);

            fila.aguarda(aero2);

            fila.aguarda(aero3);

            fila.aguarda(aero4);

            fila.aguarda(aero5);

            fila.aguarda(aero6);

            while (funcionando) {

                System.out.println("Qual operaC'C#o deseja realizar?");

                System.out.println("(1) Listar numero de avioes \n(2) Autorizar decolagem \n" +
                        "(3) Adicionar a fila de aguarda \n(4) Listar todos os avioes \n"
                        + "(5) Mostrar dados do primeiro Aeronave\n(0) Parar o programa");

                byte opt = sc.nextByte();

                if (opt == 0) {

                    funcionando = false;

                } else if (opt == 1) {

                    System.out.println("O numero de avioes na fila C): " +
                            fila.numAviao());

                } else if (opt == 2) {

                    Aeronave av = fila.pegarPrimeiro();

                    fila.decola();

                    System.out.println("O Aeronave " + av.getNome());

                } else if (opt == 3) {

                    fila.aguarda(aero7);

                    System.out.println("Aeronave adicionado a lista de aguarda!");

                } else if (opt == 4) {

                    fila.listaAviao();

                } else if (opt == 5) {

                    fila.verPrimeiro();

                }

            }

        }

    }

}