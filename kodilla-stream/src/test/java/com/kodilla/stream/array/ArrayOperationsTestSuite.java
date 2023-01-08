package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArrayOperationsTestSuite {



    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {1,3,4,2,5,12,3,5,1,9,8,8,6,3,6,5,8,9,2,3};
        ArrayOperations.getAverege(numbers);

        //When

        IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .forEach(System.out::println);

        double averageNumbers =IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .average().getAsDouble();


        //Then
        assertEquals(5.15, averageNumbers);

    }
}
