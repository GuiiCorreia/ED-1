#include <stdio.h>
#include <stdlib.h>

 void
fracc (float num, int *x, float *y)
{
  
*x = (int) num;
  
*y = num - *x;

} 
 
int

main () 
{
  
float num, frac;
  
int inteira;
  
 
scanf ("%f", &num);
  
 
fracc (num, &inteira, &frac);
  
 
printf ("%f: %i e %f", num, inteira, frac);
  
 
return 0;

}
