package observer.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private List<WeatherObserver> observerList;
    private int temperature;
    private final int minTemperature = -10;
    private final int maxTemperature = 35;
    private Random random;
    private boolean running;

    public WeatherStation() {
        observerList = new ArrayList<>();
        random = new Random();
        temperature = random.nextInt(maxTemperature - minTemperature + 1) + minTemperature;
        running = true;
    }

    // add an observer
    public void addObserver(WeatherObserver observer) {
        observerList.add(observer);
    }

    // Remove an observer
    public void removeObserver(WeatherObserver observer) {
        observerList.remove(observer);
    }

    // Notify all observers of temperature change
    private synchronized void notifyObservers() {
        for (WeatherObserver observer : observerList) {
            observer.update(temperature);
        }
    }

    // Generate a new random temperature and notify all observers
    private void changeTemperature() {
        int change = random.nextInt(3) - 1; // -1, 0, 1
        temperature += change;

        if (temperature < minTemperature) {
            temperature = minTemperature;
        } else if (temperature > maxTemperature) {
            temperature = maxTemperature;
        }
        notifyObservers();
    }

    // To run in a separate thread
    @Override
    public void run() {
        while (running) {
            try {
                // Sleep for a random time between 1 and 5 seconds
                Thread.sleep((random.nextInt(5) + 1) * 1000);
                changeTemperature();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Stop the thread
    public void stop() {
        running = false;
    }

    // Get the current temperature
    public int getTemperature() {
        return temperature;
    }
}
