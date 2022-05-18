#include <stdio.h>

 int
teste (int *num1, int *num2)
{
  
 
int aux;
  
 
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
  
 
printf ("Digite 1 valor: ");
  
scanf ("%d", &num1);
  
 
printf ("Digite 2 valor: ");
  
scanf ("%d", &num2);
  
 
teste (&num1, &num2);
  
 
printf ("\nMaior valor: %d", num1);
  
printf ("\nMenor valor: %d", num2);
  
 
return 0;

}
