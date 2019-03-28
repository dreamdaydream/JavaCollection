package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> result =new ArrayList<>();
        if (left<right){
           result = IntStream.range(left,right+1).boxed().collect(Collectors.toList());
        }
        else{
            result = IntStream.range(right,left+1).boxed().collect(Collectors.toList());
            Collections.reverse(result);
        }
        return result;


    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        List<Integer> result =new ArrayList<>();
        if (left<right){
            result = IntStream.range(left,right+1).filter( item -> item %2==0).boxed().collect(Collectors.toList());
        }
        else{
            result = IntStream.range(right,left+1).filter(item -> item%2==0).boxed().collect(Collectors.toList());
            Collections.reverse(result);
        }
        return result;

    }

    public List<Integer> popEvenElments(int[] array) {

        List<Integer> result = Arrays.stream(array).filter(item -> item%2==0).boxed().collect(Collectors.toList());
        return result;

    }

    public int popLastElment(int[] array) {

        int length = array.length;
        return array[length-1];

    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(toList());
        List<Integer> result = Arrays.stream(firstArray).filter(item -> secondList.contains(item)).boxed().collect(Collectors.toList());
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        // 直接aslist生成的固定大小的list,addAll 异常
        List<Integer> firstList = new ArrayList<>(Arrays.asList(firstArray)) ;
        List<Integer> differ = Arrays.stream(secondArray).filter(item -> !firstList.contains(item)).collect(Collectors.toList());
        firstList.addAll(differ);
        return firstList;
    }
}
