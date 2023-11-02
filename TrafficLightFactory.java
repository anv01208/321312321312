public class TrafficLightFactory {

    public static TrafficLight createTrafficLight(TrafficLightColor color) {
        return new TrafficLight(color);
    }
}