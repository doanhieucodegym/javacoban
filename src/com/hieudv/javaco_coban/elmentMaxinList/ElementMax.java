package com.hieudv.javaco_coban.elmentMaxinList;

import java.util.List;
import java.util.Objects;

public class ElementMax {
    public static void main(String[] args) {
        // su dụng ham
        int[] arr = {1,3,4,5,10};
      int max =max(arr);
        System.out.println("so lon nhat" + max);


    }
    public static int max(int[] a){
        int temp =a[0];
        for(int i =0 ; i <a.length; i++){
            if(a[i] > temp){
                temp = a[i] ;
            }
        }
        return temp;
    }
    public static void reverses(int [] arr){

        for(int i =0; i <arr.length/2 ; i++){
            int temp =  arr[i];
            arr[i] =arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;
        }
        System.out.println(arr);
    }
}
