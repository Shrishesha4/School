#include <stdio.h>
// This program finds the smallest element in an array
int main()
{
    int a[100], n, i, min;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the elements of the array: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    min = a[0];
    for (i = 1; i < n; i++)
    {
        if (a[i] < min)
        {
            min = a[i];
        }
    }
    printf("The smallest element in the array is: %d\n", min);

    return 0;
}