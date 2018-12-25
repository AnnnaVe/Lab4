package com.annve;

import java.io.Serializable;

public class Weather implements Serializable {

    private double temperature;
    private double humidity;
    private double pressure;
    private double waterTemperature;

    public Weather() {
    }

    public Weather(double temperature, double humidity, double pressure, double waterTemperature) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.waterTemperature = waterTemperature;
    }

    @Override
    public String toString() {
        return "Temperature " + temperature + " °C " +
                "Humidity " + humidity + " % " +
                "Pressure " + pressure + " hpa " +
                "Water temperature " + waterTemperature + " °C\n";
    }
}
