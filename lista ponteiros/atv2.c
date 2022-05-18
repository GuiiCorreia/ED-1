#include <stdio.h>

 int
main () 
{
  
int k, z;
  
 
printf ("Digite o primeiro numero: ");
  
scanf ("%i", &k);
  
printf ("Digite o segundo numero: ");
  
scanf ("%i", &z);
  
 
if (&k > &z)
    {
      
printf ("o primeiro numero tem o maior endereco de memoria\n");
      
return;
    
}
  
printf ("o segundo numero tem o maior endereco de memoria\n");

 
}
