package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {

        List<Integer> result = array.stream().map(item -> item*3).collect(Collectors.toList());
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = array.stream().map(item -> letterList.get(item-1)).collect(Collectors.toList());
        return result;
    }

    public List<String> mapLetters() {

        return array.stream().map(item ->getLetter(item)).collect(Collectors.toList());
    }

    public String getLetter(int num){
        //要改进
        String letters = "";
        while(num/27!=0){
            int point = num%26;
            if (point==0){
                point=26;
                num=num-1;
            }
            letters = letterList.get(point-1) + letters;
            num=num/26;
        }
        letters=letterList.get(num-1)+letters;
        return letters;
    }

    public List<Integer> sortFromBig() {
        List<Integer> reuslt = array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return reuslt;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> reuslt = array.stream().sorted().collect(Collectors.toList());
        return reuslt;
    }
}
