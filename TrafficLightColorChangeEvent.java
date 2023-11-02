public class TrafficLightColorChangeEvent {

    private TrafficLightColor color;

    public TrafficLightColorChangeEvent(TrafficLightColor color) {
        this.color = color;
    }

    public TrafficLightColor getColor() {
        return color;
    }
}
