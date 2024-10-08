package observer.view;
import observer.model.WeatherObserver;

public class ObserverB implements WeatherObserver {
    private String observerName;

    public ObserverB(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(int temperature) {
        System.out.println(observerName + " received update: Current temperature is " + temperature + "°C.");
    }
}