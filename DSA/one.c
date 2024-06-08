#include <stdio.h>
int main()
{
    int array[10], i;
    printf("Enter the array elements:\n");
    for (i=0; i<10; i++)
    {
        scanf("%d", &array[i]);
    }
    printf("The array is:\n");
    for (i=0; i<10; i++)
    {
        printf("%d", array[i]);
        if (i!=9)
        {
            printf(" - ");
        }
    }
    printf("\n");
    return 0;
}   