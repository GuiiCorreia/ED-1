#include <stdio.h>

#include <stdlib.h>
  
int
compara_valores (int *num1, int *num2) 
 
{
 
 
int aux = 0;
  
if (*num2 > *num1)
    
    {
      
 
aux = *num2;
      
 
*num2 = *num1;
      
 
*num1 = aux;
    
 
}

 
}


 
int
main () 
 
{
  
 
 
 
int num1, num2;
  
 
 
num1 = num2 = 0;
  
 
 
 
printf ("\n\n INFORME O VALOR 1: ");
  
 
fflush (stdin);
  
 
scanf ("%d", &num1);
  
 
printf ("\n\n INFORME O VALOR 2: ");
  
 
fflush (stdin);
  
 
scanf ("%d", &num2);
  
 
 
 
compara_valores (&num1, &num2);
  
 
 
 
printf ("\n\n MAIOR VALOR: %d", num1);
  
 
printf ("\n\n MENOR VALOR: %d", num2);
  
 
printf ("\n\n");
  
 
return 0;

 
}
