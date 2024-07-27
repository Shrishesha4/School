package Java.ClassTest;

public class TrafficData {
    private int vehicleCount;
    private double averageSpeed;
    private int queueLength;
    private String intersectionId;
    private String timestamp;

    public TrafficData(int vehicleCount, double averageSpeed, int queueLength, String intersectionId, String timestamp) {
        this.vehicleCount = vehicleCount;
        this.averageSpeed = averageSpeed;
        this.queueLength = queueLength;
        this.intersectionId = intersectionId;
        this.timestamp = timestamp;
    }

    // Getters
    public int getVehicleCount() {
        return vehicleCount;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public int getQueueLength() {
        return queueLength;
    }

    public String getIntersectionId() {
        return intersectionId;
    }

    public String getTimestamp() {
        return timestamp;
    }
}