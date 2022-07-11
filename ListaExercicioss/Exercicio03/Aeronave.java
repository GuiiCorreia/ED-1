package Exercicio03;

public class Aeronave {

    private String nome;
    private int numeroIdentificador;

    public Aeronave(String nome, int numeroIdentificador) {
        this.nome = nome;
        this.numeroIdentificador = numeroIdentificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
}
