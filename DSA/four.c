#include <stdio.h>

int main()
{
    int a[100], n, i, sum=0;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the elements of the array: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("The sum of is array: ");
    for (i = 0; i < n; i++)
    {   
        sum += a[i];
    }
    printf("%d\n", sum);

    return 0;
}