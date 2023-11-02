import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements TrafficLightSubject {

    private TrafficLightColor color;
    private List<TrafficLightObserver> observers = new ArrayList<>();

    public TrafficLight(TrafficLightColor color) {
        this.color = color;
    }

    @Override
    public void attach(TrafficLightObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(TrafficLightObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(TrafficLightColorChangeEvent event) {
        for (TrafficLightObserver observer : observers) {
            observer.update(event);
        }
    }

    public void changeColor(TrafficLightColor newColor) {
        this.color = newColor;
        notifyObservers(new TrafficLightColorChangeEvent(this.color));
    }

    public TrafficLightColor getColor() {
        return color;
    }
}
