#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include "ressources.h"

long long int algoEuclide(long long int a, long long int b, long long int* u, long long int* v){
    long long int* reste = malloc(3 * sizeof(long long));
    long long int* u_al = malloc(3 * sizeof(long long));
    long long int* v_al = malloc(3 * sizeof(long long));
    long long int quotient;
    long long int pgcd;

    reste[2] = a;
    reste[1] = b;
    reste[0] = a % b;
    
    quotient = ((reste[2] - reste[0]) / reste[1]);

    u_al[2] = 1; 
    u_al[1] = 0;
    u_al[0] = u_al[2] - (quotient * u_al[1]);

    v_al[2] = 0; 
    v_al[1] = 1;
    v_al[0] = v_al[2] - (quotient * v_al[1]);
    
    while(reste[0] != 0){
        reste[2] = reste[1];
        reste[1] = reste[0];
        reste[0] = reste[2] % reste[1];

        quotient = ((reste[2] - reste[0]) / reste[1]);

        u_al[2] = u_al[1];
        u_al[1] = u_al[0];
        u_al[0] = u_al[2] - (quotient * u_al[1]);

        v_al[2] = v_al[1];
        v_al[1] = v_al[0];
        v_al[0] = v_al[2] - (quotient * v_al[1]);
    }
    pgcd = reste[1];
    *u = u_al[1];
    *v = v_al[1];
    return pgcd;
}
