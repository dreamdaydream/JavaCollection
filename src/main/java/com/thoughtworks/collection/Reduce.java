package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {

        this.arrayList = arrayList;
    }

    public int getMaximum() {
        //optional 对象
        Optional<Integer> max = arrayList.stream().reduce(Math::max);
        return max.get();
    }

    public double getMinimum() {
        Integer min = arrayList.stream().reduce(arrayList.get(0),Math::min);
        return min;
    }

    public double getAverage() {
        Double aver = arrayList.stream().collect(Collectors.averagingInt(item -> item));
        return aver;
    }

    public double getOrderedMedian() {

        Collections.sort(arrayList);
        int length = arrayList.size();
        double median ;
        if (length%2==0){
            median = (arrayList.get(length/2)+arrayList.get(length/2-1))/2.0;
        }
        else{
            median = arrayList.get((length-1)/2);
        }
        return median;
    }

    public int getFirstEven() {

        int firstEven = arrayList.stream().filter(item -> item%2==0).findFirst().orElse(null);
        return firstEven;
    }

    public int getIndexOfFirstEven() {
        int firstEven = arrayList.stream().filter(item -> item%2==0).findFirst().orElse(null);
        return arrayList.indexOf(firstEven);
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (arrayList.size()!=this.arrayList.size()){
            return false;
        }
        else{
            Collections.sort(arrayList);
            Collections.sort(this.arrayList);
            for(int i =0; i<arrayList.size(); i++){
                if (!arrayList.get(i).equals(this.arrayList.get(i))){
                    return false;
                }
            }
            return true;
        }
    }

    public Double getMedianInLinkList(SingleLink singleLink) {

        throw new NotImplementedException();
    }

    public int getLastOdd() {
        Collections.reverse(arrayList);
        int lastEven = arrayList.stream().filter(item -> item%2!=0).findFirst().orElse(null);
        return lastEven;
    }

    public int getIndexOfLastOdd() {
        Collections.reverse(arrayList);
        int length = arrayList.size();
        int lastEven = arrayList.stream().filter(item -> item%2!=0).findFirst().orElse(null);
        return length-1-arrayList.indexOf(lastEven);
    }
}
