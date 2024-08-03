#include <stdio.h>
#include <string.h>

void binaryDivision(char data[], char divisor[], char remainder[]) {
    int dataLen = strlen(data);
    int divisorLen = strlen(divisor);
    int i, j;

    for (i = 0; i < divisorLen; i++) {
        remainder[i] = data[i];
    }

    for (i = divisorLen; i <= dataLen; i++) {
        if (remainder[0] == '1') {
            for (j = 0; j < divisorLen; j++) {
                remainder[j] = (remainder[j] == divisor[j]) ? '0' : '1';
            }
        }
        for (j = 0; j < divisorLen - 1; j++) {
            remainder[j] = remainder[j + 1];
        }
        if (i < dataLen) {
            remainder[divisorLen - 1] = data[i];
        }
    }
    remainder[divisorLen - 1] = '\0';
}

int main() {
    int n, d, i;
    char inputData[100], divisor[20], data[120], remainder[20];

    printf("Enter the number of bits in the input data stream (n): ");
    scanf("%d", &n);

    printf("Enter the number of bits in the divisor (d): ");
    scanf("%d", &d);

    printf("Enter the input data bits: ");
    scanf("%s", inputData);

    printf("Enter the divisor bits: ");
    scanf("%s", divisor);

    strcpy(data, inputData);
    for (i = 0; i < d - 1; i++) {
        data[n + i] = '0';
    }
    data[n + d - 1] = '\0';

    binaryDivision(data, divisor, remainder);

    for (i = 0; i < d - 1; i++) {
        data[n + i] = remainder[i];
    }
    data[n + d - 1] = '\0';

    binaryDivision(data, divisor, remainder);

    int error = 0;
    for (i = 0; i < d - 1; i++) {
        if (remainder[i] == '1') {
            error = 1;
            break;
        }
    }

    if (error) {
        printf("Error detected in the transmitted bits.\n");
    } else {
        printf("No error in the transmitted bits.\n");
    }

    return 0;
}
