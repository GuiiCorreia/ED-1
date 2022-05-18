#include <stdio.h>
#include <conio.h>
#include <math.h>

#define PI 3.14
  // achei essa solução mais eficiente 
float
Volume (float raio)
{
  
float v = 4 / 3 * (PI * pow (raio, 3));
  
return v;

}


 
int
main ()
{
  
float Raio, Resultado;
  
 
printf ("Digite o raio de uma esfera para calcular o seu volume:");
  
scanf ("%f", &Raio);
  
 
Resultado = Volume (Raio);
  
printf ("%.3f\n", Resultado);
  
 
getchar ();
  
return 0;

}
