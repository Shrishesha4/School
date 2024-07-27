package Java.Project;

public class TrafficData {
    private int intersectionId;
    private int vehicleCount;
    private double averageSpeed;
    private int pedestrianCount;
    private long timestamp;

    public TrafficData(int intersectionId, int vehicleCount, double averageSpeed, int pedestrianCount, long timestamp) {
        this.intersectionId = intersectionId;
        this.vehicleCount = vehicleCount;
        this.averageSpeed = averageSpeed;
        this.pedestrianCount = pedestrianCount;
        this.timestamp = timestamp;
    }

    // Getters
    public int getIntersectionId() { return intersectionId; }
    public int getVehicleCount() { return vehicleCount; }
    public double getAverageSpeed() { return averageSpeed; }
    public int getPedestrianCount() { return pedestrianCount; }
    public long getTimestamp() { return timestamp; }
}
