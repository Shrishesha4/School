#include <stdio.h>

int main() 
{
    int a[50], size, n=0, ele, p, i, t, ex, flag;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    for (i = 0; i < size; i++) 
    {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &a[i]);
    }

    printf("\nElements in the array are: ");
    for (i = 0; i < size; i++) 
    {
        printf("%d ", a[i]);
    }
    printf("\n");

    do
    {
        printf("Choose one option\n1 -> Insertion\n2 -> Search\n3 -> Deletion\n0 -> Exit\n");
        scanf("%d", &flag);

        if (flag == 1)
        {
            printf("Enter the number of elements to be inserted in the array: ");
            scanf("%d", &n);

            if (size + n > 50) 
            {
                printf("Error: Not enough space in the array for %d elements.\n", n);
                return 1;
            }

            for (i = 0; i < n; i++) 
            {
                printf("Enter the element to be inserted: ");
                scanf("%d", &ele);
                printf("Enter the position of element (0 to %d): ", size + i - 1);
                scanf("%d", &p);
                if (p < 0 || p > size + i) 
                {
                    printf("Invalid position. Please enter a value between 0 and %d.\n", size + i - 1);
                    continue;
                }

                for (int temp = size + i; temp > p; temp--) 
                {
                    a[temp] = a[temp - 1];
                }

                a[p] = ele;
            }

            printf("\nModified array: ");
            for (i = 0; i < size + n; i++) 
            {
                printf("%d ", a[i]);
            }
            printf("\n");
        }

        else if (flag == 2)
        {
            printf("Enter the element to be searched: ");
            scanf("%d", &t);
            for (i=0; i< size+n; i++)
            {
                if (a[i] == t)
                {
                    if(i == 1)
                    {
                        printf("\nElement found at %dst position\n", i+1);
                    }
                    else if (i == 2) 
                    {
                        printf("\nElement found at %dnd position\n", i+1);
                    }
                    else if (i == 3) 
                    {
                        printf("\nElement found at %drd position\n", i+1);
                    }
                    else
                    {
                        printf("\nElement found at %dth position\n", i+1);
                    }
                }
            }
        }

        else if (flag == 3)
        {
            printf("Enter the element to be deleted: ");
            scanf("%d", &ex);

            if (ex >= size+n+1)
            {
                printf("\nDeletion not possible.\n");
            }

            else
            {    
                for ( i = ex - 1 ; i < size+n - 1 ; i++ )
                {
                    a[i] = a[i+1];        
                }

                printf("\nResultant array is - ");
                for(i = 0 ; i < size+n - 1 ; i++ )
                {
                    printf("%d ", a[i]);        
                }
                printf("\n");
            }    
        }

        else if (flag == 0)
        {
            printf("\nExited\n");           
        }

        else
        {
            printf("Please choose a valid option!\n");
        }

    } while (flag != 0);

    return 0;
}