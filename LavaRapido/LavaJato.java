import java.util.Scanner;
import java.util.Collections;

public class LavaJato {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Fila fila = new Fila();
        Fila filaLavado = new Fila();

        String nome, marca;
        int placa;

        int opt, cont = 0;
        boolean desliga = true;

        while (desliga) {
            System.out.println("    Lava Jato    ");
            System.out.println("1 - Adiciona carro");
            System.out.println("2 - Carros Sujos");
            System.out.println("3 - Carrps Limpos");
            System.out.println("4 - Fechar");

            System.out.print("Digite: ");
            opt = scan.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Registrar");

                    System.out.println("Nome do Dono:");
                    nome = scan.next();

                    System.out.println("Marca do Carro:");
                    marca = scan.next();

                    System.out.println("Numero da placa (id):");
                    placa = scan.nextInt();

                    fila.insercao(new Carro(nome, marca, placa));
                    System.out.println("Registro Concluido");
                    cont++;

                    if (cont == 3) {
                        Carro auxiliar = fila.remove();
                        filaLavado.insercao(auxiliar);
                        cont = 0;

                        System.out.println("Carro Lavado");
                        System.out.println(auxiliar.toString());
                    }
                    break;
                case 2:
                    System.out.println("Carros Sujos");
                    if (fila.taVazia()) {
                        System.out.println("Nao tem carro sujo");
                    } else {
                        Collections.sort(fila.enviarLista());
                        for (int z = 0; z < fila.size(); z++) {
                            System.out.println(fila.getCarros(z).toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Carros Limpos");
                    if (filaLavado.taVazia()) {
                        System.out.println("Nao tem carros limpos");
                    } else {
                        Collections.sort(filaLavado.enviarLista());
                        for (int z = 0; z < filaLavado.size(); z++) {
                            System.out.println(filaLavado.getCarros(z).toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Desliga");
                    desliga = false;
                    break;
            }
        }
        scan.close();
    }
}
