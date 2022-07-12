package hospital;

import java.util.ArrayList;
import java.util.Random;

public class est_hospital {
    Logi inicio = null;
    int tamanho = 0;

    public void inserirInicio(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        logi logi = new logi(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        logi.proximo = inicio;
        inicio = logi;
        tamanho++;
    }

    public logi retirarInicio(){
        if (inicio == null) {
            return null;
        }
        logi aux = inicio;
        inicio = inicio.proximo;
        tamanho--;
        return aux;
    }

    public void inserirFim(int id, String sexo, int idade,  boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        logi logi = new logi(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        if (inicio == null) {
            logi.proximo = null;
            inicio = logi;
        }else{
            logi local = inicio;
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = logi;
            logi.proximo = null;
        }
        tamanho++;
    }

    public logi retirarFim(){
        if (inicio == null) {
            return null;
        }
        logi local = inicio;
        while (local.proximo != null){
            logi aux = local;
            local = local.proximo;
            if (local.proximo == null) {
                aux.proximo = null;
                tamanho--;
                return local;
            }
        }
        inicio = null;
        tamanho--;
        return null;
    }

    public void inserirIndice(int indice, int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        if (indice <= 0) {
            inserirInicio(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        }else if(indice >= tamanho){
            inserirFim(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        }else{
            logi local = inicio;
            for (int i = 0; i < indice - 1; i++) {
                local = local.proximo;
            }
            logi logi  = new logi(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
            logi.proximo = local.proximo;
            local.proximo = logi;
            tamanho++;
        }
    }
    public logi selecionarIndice(int indice){
        logi local = inicio;
        for (int i = 0; i < indice - 1; i++) {
            local = local.proximo;
        }
        return local;
    }

    public logi retirarIndice(int indice){
        if (indice < 0 || indice >= tamanho || inicio == null){
            return null;
        }else if (indice == 0) {
            return retirarInicio();
        }else if(indice == tamanho -1){
            return retirarFim();
        }
        logi local = inicio;
        for (int i = 0; i < indice-1; i++) {
            local = local.proximo;
        }
        local.proximo = local.proximo.proximo;
        return local;
    }
    public String toString(){
        String str = "";
        logi local  = inicio;
        while (local != null) {
            str += "\nID: "+ local.id+
            //        " Sexo: "+ local.sexo+
            //        " Idade: "+ local.idade+
            //        " Gestante: "+ local.gestante+
            //        " Lactante: "+ local.lactante+
                //    " Necessidades Especiais: "+ local.necessidadeEspecial+
                   "\nNivel de prioridade: "+ local.prioridade;
            local = local.proximo; 
        }
        return str;
    }
    public static void main(String [] args){
        est_hospital naoAtendidas = new est_hospital();
        est_hospital atendidas = new est_hospital();
        Random gerador = new Random();
        ArrayList<String> sexos = new ArrayList<String>();
        sexos.add("Masculilogi");
        sexos.add("Feminilogi");
        int id = 1;
        for (int i = 0; i < 10; i++) {
                for(int h = 0; h < 5; h++){
                    String sexo = sexos.get(gerador.nextInt(2));
                    int idade = gerador.nextInt(59)+1;
                    naoAtendidas.inserirInicio(id, sexo, idade, false, false, false, 0);
                    id++;
                }
                for(int h = 0; h < 3; h++){
                    String sexo = sexos.get(gerador.nextInt(2));
                    int idade = gerador.nextInt(60)+60;
                    naoAtendidas.inserirInicio(id, sexo, idade, false, false, false, 1);
                    id++;
                }
                String sexo = sexos.get(gerador.nextInt(2));
                int idade = gerador.nextInt(59)+1;
                naoAtendidas.inserirInicio(id, sexo, idade, false, false, true, 2);
                id++;
                sexo = sexos.get(1);
                idade = gerador.nextInt(41)+8;
                naoAtendidas.inserirInicio(id, sexo, idade, true, true, false, 3);
                id++;
                naoAtendidas = ordenar(naoAtendidas);
                for (int f = 0; f <= i ; f++) {
                    logi atendido = naoAtendidas.retirarInicio();
                    atendidas.inserirFim(atendido.id, atendido.sexo, atendido.idade, atendido.gestante, atendido.lactante, atendido.necessidadeEspecial, atendido.prioridade);
                }
            } 
            
        System.out.println("Pessoas atendidas: =========="+ atendidas); 
        System.out.println("Pessoas não atendidas: =============="+ naoAtendidas);     
    }
    public static est_hospital ordenar(est_hospital naoAtendidas){
        if (naoAtendidas.tamanho > 1) {
            for (int k = 1; k < naoAtendidas.tamanho; k++) {
                if (naoAtendidas.selecionarIndice(k).prioridade >
                    naoAtendidas.selecionarIndice(k - 1).prioridade ) {
                    logi aux = new logi();
                    logi aux2 = new logi();
                    aux = naoAtendidas.selecionarIndice(k-1);
                    aux2 = naoAtendidas.selecionarIndice(k);
                    naoAtendidas.inserirIndice(k-1, aux2.id, aux2.sexo, aux2.idade, aux2.gestante, aux2.lactante, aux2.necessidadeEspecial, aux2.prioridade);
                    naoAtendidas.inserirIndice(k, aux.id, aux.sexo, aux.idade, aux.gestante, aux.lactante, aux.necessidadeEspecial, aux.prioridade);
                    naoAtendidas.retirarIndice(k-1);
                    naoAtendidas.retirarIndice(k-1);
                    return naoAtendidas;
                }
            }
        }
        return naoAtendidas;
    }
}