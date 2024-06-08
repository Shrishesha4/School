#include <stdio.h>

int main()
{
    int a[100], n, i, max1, max2;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    printf("Enter the elements of the array: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    max1 = a[0];
    max2 = a[0];
    for (i = 1; i < n; i++)
    {
        if (a[i] > max1)
        {
            max2 = max1;
            max1 = a[i];
        }
        else if (a[i] > max2 && a[i] != max1)
        {
            max2 = a[i];
        }
    }
    printf("The second largest element in the array is: %d\n", max2);
}