import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class TrafficSignal {
    String ID;
    int GDuration;
    int RDuration;
    int YDuration;

    TrafficSignal(String id, int green, int red, int yellow) {
        ID = id;
        GDuration = green;
        RDuration = red;
        YDuration = yellow;
    }

    void adjustGDuration(int adjustment) {
        GDuration += adjustment;
        if (GDuration < 5) {
            GDuration = 5;
        }
    }

    int getGDuration() {
        return GDuration;
    }

    String getId() {
        return ID;
    }
}

class Intersection {
    String name;
    TrafficSignal trafficSignal;
    int queueLength;
    int trafficDensity;

    Intersection(String n, TrafficSignal t, int ql, int td) {
        name = n;
        trafficSignal = t;
        queueLength = ql;
        trafficDensity = td;
    }

    void optimizeSignal() {
        if (queueLength > 10) {
            trafficSignal.adjustGDuration(10);
        } else if (trafficDensity < 5) {
            trafficSignal.adjustGDuration(-5);
        }
    }

    void displaySignalStatus(StringBuilder output) {
        output.append("Intersection: ").append(name).append("\n");
        output.append("Traffic Signal ID: ").append(trafficSignal.getId()).append("\n");
        output.append("Green Light Duration: ").append(trafficSignal.getGDuration()).append(" seconds\n");
        output.append("Queue Length: ").append(queueLength).append("\n");
        output.append("Traffic Density: ").append(trafficDensity).append("\n\n");
    }
}

public class TrafficSignalDashboard {
    List<Intersection> intersections;
    JTextArea outputArea;
    Random random;

    int[] initialQueueLengths = {12, 5, 15}; 
    int[] initialTrafficDensities = {8, 3, 10};

    TrafficSignalDashboard() {
        intersections = new ArrayList<>();
        random = new Random();
        initializeIntersections();
    }

    void initializeIntersections() {
        TrafficSignal signal1 = new TrafficSignal("SIG_1", 30, 60, 5);
        intersections.add(new Intersection("Nazarathpet", signal1, initialQueueLengths[0], initialTrafficDensities[0]));

        TrafficSignal signal2 = new TrafficSignal("SIG_2", 25, 55, 4);
        intersections.add(new Intersection("EVP", signal2, initialQueueLengths[1], initialTrafficDensities[1]));

        TrafficSignal signal3 = new TrafficSignal("SIG_3", 20, 50, 6);
        intersections.add(new Intersection("Sriperumbudur", signal3, initialQueueLengths[2], initialTrafficDensities[2]));
    }

    void optimizeSignals() {
        for (Intersection intersection : intersections) {
            intersection.optimizeSignal();
        }
    }

    void updateTrafficConditions() {
        for (int i = 0; i < intersections.size(); i++) {
            intersections.get(i).queueLength = Math.max(0, initialQueueLengths[i] + random.nextInt(5) - 2);
            intersections.get(i).trafficDensity = Math.max(0, initialTrafficDensities[i] + random.nextInt(3) - 1);
        }
    }

    void displayCurrentStatus() {
        StringBuilder output = new StringBuilder();
        for (Intersection intersection : intersections) {
            intersection.displaySignalStatus(output);
        }
        outputArea.setText(output.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Traffic Signal Dashboard");
            TrafficSignalDashboard dashboard = new TrafficSignalDashboard();
            dashboard.outputArea = new JTextArea(20, 40);
            dashboard.outputArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(dashboard.outputArea);
            JButton optimizeButton = new JButton("Optimize Signals");

            dashboard.displayCurrentStatus();

            optimizeButton.addActionListener(e -> {
                dashboard.updateTrafficConditions();
                dashboard.optimizeSignals();
                dashboard.displayCurrentStatus();
            });

            Timer timer = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dashboard.updateTrafficConditions();
                    dashboard.displayCurrentStatus();
                }
            });
            timer.start();

            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(optimizeButton, BorderLayout.SOUTH);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}