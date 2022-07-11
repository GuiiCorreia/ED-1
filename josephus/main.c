#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <time.h>

typedef struct soldado SLista;

struct soldado {
	char nome[20];
	int num;
	SLista* prox;
};


SLista* cria_soldado(char* nome, int numero);
SLista* remove_soldado(SLista* lista, SLista* soldado);

SLista* inicializa();
int verificaCircVazio(SLista* lista);
SLista* insereSoldadoNoCirc(SLista* lista, char* nome, int num);
void imprimeSoldadosCirc(SLista* lista);
int verificaQteSoldados(SLista* lista);
SLista* executaJosephus(SLista* lista, int quantidade);

int main(void) {

	srand(time(0));

	
	int i;
	SLista* listax = inicializa();

	
	char nomes[5][20] = { "Joaozin", "Leozin", "Guilhermao", "Rafinha", "Felipin" };

	
	for (i = 0; i < 5; i++)
		listax = insereSoldadoNoCirc(listax, nomes[i], (i+1));

	
	int quantidade = verificaQteSoldados(listax);
	
	listax = executaJosephus(listax, quantidade);

	printf("\nSoldado a executar a tarefa:\n");
	imprimeSoldadosCirc(listax);

	return EXIT_SUCCESS;
}


SLista* cria_soldado(char* nome, int numero) {

	
	SLista* soldado = (SLista*)malloc(sizeof(SLista));

	
	soldado->num = numero;
	strcpy(soldado->nome, nome);
	soldado->prox = soldado;

	return soldado;
}

SLista* remove_soldado(SLista* lista, SLista* soldado) {

	SLista* aux = lista;

	
	if (soldado == aux && soldado->prox == aux) {
		lista = inicializa();

	
	} else if (soldado == aux) {
		lista = soldado->prox;

		do {
			aux = aux->prox;
		} while (aux->prox->prox != lista);

		aux->prox = lista;

	
	} else {
		do {
			if (aux->prox == soldado) {
				aux->prox = soldado->prox;
				break;
			}

			aux = aux->prox;

		} while (aux->prox != lista);
	}

	
	free(soldado);

	
	return lista;
}

SLista* executaJosephus(SLista* lista, int quantidade) {

	int i, num_soldado, num_iteracoes;

	
	if (verificaCircVazio(lista)) {
		printf("\n[-] Ops! Círculo esta vazio.\n");
		return lista;
	}

	if (quantidade == 1) {
		printf("\n[!] Soldado escolhido: %s\n", lista->nome);
		return lista;
	}

	num_iteracoes = rand() % 20;
	num_soldado = rand() % quantidade;

	SLista* aux = lista;

	printf("Quantidade de soldados: %d\n\n", quantidade);

	imprimeSoldadosCirc(lista);

	printf("\nSorteando o soldado para iniciar a contagem...\nSorteado %da posição.\n", num_soldado + 1);

	for (i = 0; i < num_soldado; i++)
		aux = aux->prox;

	printf("Soldado inicial: %s\nNum. de iterações na adedanha: %d\n", aux->nome, num_iteracoes);

	for (i = 0; i < num_iteracoes; i++)
		aux = aux->prox;

	printf("Soldado eliminado: %s\n", aux->nome);
	lista = remove_soldado(lista, aux);

	printf("\n-----------------------------------------\n");

	return executaJosephus(lista, quantidade - 1);
}

SLista* insereSoldadoNoCirc(SLista* lista, char* nome, int num) {


	SLista* soldado = cria_soldado(nome, num);

	if (!verificaCircVazio(lista)) {
		SLista* aux = lista;

		while (aux->prox != lista)
			aux = aux->prox;

		aux->prox = soldado;
		soldado->prox = lista;
	}

	return soldado;
}

void imprimeSoldadosCirc(SLista* lista) {

	SLista* aux = lista;

	if ( !verificaCircVazio(lista) ) {
		do {
			printf("[Num. %d] %s [%p]->[%p]\n", aux->num, aux->nome, aux, aux->prox);
			aux = aux->prox;

		} while (aux != lista);
	}
}

SLista* inicializa() {
	return NULL;
}

int verificaCircVazio(SLista* lista) {
	return !lista;
}

int verificaQteSoldados(SLista* lista) {
	int qtd = 0;
	SLista* aux = lista;

	if ( !verificaCircVazio(lista) ) {
		qtd++;
		while (aux->prox != lista) {
			qtd++;
			aux = aux->prox;
		}
	}
	return qtd;
}