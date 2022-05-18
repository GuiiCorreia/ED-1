
#include <stdio.h>

#include <stdlib.h>

#include <math.h>

float delta(float a, float b, float c)

{

float d;

d = (b * b - 4 * a * c);

return d;

}

float raiz(float d)

{

float r;

r = sqrt(d);

return r;

}

void raizes(float a, float b, float c, float d, float r, float *x1, float *x2)

{

*x1 = ((- + r)/2 * a;

*x2 = ((- - r)/2 * a;

return ;

}

int main()

{

float a, b, c, d, r, x1, x2;

printf("CALCULA EQUACAO DO SEGUNDO GRAU AX2+BX+C=0 \n");

printf("Digite o valor de a: ");

scanf("%f",&a);

printf("Digite o valor de b: ");

scanf("%f",&;

printf("Digite o valor de c: ");

scanf("%f",&c);

d = delta(a, b, c);

r = raiz(d);

if (d < 0)

{

printf("O valor de delta e: %.2f\n",d);

printf("Nao existe raiz de delta.\n");

}

else

{

if (d == 0)

{

printf("O valor de delta e: %.2f\n",d);

printf("A raiz de delta e: %.2f\n",r);

raizes(a, b, c, d, r, &x1, &x2);

printf("Tem uma raiz: x1=%.2f e x2=%.2f\n", x1, x2);

}

else

{

if (d > 0)

{

printf("O valor de delta e: %.2f\n",d);

printf("A raiz de delta e: %.2f\n",r);

raizes(a, b, c, d, r, &x1, &x2);

printf("Tem duas raizes: x1=%.2f e x2=%.2f\n", x1, x2);

}

}

}

system("pause");

return 0;

}
