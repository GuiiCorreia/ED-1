#include<stdio.h>

 int
negativos (int n, float *vet)
{
  
for (int i = 1; i <= 20; i++)
    {
      
if (vet[i] < 0)
	{
	  
n++;
	
}
    
}
  
return n;

}


 
int
main ()
{
  
int n = 0;
  
float vet[20];
  
for (int h = 1; h <= 20; h++)
    {
      
printf ("\nInsira o valor para a posicao %d :", h);
      
scanf ("f", &vet[h]);
    
} 
printf ("hC! %d numeros negativos!", negativos (n, &vet));
  
return 0;

}
