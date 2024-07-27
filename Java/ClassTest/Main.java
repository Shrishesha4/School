// package Java.ClassTest;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;

// class TrafficData {
//     private int vehicleCount;
//     private double averageSpeed;
//     private int queueLength;
//     private String intersectionId;
//     private String timestamp;

//     public TrafficData(int vehicleCount, double averageSpeed, int queueLength, String intersectionId, String timestamp) {
//         this.vehicleCount = vehicleCount;
//         this.averageSpeed = averageSpeed;
//         this.queueLength = queueLength;
//         this.intersectionId = intersectionId;
//         this.timestamp = timestamp;
//     }

//     // Getters and setters
//     public int getVehicleCount() {
//         return vehicleCount;
//     }

//     public double getAverageSpeed() {
//         return averageSpeed;
//     }

//     public int getQueueLength() {
//         return queueLength;
//     }

//     public String getIntersectionId() {
//         return intersectionId;
//     }

//     public String getTimestamp() {
//         return timestamp;
//     }
// }

// class TrafficSignalController {
//     private Map<String, TrafficData> trafficData;

//     public TrafficSignalController() {
//         trafficData = new HashMap<>();
//     }

//     public void collectTrafficData(ArrayList<TrafficData> data) {
//         for (TrafficData datum : data) {
//             trafficData.put(datum.getIntersectionId(), datum);
//         }
//     }

//     public void optimizeSignalTimings() {
//         for (TrafficData data : trafficData.values()) {
//             if (data.getVehicleCount() > 100) {
//                 adjustSignalTiming(data.getIntersectionId(), 10);
//             } else {
//                 adjustSignalTiming(data.getIntersectionId(), -5);
//             }
//         }
//     }

//     private void adjustSignalTiming(String intersectionId, int adjustment) {
//         // Adjust signal timings at the given intersection
//         // by the specified amount (in seconds)
//         System.out.println("Adjusting signal timing at intersection " + intersectionId + " by " + adjustment + " seconds.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Simulate collecting traffic data
//         ArrayList<TrafficData> trafficData = new ArrayList<>();
//         trafficData.add(new TrafficData(150, 30.5, 10, "A1", "2024-07-26T08:00:00"));
//         trafficData.add(new TrafficData(200, 25.0, 15, "A2", "2024-07-26T08:00:00"));

//         TrafficSignalController controller = new TrafficSignalController();
//         controller.collectTrafficData(trafficData);
//         controller.optimizeSignalTimings();
//     }
// }

package Java.ClassTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Simulate collecting traffic data
        ArrayList<TrafficData> trafficData = new ArrayList<>();
        trafficData.add(new TrafficData(150, 30.5, 10, "A1", "2024-07-26T08:00:00"));
        trafficData.add(new TrafficData(200, 25.0, 15, "A2", "2024-07-26T08:00:00"));

        TrafficSignalController controller = new TrafficSignalController();
        for (TrafficData data : trafficData) {
            controller.collectTrafficData(data);
        }
        controller.optimizeSignalTimings();
    }
}