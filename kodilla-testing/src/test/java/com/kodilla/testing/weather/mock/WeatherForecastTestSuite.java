package com.kodilla.testing.weather.mock;                                     // [1]

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {


    @Mock
    private Temperatures temperaturesMock;

    @Test                                                                      // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }

    @Test
    void testCalculateAverage(){
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 2.0);
        temperaturesMap.put("Krakow", 4.0);
        temperaturesMap.put("Wroclaw", 4.0);
        temperaturesMap.put("Warszawa", 6.0);
        temperaturesMap.put("Gdansk", 4.0);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double averageTemperature = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(4.0, averageTemperature);
    }

    @Test
    void testCalculateMedian(){
        //Given
        Temperatures tempMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 2.0);
        temperaturesMap.put("Krakow", 4.0);
        temperaturesMap.put("Wroclaw", 4.0);
        temperaturesMap.put("Warszawa", 4.0);
        temperaturesMap.put("Gdansk", 6.0);

        when(tempMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(tempMock);

        //When
        Double medianTemperature = weatherForecast.calculateMedian();

        //Then
        Assertions.assertEquals(6.0, medianTemperature);



    }
}