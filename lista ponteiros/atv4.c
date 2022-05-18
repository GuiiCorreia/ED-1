#include <stdio.h>

//O argc (argument count) C) um inteiro e possui o nC:mero de argumentos com os quais 
//a funC'C#o main() foi chamada na linha de comando. O argv (argument values) C) um vetor 
//de strings. Cada string deste vetor C) um dos parC"metros da linha de comando. C	 para 
//saber quantos elementos temos em argv que temos argc.
  
int
main (int argc, char const *argv[])
{
  
 
int *a;
  
int *b;
  
int temp;
  
 
printf ("Informe o valor de A:");
  
scanf ("%d", a);
  
printf ("Informe o valor de B:");
  
scanf ("%d", b);
  
 
printf ("\nA = %d\nB = %d", *a, *b);
  
 
temp = *a;
  
*a = *b;
  
*b = temp;
  
 
printf ("\n A = %d\nB = %d", *a, *b);
  
 
return 0;

}
