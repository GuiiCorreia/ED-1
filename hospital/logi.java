package hospital;

public class logi {
    int id;
    String sexo;
    int idade;
    boolean gestante;
    boolean lactante;
    boolean necessidadeEspecial;
    int prioridade = 0;
    logi proximo;
    public logi() {}
    public logi(int id, String sexo, int idade, boolean gestante,
        boolean lactante, boolean necessidadeEspecial, int prioridade) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = prioridade;
    }
}
