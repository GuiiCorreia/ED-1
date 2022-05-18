#include<stdio.h>

 int
soma (int *a, int b) 
{
  
*a = *a + b;

} 
 
int

main () 
{
  
int n1, n2;
  
printf ("Digite o numero 1 e numero 2:\n");
  
scanf ("%i %i", &n1, &n2);
  
soma (&n1, n2);
  
printf ("Numero 1 = %i, Numero 2 = %i", n1, n2);

}
