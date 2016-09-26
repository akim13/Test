package com.company;

/**
 * Created by akim on 20.09.2016.
 */
public class Arr {

    public static void sort(String[] array) {
        for (int i = 0; i<=array.length/2; i++){
            String tmp = array[i];
            array[i]= array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }

    }
}
