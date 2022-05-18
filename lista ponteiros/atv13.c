#include <stdio.h>


int
verifica (char *string1, char *string2)
{
  int i, j, auxiliar = 0;
  for (i = 0, j = 0; (*(string1 + i)) != '\0'; i++)
    {

      while ((*(string1 + i)) == (*(string2 + j)))
	{
	  i++;
	  j++;

	  if ((*(string2 + j)) == '\n' || (*(string2 + j)) == '\0')
	    return 1;

	  else if ((*(string1 + i)) != (*(string2 + j)))
	    auxiliar = 0;
	}
    }
  return auxiliar;
}

int
main ()
{
  char string1[100], string2[50];
  fgets (string1, 100, stdin);
  fgets (string2, 50, stdin);

  int retorno = verifica (string1, string2);
  if (retorno == 1)
    printf ("A segunda string esta contida na primeira string\n");
  else
    printf ("A segunda string NAO esta contida na primeira string\n");
  return 0;
}
