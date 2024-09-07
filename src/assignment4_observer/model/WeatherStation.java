package assignment4_observer.model;

import java.util.Random;

public class WeatherStation {
    private Float temperature;

    public WeatherStation(Float temperature) {
        this.temperature = temperature;
    }

    //random temprature generator
    public void generateTemperature() {
        Random random = new Random();
        int miniTemperature = -10;
        int maxTemperature = 35;
        while (true) {
            int randomTemperature = random.nextInt(maxTemperature - miniTemperature + 1) + miniTemperature;

            System.out.println("Temperature: " + randomTemperature);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

