#include <stdio.h> 
#include <stdlib.h>
#define MAX 5

 void
preencheVetor (char *vetor, char elemento)
{
  
int i = 0;
  
 
while (i < MAX)
    {
      
*vetor = elemento;
      
vetor++;
      
i++;
      
elemento++;
    
}

}


 
void
imprimeVetor (char *vetor)
{
  
int i;
  
 
for (i = 0; i < MAX; i++)
    
printf ("\n[%d]: %c", (i + 1), *(vetor + i));

}


 
int
main ()
{
  
char vetor[MAX], elemento = 'a';
  
 
preencheVetor (vetor, elemento);
  
imprimeVetor (vetor);
  
 
putchar ('\n');
  
 
return 0;

}
