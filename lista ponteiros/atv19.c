#include <stdio.h>

 int maximo, repet;

 
maximo = 0;

repet = 0;

 
void
verificacao (int *elementos, int num_elem)
{
  
maximo = elementos[0];
  
int j = 0;
  
 
for (j = 0; j <= num_elem; j++)
    {
      
 
if (maximo <= elementos[j])
	{
	  
 
maximo == elementos[j];
	
}
      
 
for (j = 0; j <= num_elem; j++)
	{
	  
 
if (maximo == elementos[j])
	    {
	      
 
repet++;
	    
 
}
	
}
    
}

 
}


 
int
main ()
{
  
 
int N;
  
int i = 0;
  
 
printf ("Ola, digite a quantidade de N numeros para sua lista:\n");
  
scanf ("%d", &N);
  
 
int lista[N];
  
 
for (i = 0; i < N; i++)
    {
      
 
printf ("Digite o numero %d:\n", i + 1);
      
scanf ("%d", &lista[i]);
    
 
}
  
 
verificacao (lista, N);
  
 
printf ("O maior numero da lista eh %d e o mesmo se repete %d vezes",
	     maximo, repet);
  
 
 
 
 
 
return 0;

}
