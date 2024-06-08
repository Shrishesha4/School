#include <stdio.h>

int main()
{
    int a[100], n, i, sum=0, avg;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the elements of the array: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("The average of is array: ");
    for (i = 0; i < n; i++)
    {   
        avg = (sum+a[i])/n;
    }
    printf("%d\n", avg);

    return 0;
}