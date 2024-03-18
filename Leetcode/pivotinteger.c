#include <stdio.h>
#include <math.h>
int pivotInteger(int n){
    float x = sqrt((n*n + n)/2);
    if (floor(x) == ceil(x)){
        return (int)x;
    }
    else{
        return -1;
    }
}
int main(){
    int a = pivotInteger(1);
    printf("%d",a);
}