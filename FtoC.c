#include<stdio.h>

int main(){

    float F;

    printf("enter the temperature in farenheit : ");
    scanf("%f",&F);

    float C=(F-32.0)*(5.0/9.0);

    printf("%f",C);
        
    return 0;
}
