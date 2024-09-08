package observer.view;

import observer.model.WeatherObserver;

// Second observer class (Observer2)
public class ObserverB implements WeatherObserver {
    private String observerName;

    // Constructor for Observer2
    public ObserverB(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(int temperature) {
        System.out.println(observerName + " received update: Current temperature is " + temperature + "°C.");
    }
}