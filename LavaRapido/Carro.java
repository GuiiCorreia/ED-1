public class Carro implements Comparable<Carro> {

    private String dono;
    private String marca;
    private int placa;

    public Carro(String dono, String marca, int placa) {
        this.dono = dono;
        this.marca = marca;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\nDono:" + this.dono + "\nMarca:" + this.marca + "\nPlaca: " + this.placa;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    @Override
    public int compareTo(Carro c) {
        if (this.placa > c.getPlaca()) {
            return 1;
        } else if (this.placa < c.getPlaca()) {
            return -1;
        }
        return 0;
    }
}