#include <stdio.h>

 int 
main () 
{
  
 
int i = 5;
  
 
int *ponteiroint = &i;
  
 
 
float f = 2.8;
  
 
float *ponteirofloat = &f;
  
 
 
char c = 'a';
  
 
char *ponteirochar = &c;
  
 
 
*ponteiroint = 7;
  
 
*ponteirofloat = 1.2;
  
 
*ponteirochar = 'b';
  
 
 
printf ("Inteiro %i ", *ponteiroint);
  
 
printf ("\nReal %f", *ponteirofloat);
  
 
printf ("\nChar %c", *ponteirochar);

 
 
} 

