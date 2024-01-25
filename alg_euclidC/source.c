#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include "ressources.h"

int Euler_functon(long long int nombre){
    long long int n1 = 0, n2 = nombre, u, v; 
}

int premier_founder(long long int nombre){
    long long int nd = 2;
    long int nbfacteur_premier = 0;
    for(nd = 2; nd < nombre; nd++){
        if((nombre % nd) == 0){
            printf("nd[%li] = %lli\n", nbfacteur_premier, nd);
            nbfacteur_premier = nbfacteur_premier + 1;
        }
    }
    return 0;
}

int main(void){
    //premier_founder(5642);
    long long int a, b, u, v, pgcd_ab;
    printf("a = ");
    scanf("%lli", &a);
    printf("\n");
    printf("b = ");
    scanf("%lli", &b);
    printf("\n");
    pgcd_ab = algoEuclide(a, b , &u, &v);
    printf("%lli * %lli + %lli * %lli = %lli\n", a, u, b, v, pgcd_ab);
    return 0;
}