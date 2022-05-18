#include <stdio.h>

 int calculo (a, b, c);

int
main (void) 
{
  
int a = 10, b = 17, c = 0;
  
printf ("\nvalor A: %i", a);
  
printf ("\nvalor B: %i", b);
  
 
printf ("\n\nCHAMANDO FUNCAO\n\n");
  
calculo (a, b, c);
  
return 0;

}


int
calculo (a, b, c)
{
  
a = a * 2;
  
b = b * 2;
  
c = a + b;
  
printf ("quadrado de a: %d \nquadrado de b: %d \nresult soma: %d", a, b,
	   c);
  
return 0;

}
