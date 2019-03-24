package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        int length=0;
        for(Integer[] item:array){
            length=length+item.length;
        }
        Integer[] result =new Integer[length];
        int index = 0;
        for(Integer[] item : array){
            for(int items :item){
                result[index++]=items;
            }
        }
        return Arrays.asList(result);
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        int length=0;
        for(Integer[] item:array){
            length=length+item.length;
        }
        List<Integer> result =new ArrayList<>();
        for(Integer[] item : array){
            for(int items :item){
                if (!result.contains(items)) {
                    result.add(items);
                }
            }
        }
        return result ;
    }
}
