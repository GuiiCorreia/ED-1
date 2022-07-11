//
// Created by Guilherme on 2021/08/29.
//

#ifndef UNTITLED5_NO_H
#define UNTITLED5_NO_H

#endif //UNTITLED5_NO_H



typedef struct no{
    char caracteres;
    struct no *proximo;
}No;

No* empilhar(No *pilha, char valor){
    No *novo = malloc(sizeof(No));

    if(novo){
        novo->caracteres = valor;
        novo->proximo = pilha;
        return novo;
    }
    else
        printf("\tErro ao alocar memoria!\n");
    return NULL;
}

No* desempilhar(No **pilha){
    No *remover = NULL;

    if(*pilha){
        remover = *pilha;
        *pilha = remover->proximo;
    }
    else
        printf("\tPilha vazia\n");
    return remover;
}

