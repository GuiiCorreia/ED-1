//
// Created by Guilherme on 2021/08/29.
//




void digitar(No *pilha){
    printf("\n\tPILHA\n");
    while(pilha){
        printf("\t%c\n", pilha->caracteres);
        pilha = pilha->proximo;
    }
    printf("\tFIM PILHA\n\n");
}



int formas_parenteses(char x[]){
    int i = 0;
    No *remover, *pilha = NULL;

    while(x[i] != '\0'){
        if(x[i] == '(' ){
            pilha = empilhar(pilha, x[i]);
            digitar(pilha);
        }
        else if(x[i] == ')'){
            remover = desempilhar(&pilha);
        }
        i++;
    }
    digitar(pilha);
    if(pilha){
        printf("\tOs parenteses estao errados\n");
        return 1;
    }
    else{
        printf("\tOs parenteses estao certos\n");
        return 0;
    }
}










