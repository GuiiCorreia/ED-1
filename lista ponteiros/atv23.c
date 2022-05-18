#include<stdio.h>
const int MAX = 20000000;

 
void
minimax (int vet[], int *min, int *max) 
{
  
int i, vMin = MAX, vMax = 0;
  
 
for (i = 0; i < 5; i++)
    {
      
if (vet[i] < vMin)
	{
	  
vMin = vet[i];
	
}
      
if (vet[i] > vMax)
	{
	  
vMax = vet[i];
	
}
    
}
  
 
*min = vMin;
  
*max = vMax;

}


 
 
main ()
{
  
int vet[5] = { 5, 3, 7, 9, 2 };
  
int min = 0, max = 0;
  
 
minimax (vet, &min, &max);
  
 
printf ("min = %d - max = %d", min, max);

 
 
}
