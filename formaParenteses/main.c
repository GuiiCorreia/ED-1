#include <stdio.h>
#include <stdlib.h>
#include "no.h"
#include "forma_parenteses.h"


int main(){
    char parenteses[50];

    printf("\tDigite uma sequencia de parenteses: ");
    scanf("%49[^\n]", parenteses);
    printf("\nExpressao: %s\nRetorno: %d\n", parenteses, formas_parenteses(parenteses));
}

// correto: (  (  )  )  –  (  (  ) (  )  )  –  (  )  (  )
// errado: ) (  –  (  (  )  (  –  )  )  (  (