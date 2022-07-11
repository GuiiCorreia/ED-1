package Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<Aeronave> fila = new ArrayList<>();

    public void aguarda(Aeronave a) {
        fila.add(a);
    }

    public void decola() {
        fila.remove(0);
    }

    public int numAviao() {
        return fila.size();
    }

    public void listaAviao() {
        for (int i = 0; i < fila.size() - 1; i++) {
            Aeronave av = fila.get(i);
            System.out.println(av.getNome());
        }
    }

    public void verPrimeiro() {
        Aeronave av = fila.get(0);
        System.out.println("Aeronave: " + av.getNome() + "\nNumero de identificacao: " + av.getNumeroIdentificador());
    }

    public Aeronave pegarPrimeiro() {
        Aeronave av = fila.get(0);
        return av;
    }
}