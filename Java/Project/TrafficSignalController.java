package Java.Project;

import java.util.List;
import java.util.Map;

import Java.ClassTest.TrafficData;

import java.util.HashMap;

public class TrafficSignalController {
    private List<TrafficData> trafficDataList;
    private Map<Integer, SignalTiming> signalTimings;

    public TrafficSignalController(List<TrafficData> trafficDataList) {
        this.trafficDataList = trafficDataList;
        this.signalTimings = new HashMap<>();
    }

    public void optimizeSignalTimings() {
        for (TrafficData data : trafficDataList) {
            double trafficDensity = calculateTrafficDensity(data);
            int vehicleQueue = calculateVehicleQueue(data);
            int pedestrianFlow = data.getPedestrianCount();
            double peakHourFactor = getPeakHourFactor(data.getTimestamp());

            int greenTime = (int)(baseGreenTime * trafficDensity * peakHourFactor);
            int redTime = baseRedTime + pedestrianFlow;

            signalTimings.put(data.getIntersectionId(), new SignalTiming(greenTime, redTime));
            updateSignalTiming(data.getIntersectionId(), greenTime, redTime);
        }
    }

    private double calculateTrafficDensity(TrafficData data) {
        // Calculate traffic density based on vehicle count and average speed
        double density = (double) data.getVehicleCount() / maxCapacity;
        return density;
    }

    private int calculateVehicleQueue(TrafficData data) {
        // Calculate vehicle queue length based on vehicle count
        int queueLength = data.getVehicleCount();
        return queueLength;
    }

    private double getPeakHourFactor(long timestamp) {
        // Determine peak hour factor based on the timestamp
        long hour = (timestamp / (1000 * 60 * 60)) % 24;
        if (hour >= 7 && hour <= 9 || hour >= 17 && hour <= 19) {
            return 1.5; // Peak hours
        } else {
            return 1.0; // Non-peak hours
        }
    }
    
    private void updateSignalTiming(int intersectionId, int greenTime, int redTime) {
        // Update signal timings for the intersection
        System.out.println("Updating timings for intersection " + intersectionId + ": Green = " + greenTime + "s, Red = " + redTime + "s");
    }

    private static final int baseGreenTime = 30;
    private static final int baseRedTime = 10;
    private static final int maxCapacity = 100;
}