package Java.ClassTest;

import java.util.HashMap;
import java.util.Map;

public class TrafficSignalController {
    private Map<String, TrafficData> trafficData;

    public TrafficSignalController() {
        trafficData = new HashMap<>();
    }

    public void collectTrafficData(TrafficData data) {
        trafficData.put(data.getIntersectionId(), data);
    }

    public void optimizeSignalTimings() {
        for (TrafficData data : trafficData.values()) {
            if (data.getVehicleCount() > 100) {
                adjustSignalTiming(data.getIntersectionId(), 10);
            } else {
                adjustSignalTiming(data.getIntersectionId(), -5);
            }
        }
    }

    private void adjustSignalTiming(String intersectionId, int adjustment) {
        System.out.println("Adjusting signal timing at intersection " + intersectionId + " by " + adjustment + " seconds.");
    }
}