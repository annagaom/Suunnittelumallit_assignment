package observer.view;
import observer.model.WeatherObserver;

public class ObserverA implements WeatherObserver {
    private String observerName;

    // Constructor for Observer1
    public ObserverA(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(int temperature) {
        System.out.println(observerName + " received update: Current temperature is " + temperature + "°C.");
    }
}