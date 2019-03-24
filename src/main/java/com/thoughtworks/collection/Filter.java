package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = array.stream().filter(item -> item%2==0).collect(Collectors.toList());
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = array.stream().filter(item -> item%3==0).collect(Collectors.toList());
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = firstList.stream().filter(item -> secondList.contains(item)).collect(Collectors.toList());
        return result;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = array.stream().distinct().collect(Collectors.toList());
        return result;
    }
}