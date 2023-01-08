package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double calculateAverage(){

        Double wynik = 0.0;
        Double average = null;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            wynik=wynik+temperature.getValue();
            average=wynik/temperatures.getTemperatures().size();

        }
        return average;
    }

    public Double calculateMedian(){

        Double median = 0.0;
        Double moduloTemperaturesSize= Double.valueOf(temperatures.getTemperatures().size())% 2.0;
        Collection<Double> values = temperatures.getTemperatures().values();
        List<Double> listOfValues = new ArrayList<>(values);
        int mapSize = temperatures.getTemperatures().size();



        if(moduloTemperaturesSize!=0){

            median = listOfValues.get(mapSize/2);

        } else {
            median =  (listOfValues.get(mapSize/2)+listOfValues.get((mapSize/2)+1))/2;
        }

        return median;
    }
}