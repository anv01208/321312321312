public class CarObserver implements TrafficLightObserver {


    @Override
    public void update(TrafficLightColorChangeEvent event) {
        TrafficLightColor color = event.getColor();
        switch (color) {
            case RED:
                // Stop the car.
                break;
            case YELLOW:
                // Slow down the car.
                break;
            case GREEN:
                // Accelerate the car.
                System.out.println("CarObserver: Accelerate the car.");
                break;
        }
    }
    }
