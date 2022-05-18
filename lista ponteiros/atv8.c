int
main ()
{
  
 
int i, vet[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
  
 
for (i = 0; i < 10; i++)
    
printf ("Endereco: %p\tConteudo: %d\n", vet + i, *(vet + i));
  
 
return 0;

}
