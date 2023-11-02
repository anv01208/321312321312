public class TrafficLightSystemUser {

    public static void main(String[] args) {
        // Create a traffic light.
        TrafficLight trafficLight = TrafficLightFactory.createTrafficLight(TrafficLightColor.RED);

        // Create observers for the traffic light.
        CarObserver carObserver = new CarObserver();
        PedestrianObserver pedestrianObserver = new PedestrianObserver();

        // Attach the observers to the traffic light.
        trafficLight.attach(carObserver);
        trafficLight.attach(pedestrianObserver);

        // Change the traffic light color to green.
        trafficLight.changeColor(TrafficLightColor.GREEN);
    }
}
