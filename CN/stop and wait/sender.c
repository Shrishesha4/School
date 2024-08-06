#include <stdio.h>
#include <stdbool.h>
#include <unistd.h>

#define FRAME_COUNT 5

void send_frame(int seq_num) {
    printf("Sent frame with sequence number: %d\n", seq_num);
    // Simulate sending a frame with some delay
    sleep(1);
}

bool receive_ack(int expected_seq_num) {
    // Simulate receiving an ACK with some delay
    sleep(1);
    printf("Received ACK for sequence number: %d\n", expected_seq_num);
    return true; // Simulate always receiving the correct ACK
}

int main() {
    int seq_num = 0;
    for (int i = 0; i < FRAME_COUNT; i++) {
        send_frame(seq_num);

        // Wait for acknowledgment
        if (receive_ack(seq_num)) {
            // Toggle sequence number for next frame
            seq_num = 1 - seq_num;
        } else {
            // Handle the case where ACK is not received
            printf("Failed to receive ACK, resending frame...\n");
            i--; // Resend the current frame
        }
    }

    printf("All frames sent successfully.\n");
    return 0;
}

