import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<Carro> carros = new ArrayList<>();

    void insercao(Carro c) {
        this.carros.add(c);
    }

    Carro remove() {
        return this.carros.remove(0);
    }

    boolean taVazia() {
        return this.carros.isEmpty();
    }

    int size() {
        return carros.size();
    }

    Carro getCarros(int index) {
        return carros.get(index);
    }

    List<Carro> enviarLista() {
        return carros;

    }
}