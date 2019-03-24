package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> result =new ArrayList<>();
        int ran = random.nextInt(3);
        for (int i = number-ran; i>=0; i=i-ran) {
            result.add(i);
        }
        return result;
    }
}
