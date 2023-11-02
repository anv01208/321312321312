public interface TrafficLightSubject {
    void attach(TrafficLightObserver observer);
    void detach(TrafficLightObserver observer);
    void notifyObservers(TrafficLightColorChangeEvent event);
}