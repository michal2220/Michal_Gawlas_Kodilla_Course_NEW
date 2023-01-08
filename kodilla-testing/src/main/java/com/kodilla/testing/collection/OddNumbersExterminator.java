package com.kodilla.testing.collection;
import java.util.*;

public class  OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> list){

        int moduloFromNumber;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            moduloFromNumber = list.get(i) % 2;
            if (moduloFromNumber == 0)
            {
                result.add(list.get(i));
            }
        }

        return result;
    }
}


