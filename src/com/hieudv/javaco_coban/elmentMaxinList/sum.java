package com.hieudv.javaco_coban.elmentMaxinList;

public class sum {
    public static void main(String[] args) {

    }
    public static int sum( int arr[] ,int sum,int i){
        while( i < arr.length){
            sum = sum +arr[i] ;
            i++;
        }
        return sum;
    }
}
