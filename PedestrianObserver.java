public class PedestrianObserver implements TrafficLightObserver {

    @Override
    public void update(TrafficLightColorChangeEvent event) {
        TrafficLightColor color = event.getColor();
        switch (color) {
            case RED:
                // Wait for the light to turn green.
                break;
            case YELLOW:
                // Hurry across the street.
                break;
            case GREEN:
                // Cross the street safely.
                System.out.println("PedestrianObserver: Cross the street safely.");
                break;
        }
    }
}
