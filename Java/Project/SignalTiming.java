package Java.Project;

public class SignalTiming {
    private int greenTime;
    private int redTime;

    public SignalTiming(int greenTime, int redTime) {
        this.greenTime = greenTime;
        this.redTime = redTime;
    }

    // Getters
    public int getGreenTime() { return greenTime; }
    public int getRedTime() { return redTime; }
}
