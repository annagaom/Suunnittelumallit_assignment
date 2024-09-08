package observer.view;
import observer.model.WeatherStation;

public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        ObserverA mobileApp = new ObserverA("MobileApp");
        ObserverB desktopApp = new ObserverB("DesktopApp");

        // Register observers
        weatherStation.addObserver(mobileApp);
        weatherStation.addObserver(desktopApp);

        // Start the weather station in a new thread
        Thread weatherThread = new Thread(weatherStation);
        weatherThread.start();

        // Let the simulation run for 20 seconds
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Remove one observer
        System.out.println("\nRemoving MobileApp observer...\n");
        weatherStation.removeObserver(mobileApp);

        // Let the simulation run for another 10 seconds
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the weather station thread and exit the program
        weatherStation.stop();
    }
}
