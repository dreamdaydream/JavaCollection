package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        try{
            if (leftBorder> rightBorder){
                int temp = leftBorder;
                leftBorder=rightBorder;
                rightBorder=temp;
            }
            int begin = leftBorder;
            if (leftBorder%2!=0){
                begin = leftBorder+1;
            }
            int sum =0;
            for(int i = begin;i<=rightBorder;i=i+2) {
                sum += i;
            }
            return sum;
        }
        catch (NotImplementedException e) {
            throw new NotImplementedException();
        }
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        try{
            if (leftBorder> rightBorder){
                int temp = leftBorder;
                leftBorder=rightBorder;
                rightBorder=temp;
            }
            int begin = leftBorder;
            if (leftBorder%2==0){
                begin = leftBorder+1;
            }
            int sum =0;
            for(int i = begin;i<=rightBorder;i=i+2) {
                sum += i;
            }
            return sum;
        }
        catch (NotImplementedException e) {
            throw new NotImplementedException();
        }
    }


    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        try{
            int sum =0;
            for(int list :arrayList){
                sum = sum+list*3+2;
            }
            return sum;
        }catch (NotImplementedException e) {
            throw new NotImplementedException();
        }
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        try{
            List<Integer> result = new ArrayList<>();
            for (int value : arrayList){
                if (value%2 == 0){
                    result.add(value);
                }
                else{
                    result.add(value*3+2);
                }
            }
            return result;
        }catch (NotImplementedException e) {
            throw new NotImplementedException();
        }
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        try{
            int sum =0;
            for(int list :arrayList) {
                if (list % 2 != 0) {
                    sum = sum + list * 3 + 5;
                }
            }
            return sum;
        } catch (NotImplementedException e) {
            throw new NotImplementedException();
        }
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        try{
            double middle =0;
            List<Integer> even = new ArrayList<>();
            for (int value : arrayList) {
                if (value % 2 == 0) {
                    even.add(value);
                }
            }
            int length = even.size();
            Collections.sort(even) ;
            if (length%2==0){
                middle=(even.get(length/2)+even.get(length/2-1))/2.0;
            }
            else{
                middle = even.get((length-1)/2);
            }
            return middle;

        }catch (NotImplementedException e) {
            throw new NotImplementedException();
        }
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        try{
            double average,sum=0;
            int count = 0;
            for (int list: arrayList){
                if(list%2==0){
                    sum = sum+list;
                    count++;
                }
            }
            average=sum/count;
            return average;

        }catch (NotImplementedException e){
            throw new NotImplementedException();
        }
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        try{
            List<Integer> even = new ArrayList<>();
            for (int value : arrayList) {
                if (value % 2 == 0) {
                    even.add(value);
                }
            }
            if (even.contains(specialElment)){
                return true;
            }
            else{
                return false;
            }


        }catch (NotImplementedException e){
            throw new NotImplementedException();
        }
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        try{
            List<Integer> even = new ArrayList<>();
            for (int value : arrayList) {
                if (even.contains(value)||value%2!=0) {
                    continue;
                }
                else{
                    even.add(value);
                }
            }
            return even;

        }catch (NotImplementedException e){
            throw new NotImplementedException();
        }
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        try{
            List<Integer> even =new ArrayList<>();
            List<Integer> odd =new ArrayList<>();
            for (int value: arrayList){
                if (value%2==0){
                    even.add(value);
                }
                else{
                    odd.add(value);
                }
            }
            Collections.sort(even);
            Collections.sort(odd,Collections.reverseOrder());
            even.addAll(odd);
            return even;

        }catch (NotImplementedException e){
            throw new NotImplementedException();
        }
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        try{
            List<Integer> result = new ArrayList<>();
            for (int i =0; i<arrayList.size()-1;i++){
                result.add((arrayList.get(i)+arrayList.get(i+1))*3);
            }
            return result;

        }catch (NotImplementedException e){
            throw new NotImplementedException();
        }
    }

}
